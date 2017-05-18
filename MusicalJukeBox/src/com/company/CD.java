package com.company;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shinji on 2017/05/12.
 */
public class CD extends Medium {
    private List<Song> trackList = new ArrayList<Song>();

    CD(String title, String artist, double price, JSONArray tracklist){
        super(title,artist,price);
        for (int i = 0; i < tracklist.length(); i++) {
            JSONObject object = (JSONObject) tracklist.get(i);
            Song song = new Song(object.getInt("no"),object.getString("title"),object.getString("time"));
            trackList.add(song);
        }
    }

    public void getAllSongs(){
        int i = 1;
        System.out.println("💿"+this.title + " : " +this.artist);
        for (Song song : trackList) {
            System.out.println("["+i+"]" + song.getTitle() + "(" + song.getTime()+ ")");
            i++;
        }
    }

    public JSONObject getSongInfo(int i){
        JSONObject obj = new JSONObject();
        String nos = Integer.toString(trackList.get(i).getNo());
        obj.put("no",nos);
        obj.put("title",trackList.get(i).getTitle());
        obj.put("time",trackList.get(i).getTime());

        return obj;
    }



}
