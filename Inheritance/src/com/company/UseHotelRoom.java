package com.company;

/**
 * Created by shinji on 2017/05/08.
 */
public class UseHotelRoom {

    public static void main(String[] args){
        HotelRoom normalRoom1 = new HotelRoom(1);
        System.out.println("[HotelRoom:1]");
        System.out.println("$"+normalRoom1.getNightRentalRate());

        HotelRoom normalRoom23 = new HotelRoom(23);
        System.out.println("[HotelRoom:23]");
        System.out.println("$"+normalRoom23.getNightRentalRate());

        HotelRoom normalRoom333 = new HotelRoom(333);
        System.out.println("[HotelRoom:333]");
        System.out.println("$"+normalRoom333.getNightRentalRate());

        Suite suiteRoom194 = new Suite(194);
        System.out.println("[Suite:194]");
        System.out.println("$"+suiteRoom194.getNightRentalRate());

        Suite suiteRoom783 = new Suite(783);
        System.out.println("[Suite:783]");
        System.out.println("$"+suiteRoom783.getNightRentalRate());


    }

}
