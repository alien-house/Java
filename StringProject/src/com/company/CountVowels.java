package com.company;
import java.util.*;

/**
 * Created by shinji on 2017/05/02.
 */
public class CountVowels {

    public static void main(String[] args) {
        // write your code here

        question10();

    }

    public static void question10() {
        System.out.println("◆question10");

        String txt = "Home is the place, when you have to go there, they have to take you in.  Robert Frost";
        int numVowels = 0;
        for (int i = 0; i < txt.length(); i++) {
            System.out.println( txt.charAt(i) );
            if( isVowel( txt.charAt(i) ) ) {
                System.out.println( txt.charAt(i)+" is Vowel" );
                numVowels++;
            }
        }
        System.out.println( "The total vowels is " + numVowels );

    }

    public static boolean isVowel(char c){
        String vowels = "aeiouAEIOU";
        return vowels.contains(String.valueOf(c));
    }


}
