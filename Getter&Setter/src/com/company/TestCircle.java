package com.company;

/**
 * Created by shinji on 2017/05/05.
 */
public class TestCircle {

    public static void main(String[] args) {

        System.out.println("[circle1]");
        Circle circle1 = new Circle();
        circle1.setRadius(3);
        System.out.println(circle1.showDetails());

        System.out.println("[circle2]");
        Circle circle2 = new Circle();
        circle2.setRadius(65);
        System.out.println(circle2.showDetails());

        System.out.println("[circle3]");
        Circle circle3 = new Circle();
        System.out.println(circle3.showDetails());

    }

}
