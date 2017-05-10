package com.company;

import java.lang.reflect.Array;

/**
 * Created by shinji on 2017/05/09.
 */
public class BookArray {

    public static void main(String[] args){

        Fiction fiction1 = new Fiction("fiction1");
        Fiction fiction2 = new Fiction("fiction2");
        Fiction fiction3 = new Fiction("fiction3");
        Fiction fiction4 = new Fiction("fiction4");
        Fiction fiction5 = new Fiction("fiction5");

        NonFiction nonfiction1 = new NonFiction("nonfiction1");
        NonFiction nonfiction2 = new NonFiction("nonfiction2");
        NonFiction nonfiction3 = new NonFiction("nonfiction3");
        NonFiction nonfiction4 = new NonFiction("nonfiction4");
        NonFiction nonfiction5 = new NonFiction("nonfiction5");

        Book array[] = {
                fiction1,fiction2,fiction3,fiction4,fiction5,
                nonfiction1,nonfiction2,nonfiction3,nonfiction4,nonfiction5
        };

        for (int i = 0; i < array.length;i++){
            System.out.print(array[i].getTitle() +" : ");
            System.out.println(array[i].getPrice());
        }


    }

}
