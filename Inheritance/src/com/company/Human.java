package com.company;

/**
 * Created by shinji on 2017/05/08.
 */
public class Human extends Mammal {

    public void speak(){
        System.out.println("What should I speak?");
    }
    public void speak(String txt){
        System.out.println(txt);
    }
}
