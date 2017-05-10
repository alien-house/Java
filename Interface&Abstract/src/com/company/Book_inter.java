package com.company;

/**
 * Created by shinji on 2017/05/09.
 */
public interface Book_inter {
    String title = "";
    double price = 0.0;
    void Book(String title, double price);
    String getTitle();
    double getPrice();
    abstract void setPrice(double price);
}
