package com.company;

/**
 * Created by shinji on 2017/05/09.
 */
public class Fiction extends Book {

    Fiction(String title) {
        super(title);
        this.setPrice();
    }

    @Override
    public void setPrice() {
        this.price = 24.99;
    }
}
