package com.company;

import java.util.Scanner;

/**
 * Created by shinji on 2017/05/04.
 */
public class Admission2 {

    float gradePoint = 0;
    int testScore = 0;

    public static void main(String[] args) {

        System.out.println("◆question11:Admission2");

        System.out.println("Please input your grade point average.");
        Scanner gpa = new Scanner(System.in);
        float gradePoint = gpa.nextFloat();

        System.out.println("Please input your admission test score.");
        Scanner score = new Scanner(System.in);
        int scorePoint = score.nextInt();



        if((gradePoint <= 0.0) || (gradePoint >= 4.0) ){
            System.out.println("Error");
            return;
        }
        if((scorePoint <= 0) || (scorePoint >= 100) ){
            System.out.println("Error");
            return;
        }

        if((gradePoint >= 3.0) || (scorePoint <= 60) ){
            System.out.println("Accept");

        }else if((gradePoint <= 3.0) && (scorePoint <= 80)){
            System.out.println("Accept");

        }else{
            System.out.println("Reject");
        }

    }
}
