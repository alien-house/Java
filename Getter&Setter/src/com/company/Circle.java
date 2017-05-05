package com.company;

/**
 * Created by shinji on 2017/05/05.
 */
public class Circle {

    private double radius;
    private double diameter;
    private double area;
    private static final double PI = 3.14;

    Circle(){
        this.radius = 1;
        this.diameter = (this.radius * 2);
        this.area = (this.radius * this.radius * this.PI);
//        System.out.println("default area is "+this.area);
    }

    public void setRadius(double radius){
        this.radius = radius;
        this.diameter = (this.radius * 2);
        this.area = (this.radius * this.radius * this.PI);
        System.out.println("area : "+this.area);

    }

    public double getRadius(){
        return this.radius;
    }

    public String showDetails(){
        String desc;
        desc = "radius : "+this.radius + "\t diameter : " + this.diameter +"\t area : "+this.area;
        return desc;
    }

}
