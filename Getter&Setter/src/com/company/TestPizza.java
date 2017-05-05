package com.company;

/**
 * Created by shinji on 2017/05/05.
 */
public class TestPizza {

    public static void main(String[] args) {

        Pizza piza = new Pizza();
        piza.setToppings("pepperoni");
        piza.setDiameter(2);
        piza.setPrice(12.3);

        piza.getToppings();
        piza.getDiameter();
        piza.getPrice();


    }

}
