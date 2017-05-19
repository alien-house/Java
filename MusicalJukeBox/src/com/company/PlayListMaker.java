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
    String JSONPATH = "Playlist.json";
    JSONObject object;
    JSONArray playlistArray;

    PlayListMaker() {
        reloadPlayList();
    }

    public void reloadPlayList() {

        PlayListALLList = new ArrayList<PlayList>();
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        InputStream input;
        try {
            br = new BufferedReader(new FileReader(JSONPATH));
            String str = br.readLine();
            String afStr = "";
            while (str != null) {
                afStr = afStr + str;
                str = br.readLine();
            }
            object = (JSONObject) new JSONTokener(afStr).nextValue();
            playlistArray = object.getJSONArray("Playlist");

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


    // get all playlist title
    public void getAllPlayListTitle() {
        int i = 1;
        for (PlayList pl : PlayListALLList) {
            System.out.println("[" + i + "]" + pl.getTitle());
            i++;
        }
    }

    // get all track information
    public void getInfoAllTrack(int num) {
        int i = 1;
        PlayListALLList.get(num - 1).getAllSongs();
    }

    // get single track information
    public JSONObject getTrackFromPL(int PLnum, int Tracknum) {
        PlayList playList = PlayListALLList.get(PLnum - 1);
        JSONObject song = playList.getSongInfo(Tracknum - 1);
        return song;
    }


    public void removePlaylist() {

    }


    public void removeTrack(int plNum, int trackNum) {

        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            File myPLJson = new File(JSONPATH);
            FileWriter fw = new FileWriter(myPLJson);
            bw = new BufferedWriter(fw);

            JSONObject userSeletedPL = playlistArray.getJSONObject(plNum - 1);
            JSONArray trackArray = userSeletedPL.getJSONArray("track");
            trackArray.remove(trackNum - 1);//delete
            object.put("Playlist", playlistArray);
            bw.write(object.toString());
        } catch (Exception e) {
        } finally {
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