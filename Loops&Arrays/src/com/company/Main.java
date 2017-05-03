package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        question1_7();
//        question8();
//        question9();
        question10();

    }

    public static void question10() {
        System.out.println("◆question10");



    }

    public static void question9() {
        System.out.println("◆question9");
        System.out.println("Please input a single character");
        Scanner txt = new Scanner(System.in);
        String a = txt.next();


        if(!(a instanceof String) || a.length() > 1){
            System.out.println("[error message]bye bye...");
            return;
        }

        if(isVowel(a.charAt(0))){
            System.out.println("Output is Vowel");
        }else if(isConsanant(a.charAt(0))){
            System.out.println("Output is Consonant");
        }else{
            System.out.println("[error message]bye bye...");
            return;
        }


    }

    public static void question8() {
        System.out.println("◆question8");
        System.out.println("Please input a number");
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        if(a > 0){
            System.out.println("Output is Positive");
        }else if(a < 0){
            System.out.println("Output is Negative");
        }else{
            System.out.println("Output is Both");
        }
        System.out.println("Output is "+a);
    }


    public static void question1_7() {

        // Q1. a
        int q = 3;
        if(q > 0) System.out.println("XXX");

        //Q2. c
        int t = 10; // needed Datatype
        if(t > 7){
            System.out.print("AAA");
            System.out.print("BBB");
        }

        //Q3. d. nothing
        int tt = 7;
        if(tt > 7) {
            System.out.print("AAA");
            System.out.println("BBB");
            System.out.println(" ");
        }

        //Q4. d. &&

        //Q5. c. ||

        //Q6. d. break

        //Q7. b. assigns 2 to x (or there is not such a syntax)
        int w = 15,x;
        x = w == 15 ? 2 : 0;
        System.out.println("x is "+x);


    }

    public static boolean isVowel(char c){
        String vowels = "aeiouAEIOU";
        return vowels.contains(String.valueOf(c));
    }

    public static boolean isConsanant(char c){
        String cons = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        return cons.contains(String.valueOf(c));
    }

}
