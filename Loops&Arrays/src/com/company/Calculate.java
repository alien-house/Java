package com.company;

import java.util.Scanner;

/**
 * Created by shinji on 2017/05/04.
 */
public class Calculate {

    public static void main(String[] args) {

        System.out.println("◆question13:Calculate");

        System.out.println("Please input first number.");
        Scanner firstNum = new Scanner(System.in);
        int firstNumInt = firstNum.nextInt();

        System.out.println("Please input second number.");
        Scanner secondNum = new Scanner(System.in);
        int secondNumInt = secondNum.nextInt();

        System.out.println("Please input a number of calculate.[1:add, 2:subtract, 3:multiply, 4:divide]");
        Scanner calculateNum = new Scanner(System.in);
        int calculateNumInt = calculateNum.nextInt();

        if((calculateNumInt <= 0) || (calculateNumInt >= 5)){
            System.out.println("Error");
            return;
        }

        double result = 0;

        switch (calculateNumInt){
            case 1:
                result = firstNumInt + secondNumInt;
                break;
            case 2:
                result = firstNumInt - secondNumInt;
                break;
            case 3:
                result = firstNumInt * secondNumInt;
                break;
            case 4:
                result = firstNumInt / secondNumInt;
                break;
        }
        System.out.println("Results is " + result);




    }


}
