package com.company;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shinji on 2017/05/16.
 */
public class PlayList {
    protected String title = "No Title";
    private List<Song> trackList = new ArrayList<Song>();

    PlayList(Object tracklist){
        JSONObject object = (JSONObject) tracklist;
        this.title = object.getString("name");
        JSONArray songArray =  object.getJSONArray("track");
        for (int i = 0; i < songArray.length(); i++) {
            JSONObject songObj = (JSONObject) songArray.get(i);
            Song song = new Song(songObj.getInt("no"),songObj.getString("title"),songObj.getString("time"));
            trackList.add(song);
        }

    }

    public void getAllSongs(){
        int i = 1;
        for (Song song : trackList) {
            System.out.println("["+i+"]" + song.getTitle() + "(" + song.getTime()+ ")");
            i++;
        }
    }

    public String getTitle(){
        return this.title;
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
