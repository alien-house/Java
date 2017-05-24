package com.company;
import java.util.*;

/**
 * Created by shinji on 2017/05/23.
 */
public class listPG {

    public static void main(String[] args) {
        q4();
//        q1();
    }


    public static void q4() {

        List<String> lists = new ArrayList<String>(5);
        lists.add("Java");
        lists.add("Objective-C");
        lists.add("Swift");
        lists.add("C");
        lists.add("C++");
        lists.contains("C");
        Collections.reverse(lists);

        System.out.println("😆"+lists);



    }


    public static void q3() {

        List<String> lists = new ArrayList<String>(5);
        lists.add("Java");
        lists.add("Objective-C");
        lists.add("Swift");
        lists.add("C");
        lists.add("C++");
        lists.contains("C");
        System.out.println("🎿"+lists.contains("-C"));
    }

    public static void q2() {

        // create two lists
        List<String> srclst = new ArrayList<String>(5);
        List<String> destlst = new ArrayList<String>(10);

        // populate two lists
        srclst.add("Java");
        srclst.add("is");
        srclst.add("best");
        destlst.add("C++");
        destlst.add("is");
        destlst.add("older");

        // copy into dest list
        Collections.copy(destlst, srclst);
        System.out.println("Value of source list: "+srclst);
        System.out.println("Value of destination list: "+destlst);



//        List<Integer> array = new ArrayList<Integer>();
////        array = Arrays.asList(2,3,4,5,6,7);
//        array.add(2);
//        array.add(3);
//        array.add(4);
//        array.add(5);
//        List<Integer> array2 = new ArrayList<Integer>(array.size());
//        Collections.copy(array2,array);
//        System.out.println(array2.size());
//        for (Object a:array2){
//            System.out.println(a);
//        }
    }





    public static void q1() {
        List array = new ArrayList();
        array = Arrays.asList(2,3,4,5,6,7);
        for (Object a:array){
            System.out.println(a);
        }
    }




    public static void listPG1_2() {
        // 1.	ArrayList implements which of the following?
        // D.	All of the above

        // 2.	What should we use when add and remove operations are more frequent than get operations?
        // B.	ArrayList
    }

}
