package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        set_array1();
        array_method();
//        array_2D();
    }


    public static void set_array2(){

        System.out.println("😡");
        int bucket2[] = {2,5,7,3,14};
        bucket2[2] = 5;
//        bucket2[9] = 10; //can not
//        System.out.println(bucket2[9]);

        String bucket_string2[] = {
                "Hi",
                "Hello",
                "Good Afternoon",
                "Good night"
        };
        pass_string_array(bucket_string2);
    }






    public static void  array_2D() {
        // You can create an array of 2 Dimension.
        String[][] list = {
                {"00001", "John", "Smith"},
                {"00002", "Josh", "Henderson"},
                {"00003", "Kash", "Modern"}
        };
        list[2][1] = "Cony";
        list[4][1] = "dd";

        String[][] list2 = {
                {"00001", "John", "Smith"},
                {"00002", "Josh", "Henderson"},
                {"00003", "Kash", "Modern"}
        };
    }

    public static void  array_method() {
        String array[] = {
                "Hi",
                "Hello",
                "Good Afternoon",
                "Good night"
        };
        String[][] list2 = {
                {"00001", "John", "Smith"},
                {"00002", "Josh", "Henderson"},
                {"00003", "Kash", "Modern"}
        };

        /* ================================ */
        // sort : you can sort data  ascending


        /* ================================ */
        // equals : if it's the same, returns true.


        /* ================================ */
        // fill : You can initilize all data of array
        Arrays.fill(array,"#");

        /* ================================ */
        // toString :
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(list2));


        boolean[] boo = {true, false, true, true};
        for(boolean item: boo){
            System.out.println(item);
        }



    }




    public static void pass_string_array(String[] array){
        System.out.println("😩");
        for (String item:array) {
            System.out.println(item);
        }


        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }

    }


}
