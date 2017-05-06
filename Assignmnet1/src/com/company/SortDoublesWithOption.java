package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by shinji on 2017/05/05.
 */
public class SortDoublesWithOption {

    public static void main(String[] args) {

        ArrayList<Double> array = new ArrayList<Double>();
        array.add(13.32);
        array.add(42345.43);
        array.add(123.443);
        array.add(7465.7);
        array.add(34574.4);
        array.add(224.552);
        array.add(3.6);
        array.add(1.0);
        array.add(523.5);
        array.add(1573.42);
        array.add(846.1);
        array.add(473.1);
        array.add(347.8);
        array.add(4654.7);
        array.add(3667.68);

        boolean isLock = true;

        while (isLock){
            System.out.println("You can order this array.");
            System.out.println("[1] Ascending ");
            System.out.println("[2] Descending");
            System.out.println("[9] Exit");
            Scanner number = new Scanner(System.in);
            int a = number.nextInt();
            switch (a) {
                case 1:
                    array.sort((p2, p1) -> p2.compareTo(p1));
                    System.out.println(array);
                    break;
                case 2:
                    array.sort((p1, p2) -> p2.compareTo(p1));
                    System.out.println(array);
                    break;
                case 9:
                    System.out.println("Good bye");
                    isLock = false;
                    break;
                default :
                    break;
            }
        }



    }


}
