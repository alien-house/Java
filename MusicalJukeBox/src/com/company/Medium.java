package com.company;

/**
 * Created by shinji on 2017/05/12.
 */
public abstract class Medium {
    protected String title = "No Title";
    protected String artist = "Anonymous";
    protected double price = 0.0;
    protected int totaltime;
    Medium(String title, String artist, double price){
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    public String getTitle(){
        return this.title;
    }
    public String getArtist(){
        return this.artist;
    }
    public double getPrice(){
        return this.price;
    }

}
