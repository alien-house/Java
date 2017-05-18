package com.company;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created by shinji on 2017/05/16.
 */
public class Menu {
    Menu(String[] cdList){
        boolean isLock = true;
        while (isLock) {
            System.out.println("::::::::::::::::::::::MENU::::::::::::::::::::::");
            System.out.println("[1] List All CDs");
            System.out.println("[2] List All Your PlayListMaker(and edit)");
            System.out.println("[3] Create New Playlist");
            System.out.println("[4] Exit");
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");

            try {
                Scanner fn = new Scanner(System.in);
                if (fn.hasNextInt()) {
                    int number = fn.nextInt();
                    switch (number){
                        case 1:
                            CDMaker allCDs = new CDMaker(cdList);
                            menuCD(allCDs);
                            break;
                        case 2:
                            PlayListMaker myPlayListMaker = new PlayListMaker();
                            menuPlayList(myPlayListMaker);
                            break;
                        case 3:
                            menuCreate();
                            break;
                        case 4:
                            isLock = false;
                            break;
                    }
                }

            }catch (Exception e){

            }
        }
    }



    public void menuPlayList(PlayListMaker myPlayListMaker) {

        System.out.println("");

        boolean isLock = true;
        while (isLock) {
            System.out.println("\"Which PlayList do you want to see in detail?\"");
            System.out.println("");
            myPlayListMaker.getAllPlayListTitle();
            Scanner listus = new Scanner(System.in);

            if (listus.hasNextInt()) {
                int num = listus.nextInt();
                myPlayListMaker.getInfoAllTrack(num);
                switch (num) {
                    case 0:
                        isLock = false;
                        break;
                    default:
                        break;
                }
            }
        }
    }



    public void menuCD(CDMaker allCDs){
        boolean isLock = true;
        while (isLock) {
            System.out.println("\"Which CD do you want to see in detail?\"");
            System.out.println("");
            allCDs.getAllCDTitle();
            Scanner listus = new Scanner(System.in);

            if (listus.hasNextInt()) {
                int num = listus.nextInt();
                allCDs.getInfoAllTrack(num);
                switch (num) {
                    case 0:
                        isLock = false;
                        break;
                    default:
                        break;
                }
            }
        }
    }


    public void menuCreate(){
        BufferedWriter bw = null;

        try{
            //
            JSONObject track = new JSONObject();
            JSONObject tracks = new JSONObject();
            JSONArray pl = new JSONArray();
            JSONObject obj = new JSONObject();

            track.put("no","1");
            track.put("title","mileminie");
            track.put("time","12:14");
            tracks.put("track",track);
            tracks.put("name","南アじゃらほい");
            pl.put(tracks);
            obj.put("Playlist",pl);
            //

            File myPLJson = new File("Playlist.json");
            if (!myPLJson.exists()) {
                myPLJson.createNewFile();
            }

            FileWriter fw = new FileWriter(myPLJson,true);
            bw = new BufferedWriter(fw);

            System.out.println(obj.toString());
            bw.write(obj.toString());

            boolean isLock = true;
            int flow = 1;
            while (isLock) {
                switch (flow) {
                    case 1:
                        System.out.println("\"name?\"");
                        System.out.println("");
                        Scanner listus = new Scanner(System.in);
                        if (listus.hasNextLine()) {
                            String namePlayList = listus.next();
                            tracks.put("name",namePlayList);
                            flow = 2;
                        }
                        break;
                    case 2:
                        System.out.println("\"Which song do you want to add?\"");
                        System.out.println("");
                        Scanner numSong = new Scanner(System.in);
                        if (numSong.hasNextLine()) {
                            int numSongNum = numSong.nextInt();
                            if(numSongNum == 0){
                                flow = 0;
                            }
                            System.out.println(numSongNum);
                        }
                        break;
                    case 0:
                        isLock = false;
                        break;
                    default:
                        break;
                }

            }


        }catch (Exception e){

        }finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception ex) {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }
        }



    }





}
