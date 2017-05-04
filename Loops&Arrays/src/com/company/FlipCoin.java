package com.company;

/**
 * Created by shinji on 2017/05/04.
 */
public class FlipCoin {

    public static void main(String[] args) {

//        System.out.println(num);


        boolean isLock = true;
        int done_num = 1;
        int end_num = 10;

        while (isLock) {

            double num =  Math.random();
            if(num < 0.5){
                System.out.println("heads");
            }else{
                System.out.println("tails");
            }

            if(done_num >= end_num){
                isLock = false;
                System.out.println("Thank you for playing.");
            }

            done_num++;
        }






    }





}
