package com.company;

/**
 * Created by shinji on 2017/05/11.
 */
public class Standard {

    public static void main(String[] args) {
//        set_array1();
        pass_string_array();
    }



    /* ================================ */
    // Standard usage
    public static void set_array1(){

        int bucket[] = new int[10];
        int[] bucket2 = new int[10];
        int bucket3[] = {2,5,7,3,14};

        bucket[0] = 90;
        bucket2[2] = 5;
//      bucket3[9] = 23;// error occur

        System.out.println(bucket[9]);
        System.out.println(bucket2[0]);
//      System.out.println(bucket[90]);// error occur

        String bucket_string[] = new String[12];
        boolean bucket_boolean[] = new boolean[2];
        double bucket_double[] = new double[90];

        /*
         [other Datatype]
         byte / short / int / long / float / double / boolean / char
        */
    }






    /* ================================ */
    // Getting all values of array using for loop
    public static void pass_string_array(){

        String array[] = {
                "Hi",
                "Hello",
                "Good Afternoon",
                "Good night"
        };
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }

    }





}
