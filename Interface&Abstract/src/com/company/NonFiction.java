package com.company;

/**
 * Created by shinji on 2017/05/09.
 */
public class NonFiction extends Book {

    NonFiction(String title) {
        super(title);
        this.setPrice();
    }

    @Override
    void setPrice() {
        this.price = 37.99;
    }

}
