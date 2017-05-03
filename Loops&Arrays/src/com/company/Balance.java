package com.company;

import java.util.Scanner;

/**
 * Created by shinji on 2017/05/03.
 */
public class Balance {

    static int checkingBalance = 10;
    static int savingBalance = 200;

    public static void main(String[] args) {

        System.out.println("◆question10:Balance");

//        System.out.println("Checking account balance is low");

        asking();
    }

    public static void asking() {

        boolean isLock = true;

        while (isLock){
            System.out.println("What do you want?");
            System.out.println("[1] Checking account balance");
            System.out.println("[2] Savings  account balance");
            System.out.println("[9] Finished");
            Scanner number = new Scanner(System.in);
            int a = number.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Your checking account balance is $" + checkingBalance);
                    if(checkingBalance <= 10) {
                        System.out.println("Checking account balance is low");
                    }
                    break;
                case 2:
                    System.out.println("Your saving account balance is $" + savingBalance);
                    if(savingBalance <= 100) {
                        System.out.println("Savings account balance is low");
                    }
                    break;
                case 9:
                    System.out.println("Good bye");
                    isLock = false;
                    break;
            }
            System.out.println(" ");
        }

    }

}
