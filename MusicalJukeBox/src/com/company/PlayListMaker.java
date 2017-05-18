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
    private List<PlayList> PlayListALLList = new ArrayList<PlayList>();
    BufferedReader br = null;
    PlayListMaker(){
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

//            JSONArray playlistArray = new JSONArray();
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

        } catch (IOException e) {

        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in closing the BufferedReader");
            }
        }

//        JSONObject obj = new JSONObject();
//        JSONObject obj2 = new JSONObject();
//        obj2.put("text","kyakyta");
//        obj.put("name",obj2);
//        System.out.print(obj.toString());

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
}
