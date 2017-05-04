package com.company;

import java.util.*;

/**
 * Created by shinji on 2017/05/04.
 */
public class Median {
    public static void main(String[] args) {

        ArrayList<Double> array = new ArrayList<Double>();

        int repeat = 9;
        for (int a = 1; a <= repeat; a++) {
            System.out.println("enter nine double values!["+(a)+"]");
            Scanner number = new Scanner(System.in);
            double inputNum = number.nextDouble();
            array.add(inputNum);
        }

//        int array[] = {1,2,3,5,8};
        double num = array.size();
        int median_num = (int)Math.round(num/2) - 1;
        System.out.println( "the median is "+array.get(median_num));

    }
}
