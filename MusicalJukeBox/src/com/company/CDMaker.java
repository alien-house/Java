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

/**
 * Created by shinji on 2017/05/12.
 */
public class CDMaker {
//    String[] cdList;
    private List<String> cdList = new ArrayList<String>();
    BufferedReader br = null;
    CDMaker(String[] cdList){
        this.cdList = Arrays.asList(cdList);
        this.cdList.forEach(i -> makeCD(i));
    }

    public void makeCD(String cdName){
//        System.out.println("😡"+cdName);
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        InputStream input;
        String url = "cd/"+cdName+".json";
        try {
//            String genreJson = IOUtils.toString(new URL(url));
//            JSONObject json = new JSONObject(genreJson);
//            System.out.println(CDL.toString(new JSONArray(json)));



//            String url = "cd/"+cdName+".json";
//            String genreJson = IOUtils.toString(new URL(url));
//            JSONObject json = new JSONObject(genreJson);
//            System.out.println("😡"+genreJson);


//            input = new FileInputStream("cd/"+cdName+".json");
//            int size = input.available();
//            bis = new BufferedInputStream(input);
//            byte[] buffer = new byte[size];
//            input.read(buffer);
//            input.close();
//
//            String json = new String(buffer);
//            JSONObject jsonObject = new JSONObject(json);
//            System.out.println("😡"+bis);







//            FileReader fr = new FileReader("cd/"+cdName+".json");
////            File file = new File("cd/"+cdName+".json");
//            fis = new FileInputStream(file);
//            bis = new BufferedInputStream(fis);
            br = new BufferedReader(new FileReader("cd/"+cdName+".json"));
            String str = br.readLine();
            String afStr = "";
            while (str != null) {
//                System.out.println(str);
                afStr = afStr + str;
                str = br.readLine();
            }
//            System.out.println("😏"+afStr);
            JSONObject object = (JSONObject) new JSONTokener(afStr).nextValue();
            String query = object.getString("name");
            System.out.println("😡"+query);
//            JSONArray locations = object.getJSONArray("locations");
//




        } catch (IOException e) {
//            ioe.printStackTrace();
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
        cdList.forEach(i ->
                System.out.println("Item : " + i)
        );
    }

}
