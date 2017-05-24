package com.company;

import java.util.Comparator;

/**
 * Created by shinji on 2017/05/24.
 */
public class Computer {
    private int year;
    private String name;

    public Computer(int year,String name){
        this.year = year;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getYear(){
        return this.year;
    }
//
//
//    public  static Comparator<Computer> SalaryComp = new Comparator<Computer>(){
//        @Override
//        public int compare(Computer e1, Computer e2){
//            return (int)(e1.getName()-e2.getName());
//
//        }
//    };


}
