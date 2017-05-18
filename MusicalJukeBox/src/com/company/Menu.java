package com.company;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.*;
import java.util.Scanner;

/**
 * Created by shinji on 2017/05/16.
 */
public class Menu {
    CDMaker allCDs;
    String JSONPATH = "Playlist.json";
    Menu(String[] cdList){
        allCDs = new CDMaker(cdList);
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
        BufferedReader br = null;
        try{
            JSONArray track = new JSONArray();
            JSONObject tracks = new JSONObject();
            JSONObject obj = new JSONObject();
            JSONArray playlistArray;
//            track.put("no","1");
//            track.put("title","mileminie");
//            track.put("time","12:14");
//            tracks.put("track",track);
//            tracks.put("name","南アじゃらほい");
//            pl.put(tracks);
//            obj.put("Playlist",pl);
            File myPLJson = new File(JSONPATH);
            if (!myPLJson.exists()) {
                myPLJson.createNewFile();
            }
            //READ JSON
            br = new BufferedReader(new FileReader(JSONPATH));
            String str = br.readLine();
            String afStr = "";
            while (str != null) {
                afStr = afStr + str;
                str = br.readLine();
            }
            if(!afStr.isEmpty()){
                JSONObject object = (JSONObject) new JSONTokener(afStr).nextValue();
                playlistArray =  object.getJSONArray("Playlist");
            }else{
                playlistArray = new JSONArray();
            }
            //
            FileWriter fw = new FileWriter(myPLJson);
            bw = new BufferedWriter(fw);

            boolean isLock = true;
            int flow = 1;
            String namePlayList = "";
            while (isLock) {
                switch (flow) {
                    case 1:
                        System.out.println("\"What's your Playlist's name?\"");
                        System.out.println("");
                        Scanner listus = new Scanner(System.in);
                        if (listus.hasNextLine()) {
                            namePlayList = listus.next();
                            tracks.put("name", namePlayList);
                            flow = 2;
                        }else{
                        }
                        break;
                    case 2:
                        boolean isLockCho = true;
                        while (isLockCho) {
                            System.out.println("\"Which CD do you want to see for adding your Playlist?\"");
                            System.out.println("");
                            allCDs.getAllCDTitle();
                            Scanner cdsan = new Scanner(System.in);
                            if (cdsan.hasNextInt()) {
                                int num = cdsan.nextInt();
                                switch (num) {
                                    case 0:
                                        tracks.put("track", track);
                                        playlistArray.put(tracks);
                                        obj.put("Playlist",playlistArray);
                                        bw.write(obj.toString());
                                        isLockCho = false;
                                        flow = 0; // finished
                                        break;
                                    default:
                                        allCDs.getInfoAllTrack(num);
                                        boolean isLockChoSong = true;
                                        while (isLockChoSong) {
                                            System.out.println("\"Which song do you want to add your Playlist?\"");
                                            Scanner n = new Scanner(System.in);
                                            //then, num is CD's number
                                            if (n.hasNextInt()) {
                                                int ns = n.nextInt(); // song number
                                                switch (ns) {
                                                    case 0:
                                                        isLockChoSong = false;
                                                        break;
                                                    default:
                                                        track.put(allCDs.getTrackFromCD(num, ns));
                                                        System.out.println("tracks::"+track);
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                }
                            }
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
                if (br != null) {
                    br.close();
                }
            } catch (Exception ex) {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }
        }
    }




}
