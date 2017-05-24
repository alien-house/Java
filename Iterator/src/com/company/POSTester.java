package com.company;

/**
 * Created by shinji on 2017/05/24.
 */
public class POSTester {

    public static void main(String[] args) {
        ProgramofStudy pslist = new ProgramofStudy();

        pslist.addCourse(new Course('d',2,"Furapetino",2));
        pslist.addCourse(new Course('%',52,"nandesonnaniamai",9));
        pslist.addCourse(new Course('$',12,"jaaNomuna",12));
        pslist.addCourse(new Course('&',8,"hayokaere",3));

        pslist.display();

    }

}
