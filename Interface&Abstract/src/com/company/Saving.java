package com.company;

/**
 * Created by shinji on 2017/05/09.
 */
public class Saving extends Account {
    double interestRate;
    Saving(int number,double interestRate){
        super(number);
        this.interestRate = interestRate;
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
        System.out.println("Savings Account Information");
        System.out.println("Account Number : "+ this.getNumber());
        System.out.println("Account Balance : "+ this.getBalance());
        System.out.println("The Interest Rate : "+ this.interestRate);
    }

}
