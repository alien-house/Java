package com.company;

/**
 * Created by shinji on 2017/05/09.
 */
public class Checking extends Account {

    Checking(int number){
        super(number);
    }

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    public void getInformation(){
        System.out.println("Checking Account Information");
        System.out.println("Account Number : "+ this.getNumber());
        System.out.println("Account Balance : "+ this.getBalance());
    }

}
