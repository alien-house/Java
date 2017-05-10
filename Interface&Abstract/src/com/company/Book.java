package com.company;

/**
 * Created by shinji on 2017/05/09.
 */
public abstract class Book {
    String title;
    double price;
    Book(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    };
    public double getPrice(){
        return this.price;
    };
    abstract void setPrice();
}
