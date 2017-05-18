package com.company;

import org.json.*;
import org.apache.commons.io.IOUtils;

import javax.sound.midi.SysexMessage;
import java.net.URL;
import java.net.URI;
import java.io.*;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by shinji on 2017/05/12.
 */
public class CDMaker {
//    String[] cdList;
    private List<String> CDStringList = new ArrayList<String>();
    private List<CD> CDALLList = new ArrayList<CD>();
    BufferedReader br = null;
    CDMaker(String[] cdList){
        this.CDStringList = Arrays.asList(cdList);
        this.CDStringList.forEach(i -> makeCD(i));
    }

    public void makeCD(String cdName){
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        InputStream input;
        String url = "cd/"+cdName+".json";
        try {
            br = new BufferedReader(new FileReader("cd/"+cdName+".json"));
            String str = br.readLine();
            String afStr = "";
            while (str != null) {
                afStr = afStr + str;
                str = br.readLine();
            }
            JSONObject object = (JSONObject) new JSONTokener(afStr).nextValue();
            String name = object.getString("name");
            String artist = object.getString("artist");
            double price = object.getDouble("price");
            JSONArray tracklistarray = object.getJSONArray("track");

            CD cd = new CD(name,artist,price,tracklistarray);
            CDALLList.add(cd);

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

    }


    public void getAllCDTitle(){
        int i = 1;
        for (CD cd : CDALLList) {
            System.out.println("["+i+"]" + cd.getTitle()+" : "+cd.getArtist());
            i++;
        }
        System.out.println("[0]↩︎Back to the menu");

//        CDALLList.forEach(i ->
//                System.out.println("["+a+"]" + i)
//                a++
//        );
    }

    public void getInfoAllTrack(int num){
        int i = 1;
        CDALLList.get(num-1).getAllSongs();
        System.out.println("[0]↩︎Back to selecting CDs");
    }

    public JSONObject getTrackFromCD(int CDnum, int Tracknum){
        CD cd = CDALLList.get(CDnum-1);
        JSONObject song = cd.getSongInfo(Tracknum-1);
        return song;
//        CDALLList.get(num-1).getAllSongs();
    }

}
