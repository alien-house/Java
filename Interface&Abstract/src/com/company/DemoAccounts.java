package com.company;

/**
 * Created by shinji on 2017/05/09.
 */
public class DemoAccounts {

    public static void main(String[] args) {
        Checking checking = new Checking(1);
        Saving saving = new Saving(1,2.4);

        checking.getInformation();
        saving.getInformation();
    }

}
