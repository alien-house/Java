package com.company;

import java.util.Comparator;

/**
 * Created by shinji on 2017/05/24.
 */
public class AgeComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Animal a1 = (Animal) o1;
        Animal a2 = (Animal) o2;

        if(a1.getAge() == a2.getAge()){
            return 0;
        }else if(a1.getAge() > a2.getAge()){
            return 1;
        }else{
            return -1;
        }

    }
}
