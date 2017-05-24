package com.company;

/**
 * Created by shinji on 2017/05/24.
 */
public class Course {
    public char prefix;
    public int number;
    public String title;
    public int grade;

    public Course(char prefix, int number, String title, int grade){
        this.prefix = prefix;
        this.number = number;
        this.title = title;
        this.grade = grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    @Override
    public String toString(){
        String courseString = "";
        courseString = "[" + this.prefix + Integer.toString(this.number) + "] " + this.title + ":" + Integer.toString(this.grade);
        System.out.println(courseString);
        return courseString;
    }

}
