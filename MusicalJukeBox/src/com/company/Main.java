package com.company;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    BufferedReader br = null;
    public static void main(String[] args) {
//        ArrayList<CD> cdList = new ArrayList(,"");
        String[] cdList = {
            "Purpose-Justin Bieber",
            "OceanWave-Copenhagen"
        };

        System.out.println("::::::::::::::::::::::MENU::::::::::::::::::::::");
        System.out.println("[1] List All CDs");
        System.out.println("[2] List All Your PlayLists(and edit)");
        System.out.println("[3] Create New Playlist");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");

        BufferedWriter bw = null;
        try {
            Scanner fn = new Scanner(System.in);

            if (fn.hasNextInt()) {
                int number = fn.nextInt();
                switch (number){
                    case 1:
                        CDMaker allCDs = new CDMaker(cdList);
//                        allCDs.getAllCDTitle();
                        break;
                    case 2:
                        PlayLists myPlayLists = new PlayLists();
                        break;
                    case 3:

                        JSONObject obj = new JSONObject();
                        JSONObject obj2 = new JSONObject();
                        obj2.put("artist","borongo borongo");
                        obj.put("kokoko songs",obj2);
                        File myPLJson = new File("Playlist.json");
                        if (!myPLJson.exists()) {
                            myPLJson.createNewFile();
                        }
                        FileWriter fw = new FileWriter(myPLJson);
                        bw = new BufferedWriter(fw);
                        bw.write(obj.toString());

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
