package com.company;

/**
 * Created by shinji on 2017/05/11.
 */
public class GoTooFar {

    public static void main(String[] args) {
//        int array[] = new int[5];
        int array[] = {234,52,12,53,63};

        try{
            for (int i = 0; i < 99; i++) {
                System.out.println(array[i]);
            }
//            for(int item:array){
//                System.out.println(item);
//            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Now you’ve gone too far!"+e);
        }
    }




}
