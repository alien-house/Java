package com.company;

/**
 * Created by shinji on 2017/05/05.
 */
public class Student {
    private int ID;
    private int creditHours;
    private int points;
    private double gpa;

    public Student(int ID, int creditHours, int points){
        this.ID = ID;
        this.creditHours = creditHours;
        this.points = points;
        this.gpa = this.points / this.creditHours;
    }
    public Student(){
        this.ID = 99999;
        this.creditHours = 3;
        this.points = 12;
        this.gpa = this.points / this.creditHours;
    }
    public Student(int ID, int creditHours){
        this.ID = ID;
        this.creditHours = creditHours;
        this.points = 12;
        this.gpa = this.points / this.creditHours;
    }

    public double getGpa(){
        return this.gpa;
    }

    public String toString(){
        String report = "Student ID :"+ this.ID + "\n"+
                "Credit Hours :"+ this.creditHours + "\n"+
                "Points :" + this.points + "\n"+
                "GPA :" + this.gpa;
        return report;
    }

}
