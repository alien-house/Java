package com.company;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by shinji on 2017/05/24.
 */
public class ProgramofStudy {
    LinkedList<Course> ll = new LinkedList<Course>();

    public void addCourse(Course c){
        this.ll.add(c);
    }

    public Course find(Course c){
        Iterator llit = this.ll.iterator();
        while(llit.hasNext()){
            Course e = (Course)llit.next();
            if(c.equals(e)){
                return e;
            }else{
                return null;
            }
        }
        return null;
    }

    public void display(){
        for (Course e:this.ll){
            e.toString();
        }
    }

}
