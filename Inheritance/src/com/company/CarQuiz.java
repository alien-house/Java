package com.company;

/**
 * Created by shinji on 2017/05/08.
 */
public class CarQuiz {

    /*
    * [Answer]
    * vroom
    * truck 1
    * car 2
    *
    * */

    public void m1() {
        System.out.println("car 1");
    }

    public void m2() {
        System.out.println("car 2");
    }

    public String toString() {
        return "vroom";
    }

    public static void main(String[] args) {
        TruckQuiz mycar = new TruckQuiz();
        System.out.println(mycar); // it shows toString!
        mycar.m1();
        mycar.m2();

    }

}
