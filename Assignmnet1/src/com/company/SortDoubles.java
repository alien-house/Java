package com.company;
import java.util.*;

/**
 * Created by shinji on 2017/05/05.
 */
public class SortDoubles {

    public static void main(String[] args) {
        sortOnArrayList();
    }

    public static void sortOnArrays(){
//        double array[] = new double[15];
        double array[] = {13.32,42345.43,123.443,7465.7,34574.4,224.552,3.6,1.0,523.5,1573.42,846.1,473.1,347.8,4654.7,3667.68};

        System.out.println("[before sort]");
        System.out.println(Arrays.toString(array));

        System.out.println("[after sort]");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortOnArrayList() {

        ArrayList<Double> array = new ArrayList<Double>();
        array.add(13.32);
        array.add(42345.43);
        array.add(123.443);
        array.add(7465.7);
        array.add(34574.4);
        array.add(224.552);
        array.add(3.6);
        array.add(1.0);
        array.add(523.5);
        array.add(1573.42);
        array.add(846.1);
        array.add(473.1);
        array.add(347.8);
        array.add(4654.7);
        array.add(3667.68);

        System.out.println("[before sort]");
        System.out.println(array);

        array.sort((p2, p1) -> p2.compareTo(p1));
        System.out.println("[after sort]");
        System.out.println(array);

    }


}
