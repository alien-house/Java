package com.company;

/**
 * Created by shinji on 2017/05/05.
 */
public class Service {
    private String desc;
    private double price;
    private int minutes;

    Service(String desc, double price, int minutes){
        this.desc = desc;
        this.price = price;
        this.minutes = minutes;
    }

    public String getDesc(){
        return this.desc;
    }
    public double getPrice(){
        return this.price;
    }
    public int getMinutes(){
        return this.minutes;
    }
}
