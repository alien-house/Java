package com.company;

/**
 * Created by shinji on 2017/05/05.
 */
public class Pizza {

    private String toppings;
    private int diameter;
    private double price;

    public String getToppings(){
        System.out.println(this.toppings);
        return this.toppings;
    }
    public int getDiameter(){
        System.out.println(this.diameter);
        return this.diameter;
    }
    public double getPrice(){
        System.out.println(this.price);
        return this.price;
    }

    public void setToppings(String toppings){
        this.toppings = toppings;
    }
    public void setDiameter(int diameter){
        this.diameter = diameter;
    }
    public void setPrice(double price){
        this.price = price;
    }

}
