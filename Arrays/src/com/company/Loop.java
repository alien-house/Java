package com.company;

/**
 * Created by shinji on 2017/05/11.
 */
public class Loop {
    public static void main(String[] args) {
        enhanced_loop();
    }

    public static void  enhanced_loop() {
        boolean[] boo = {true, false, true, true};
        for(boolean item: boo){
            System.out.println(item);
        }
    }


}
