package com.company;

import java.util.ArrayList;

/**
 * Created by shinji on 2017/05/09.
 */
public class AccountArray {

    public static void main(String[] args){

        Checking checking1 = new Checking(1);
        Checking checking2 = new Checking(2);
        Checking checking3 = new Checking(3);
        Checking checking4 = new Checking(4);
        Checking checking5 = new Checking(5);
        Saving saving1 = new Saving(1,1.4);
        Saving saving2 = new Saving(2,2.2);
        Saving saving3 = new Saving(3,3.44);
        Saving saving4 = new Saving(4,6.41);
        Saving saving5 = new Saving(5,1.2);

        ArrayList<Account> array = new ArrayList();
        array.add(checking1);
        array.add(checking2);
        array.add(checking3);
        array.add(checking4);
        array.add(checking5);
        array.add(saving1);
        array.add(saving2);
        array.add(saving3);
        array.add(saving4);
        array.add(saving5);

//        Account array[] = {
//                checking1,checking2,checking3,checking4,checking5,
//                saving1,saving2,saving3,saving4,saving5
//        };

        for(Account item: array) {
            System.out.println(item);
        }

        for (int i = 0; i < array.size();i++){
            System.out.println(array.get(i).getBalance());
        }

    }


}
