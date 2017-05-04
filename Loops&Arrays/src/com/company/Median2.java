package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by shinji on 2017/05/04.
 */
public class Median2 {
    public static void main(String[] args) {

        ArrayList<Double> array = new ArrayList<Double>();

        int repeat = 4;
        for (int a = 1; a <= repeat; a++) {
            System.out.println("enter nine double values!["+(a)+"]");
            Scanner number = new Scanner(System.in);
            double inputNum = number.nextDouble();
            array.add(inputNum);
        }

//        int array[] = {1,2,3,5,8};
        double num = array.size();
        double num_av = 0;

        if(num%2 == 0){
            int median_num = (int)Math.round(num/2) - 1;
            num_av = (array.get(median_num)+array.get(median_num+1)) / 2;
            System.out.println( "your list is even.so..");
            System.out.println( "the median is "+num_av);
        }else{
            int median_num = (int)Math.round(num/2) - 1;
            System.out.println( "the median is "+array.get(median_num));
        }


    }


}
