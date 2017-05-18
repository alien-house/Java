package com.company;

import org.json.JSONObject;

import java.text.DecimalFormat;
import java.util.Date;

/**
 * Created by shinji on 2017/05/14.
 */
public class Song {
    private int no = 0;
    private String title = "No Title";
    private String time = "0:00";
    private int timeSecond = 0;
    Song(int no,String title, String time){
        this.no = no;
        this.title = title;
        this.time = time;
//        this.timeSecond = timeSecond;
//        this.time = getStringTime(timeSecond);
    }

    private String getStringTime(int seconds) {
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

    public String getTitle(){
        return this.title;
    }
    public String getTime(){
        return this.time;
    }


}
