package com.company;

/**
 * Created by shinji on 2017/05/04.
 */
public class Part5ArraysArraylist {

    public static void main(String[] args) {
        question1_7();

    }

    public static void question1_7() {
        //Q.01 : b. two-dimensional

        //Q.02 : c. 4
        //char[,] day = new char[2, 3] { { 'o', 'n', 'e' }, { 't', 'w', 'o' } };
        //In the  preceding piece of code, there are 3 rows and 2 columns;

        //Q.03 : d. 'V'
//        char[][] code = {{ 'A', 'D', 'M'},
//                { 'P', 'R', 'S'},
//        { 'U', 'V', 'Z'}};
//        System.out.println( code[2][1]);

        //Q.04 : d. "901 Linden "
        String[][] address = {{ "123 Oak","345 Elm"}, { "87 Maple","901 Linden"}};
        System.out.println( address[1][1] );

        //Q.05 : a. 2
        double[][] fees = {{3.00, 3.50, 4.00, 5.00}, {6.35, 7.35, 8.35, 9.00}};
        System.out.println( fees.length);

        //Q.06 : b. 4
        double[][] fees2 = {{3.00, 3.50, 4.00, 5.00}, {6.35, 7.35, 8.35, 9.00}};
        System.out.println( fees2[1].length);

        //Q.07 : c. is dynamically resizable


        //Q.08 : Write a Java program to add and multiply two matrices of the same size





    }
}
