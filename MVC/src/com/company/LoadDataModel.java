package com.company;

/**
 * Created by shinji on 2017/05/26.
 */
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.*;

public class LoadDataModel {

    public Boolean setTextData(String fileName, String str){
        File file = new File(fileName);
        FileOutputStream fos = null;
        Boolean isSaved = false;
        try {
            fos = new FileOutputStream(file);
            if (!file.exists()) {
                file.createNewFile();
            }
            byte[] bytesArray = str.getBytes();
            fos.write(bytesArray);
            fos.flush();
            System.out.println("File Written Successfully");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                    isSaved = true;
                }
            } catch (IOException ioe) {
                isSaved = false;
                System.out.println("Error in closing the Stream");
            }
        }
        return isSaved;
    }


    public String getTextData(String fileName){
        String filecContents = "";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
            String str = br.readLine();
            while (str != null) {
                filecContents += str + "\n";
                str = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in closing the BufferedReader");
            }
        }
        return filecContents;
    }


}
