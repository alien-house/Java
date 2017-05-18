package com.company;
import org.json.*;
import org.apache.commons.io.IOUtils;

import javax.sound.midi.SysexMessage;
import java.net.URL;
import java.net.URI;
import java.io.*;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.*;
import java.util.Arrays;

/**
 * Created by shinji on 2017/05/12.
 */
public class PlayListMaker {
    private List<PlayList> PlayListALLList;
    BufferedReader br = null;
    PlayListMaker(){
        reloadPlayList();
    }

    public void reloadPlayList() {

        PlayListALLList = new ArrayList<PlayList>();
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        InputStream input;
        String url = "Playlist.json";
        try {
            br = new BufferedReader(new FileReader(url));
            String str = br.readLine();
            String afStr = "";
            while (str != null) {
                afStr = afStr + str;
                str = br.readLine();
            }
            JSONObject object = (JSONObject) new JSONTokener(afStr).nextValue();
            JSONArray playlistArray =  object.getJSONArray("Playlist");
//            Iterator x = object.keys();
//            while (x.hasNext()){
//                String key = (String) x.next();
//                playlistArray.put(object.get(key));
//            }

            for (int i = 0; i < playlistArray.length(); i++) {
                PlayList playList = new PlayList(playlistArray.get(i));
                PlayListALLList.add(playList);
            }

        } catch (org.json.JSONException e) {
            System.out.println(e);
//            System.out.println("You don't have any PlayList yet.");
//            System.out.println("Please go to \"[3] Create New Playlist\"");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in closing the BufferedReader");
            }
        }

    }


    public void getAllPlayListTitle() {
        int i = 1;
        for (PlayList pl : PlayListALLList) {
            System.out.println("[" + i + "]" + pl.getTitle());
            i++;
        }
        System.out.println("[0]↩Back to the menu");
    }

    public void getInfoAllTrack(int num){
        int i = 1;
        PlayListALLList.get(num-1).getAllSongs();
    }


    public JSONObject getTrackFromPL(int PLnum, int Tracknum){
        PlayList playList = PlayListALLList.get(PLnum-1);
        JSONObject song = playList.getSongInfo(Tracknum-1);
        return song;
//        CDALLList.get(num-1).getAllSongs();
    }


}
