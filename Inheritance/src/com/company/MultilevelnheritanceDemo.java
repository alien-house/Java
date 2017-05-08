package com.company;

/**
 * Created by shinji on 2017/05/08.
 */
public class MultilevelnheritanceDemo {

    public static void main(String[] args){

        Human Tadashi = new Human();
        Tadashi.speak();
        Tadashi.speak("Hi Im Tadashi!");
        System.out.println(Tadashi.life);
        Tadashi.died();

        Animal lion = new Animal();
        lion.speak();
    }

}
