package com.company;

import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.*;

public class Main {
    BufferedReader br = null;
    //        ArrayList<CD> cdList = new ArrayList(,"");
    public static void main(String[] args) {

        String[] cdList = {
                "Purpose-Justin Bieber",
                "OceanWave-Copenhagen"
        };
        Menu menu = new Menu(cdList);

    }

    public static String getStringTime(int seconds) {
        String sign = seconds >= 0 ? "" : "-";
        int min = Math.abs(seconds / 60);
        int sec = Math.abs(seconds % 60);
        String separater = ":";
        String ret =
                sign
                        + new DecimalFormat("00").format(min)
                        + separater
                        + new DecimalFormat("00").format(sec);
        return ret;
    }

}