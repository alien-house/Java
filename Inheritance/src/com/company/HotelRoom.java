package com.company;

/**
 * Created by shinji on 2017/05/08.
 */
public class HotelRoom {
    protected int roomNum;
    protected double nightRentalRate;

    public HotelRoom(int roomNum){
        this.roomNum = roomNum;
        if(roomNum <= 299){
            this.nightRentalRate = 69.95;
        }else{
            this.nightRentalRate = 89.95;
        }
    }

    public int getRoomNum(){
        return this.roomNum;
    }
    public double getNightRentalRate(){
        return this.nightRentalRate;
    }


}
