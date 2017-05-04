package com.company;

import java.util.*;

/**
 * Created by shinji on 2017/05/04.
 */
public class SortDoublesWithOption {

    public static void main(String[] args) {
//        double array[] = {3.243,454.65,4.3,2.3,96.7,5.4,97.6,2.0,1,25.4,67.3,123.2,689.9,31.21};

//        List<Double> array = new ArrayList<Double>() {{add("3.243"); add("454.65"); add("c");}};
        List<Double> array = Arrays.asList(3.24,454.65,4.3,2.3,96.7,5.4,97.6,2.0,1.0,25.4,67.3,123.2,689.9,31.21);

        System.out.println("[1] ascending or [2] descending");
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();

        switch (a){
            case 1:
//                Arrays.sort(array);
                Collections.sort(array);
                break;
            case 2:
//                Arrays.sort(array, Collections.reverseOrder());
                Collections.sort(array, Collections.reverseOrder());
                break;
        }
        System.out.println( "Sorted array "+ array);


    }

}
