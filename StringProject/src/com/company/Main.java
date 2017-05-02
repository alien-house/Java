package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        question8();
        question9();
        question11();
        question12();
        question13();

    }

    public static void question13() {
        System.out.println("◆question13");
        String original = "same";

        String reverse = "";

        int length = original.length();

        for ( int i = length - 1; i >= 0; i-- ) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("rotation is:"+reverse);


    }

    public static void question12() {
        System.out.println("◆question12");
        String ques12 = "IamIamd";
        String result = "";
        for (int i = 0; i < ques12.length(); i++) {
            if(!result.contains(String.valueOf(ques12.charAt(i)))) {
                result += String.valueOf(ques12.charAt(i)); // adding to new variable
            }
        }

        System.out.println("result:"+result);
    }



    public static void question11() {
        System.out.println("◆question11");
        String ques11 = "¥”It is better to deserve honours and not have them than to have them and not deserve them.¥” – Mark Twain.";

        System.out.println(ques11.indexOf('h')); // search the position
        System.out.println(ques11.charAt(14)); //
        System.out.println(ques11.endsWith("Twain")); //searching the suffix
        System.out.println(ques11.replace('a', 'A'));

    }

    public static void question9() {
        System.out.println("◆question9");
        System.out.println("Write a program to find that given number or string is palindrome or not.");

        String original = "123ff21";
        String reverse = "";

        int length = original.length();

        for ( int i = length - 1; i >= 0; i-- ) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)) { //compare the String
            System.out.println("The string is a palindrome!!!!");
        }else {
            System.out.println("The string is not a palindrome +_+");
        }


    }


    public static void question8() {
        System.out.println("◆question8");

        String q8 = "asfQUIasdEUW";
        for (int i = 0; i < q8.length(); i++) {

            if(isVowel(q8.charAt(i))){
                System.out.println( q8.charAt(i)+" is vowels" );

            }else if(isConsanant(q8.charAt(i))){
                System.out.println( q8.charAt(i)+" is consonants" );

            }
//            if( Character.isUpperCase( q8.charAt(i) ) ) {
//                System.out.println( q8.charAt(i)+" is UpperCase" );
//            }
//            else {
//                System.out.println( q8.charAt(i)+" is Lowercase" );
//            }
        }

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
