package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        quesA();
//        quesB();
    }

    public static void SR15_5() {
        // Q.SR15_5 What are the trade-offs in time complexity between an ArrayList and a LinkedList?
        // A.
    }

    public static void SR15_4() {
        // Q.SR15_4 What are the trade-offs in space complexity between an ArrayList and a LinkedList?
        // A.
    }


    public static void srQuestion15_6() {
        // Q.15.6 What is the time complexity of the contains operation and the find operation for both implementations?
        // A.
    }
    public static void srQuestion15_2() {
        // Q.15.2 What are the basic methods for accessing an indexed list?
        // A. positional (indexed) access
    }

    public static void srQuestion15_1() {
        // Q.15.1 What is the difference between an indexed list, an orderd list, and an unorderd list?
        // A. whose elements are ordered by some inherent characteristics of the element.
    }

    public static void quesB() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
//        list = Arrays.asList(1,2,3,4,5,6,7);


        int sn = list.size();
        for (int i = sn/2; i < sn; i*=2){
//            list.remove(i);
            System.out.println(i-1);
        }

        System.out.println("======================");

        for(Integer s:list){
            System.out.println(s);
        }
    }


    public static void quesA(){

        ArrayList<Integer> simply = new ArrayList<>();
        simply.add(10);
        simply.add(20);
        simply.add(30);
        simply.add(40);
        simply.add(50);
        simply.add(60);
        simply.remove(3);
        for(Integer s:simply){
            System.out.println(s);
        }


    }
}
