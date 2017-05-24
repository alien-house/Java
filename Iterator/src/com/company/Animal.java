package com.company;

import java.util.*;

/**
 * Created by shinji on 2017/05/24.
 */
public class Animal implements Comparable<Animal> {
    private int age;
    private String name;

    public Animal(int age,String name){
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public int compareTo(Animal o) {
        return (o.age - this.age);
    }


}
