package com.company;

/**
 * Created by shinji on 2017/05/04.
 */
public class EvenNums {


    public static void main(String[] args) {

        int n = 1, e = 20;
        for (int i = 2; i <= 100; i++){
            if(i%2 == 0){
                System.out.print(i);
                if((n*e) == i){
                    System.out.println(" ");
                    n++;
                }
            }

        }


    }


}
