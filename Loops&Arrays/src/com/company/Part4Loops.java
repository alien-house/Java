package com.company;

/**
 * Created by shinji on 2017/05/04.
 */
public class Part4Loops {

    public static void main(String[] args) {
//        question1_7();
//        question10();
//        question11();
        question12();

    }

    public static void question12() {

    }

    public static void question11() {

        //03
        int inum3 = 5;
        int num = 1;
        for(int i = 1; i <= inum3; i++) {
            System.out.println(" ");
            for (int a = 1; a <= i; a++) {
                System.out.print((num%2 == 0)? 0:1);
                num++;
            }
        }

        //02
//        int inum2 = 4;
//        int num = 1;
//        for(int i = 1; i <= inum2; i++) {
//            System.out.println(" ");
//            for (int a = 1; a <= i; a++) {
//                System.out.print(num);
//                num++;
//            }
//        }

        //01
//        int inum = 5;
//        for(int i = 1; i <= inum; i++) {
//            System.out.println(" ");
//            for (int a = 1; a <= i; a++) {
//                System.out.print(i);
//            }
//        }
    }

    public static void question10() {
        int inum = 5;

        for(int i = 0; i <= inum; i++) {
            System.out.println(" ");
            for (int a = 0; a <= i; a++) {
                System.out.print("*");
            }
        }
    }


    public static void question1_7() {

        // Q1. d. 1 1 1 1 1 1…
//        int b = 1;
//        while(b < 4)
//            System.out.print(b + " ");


        // Q2. b. 1 2 3
//        int b = 1;
//        while(b < 4)
//        {
//            System.out.print(b + " ");
//            b = b + 1;
//        }


        // Q3. b. 0 1 2 3 4
//        for(int a = 0; a < 5; ++a)
//            System.out.print(a + " ");


        // Q4. b. do…while

        // Q5. b. 0 1
//        int d = 0;
//        do{
//            System.out.print(d + " ");
//            d++;
//        } while (d < 2);


        // Q6. [d] the commas should be semicolons
//        for (int k = 2, k <= 12, k++){
//        }


        // Q7. [c] 5
//        for (int num = 1; num <= 5; num++){
//            System.out.println(num);
//        }


        // Q8. show ForLoop.java


    }

}
