package com.company;

/**
 * Created by shinji on 2017/05/09.
 */
public abstract class Account {
    int number;
    double balance;
    Account(int number){
        this.number = number;
        this.balance = 0.0;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public abstract int getNumber();
    public abstract double getBalance();
}
