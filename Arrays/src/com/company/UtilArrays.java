package com.company;

import java.util.Arrays;

/**
 * Created by shinji on 2017/05/11.
 */
public class UtilArrays {
    public static void main(String[] args) {
//        method_search();
//        method_comparison();
//        method_fill();
//        method_copy();
        method_sort();
    }






    /* ================================ */
    // binarySearch : Searching the specified array of (ints) for the specified value using the binary search algorithm
    public static void  method_search() {
        int[] array = { 2, 51, 90, 14 };
        int key = 90;
        int KeyPosition = Arrays.binarySearch(array, key);
        System.out.println("Key Position is " + KeyPosition); // Key Position is 2
    }







    /* ================================ */
    // equals : Returns true if the two arrays of (chars) are equal.
    public static void method_comparison() {
        char[] array1 = { 'A', 'B', 'C', 'D' };
        char[] array2 = { 'T', 'R', 'W', 'Q' };
        char[] array3 = { 'A', 'B', 'C', 'D' };
        boolean boo = Arrays.equals(array1, array2);
        System.out.println("array and array2 equal: " + boo);
        boolean boo2 = Arrays.equals(array1, array3);
        System.out.println("array and array3 equal: " + boo2);
    }








    /* ================================ */
    // fill : You can initilize all data of array
    public static void method_fill() {
        String[] array = {
                "Hi",
                "Hello",
                "Good Afternoon",
                "Good night"
        };
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }

        Arrays.fill(array,"#");

        System.out.println("======== After Fill ==========");
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }








    /* ================================ */
    // copyOf : You can copy from one array to new array.
    public static void  method_copy() {
        double[] array = { 2.54, 93.547, 1.2, 693.01 };

        // copying array array1 to array2 with newlength as 5
        double[] array2 = Arrays.copyOf(array, 15);

        for (int i = 0; i < array2.length; i++){
            System.out.println(i+" : " +array2[i]);
        }

    }








    /* ================================ */
    // sort : into ascending numerical order.
    public static void  method_sort() {
        long[] array = { 254, 9347, 12, 6931 };
        for (long number : array) {
            System.out.println("Number = " + number);
        }
        Arrays.sort(array);
        System.out.println("======== After sort ==========");
        for (long number : array) {
            System.out.println("Number = " + number);
        }
    }




}
