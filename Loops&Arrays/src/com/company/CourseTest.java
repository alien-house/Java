package com.company;

import java.util.*;

/**
 * Created by shinji on 2017/05/04.
 */
public class CourseTest {

    // creating by one line
//     static List<String> students =  Arrays.asList("Amy", "Bob", "Cindy", "David");

    // creating normal version
    static List<String> students = new ArrayList<String>();

    CourseTest(){
        students.add("Amy");
        students.add("Bob");
        students.add("Cindy");
        students.add("David");

    }

    public static void printOutArrayList(){
        for (int i = 0; i < students.size(); i++){
            System.out.println( students.get(i) );
        }
        System.out.println( "students size is "+students.size() );

    }

}
