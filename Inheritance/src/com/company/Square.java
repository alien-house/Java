package com.company;

/**
 * Created by shinji on 2017/05/08.
 */
public class Square {
    protected double width;
    protected double height;
    protected double surfaceArea;

    public Square(double width,double height){
        this.width = width;
        this.height = height;
    }

    public void computeSurfaceArea(){
        this.surfaceArea = this.width * this.height;
    }

}
