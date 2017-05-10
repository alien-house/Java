package com.company;

import java.io.*;

/**
 * Created by shinji on 2017/05/10.
 */
public class ReadFileDemoSin {

    public static void main(String[] args) {

        File file = new File("text.txt");
        FileInputStream fis = null;
        BufferedInputStream bis = null;

        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            while (bis.available() > 0) {
                System.out.print((char) bis.read());
            }
        }catch (FileNotFoundException fnfe){
            System.out.println("The specified file not found" + fnfe);
        } catch (IOException ioe) {
            System.out.println("I/O Exception: " + ioe);
        }

    }


}
