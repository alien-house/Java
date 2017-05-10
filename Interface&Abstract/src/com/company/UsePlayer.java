package com.company;

/**
 * Created by shinji on 2017/05/09.
 */
public class UsePlayer {
    public static void main(String[] args) {
        Actor actor = new Actor();
        Musician musician = new Musician();
        Child child = new Child();

        actor.play();
        musician.play();
        child.play();

    }
}
