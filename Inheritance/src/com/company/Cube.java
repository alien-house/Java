package com.company;

/**
 * Created by shinji on 2017/05/08.
 */
public class Cube extends Square {
    private int depth;

    public Cube(double width, double height, int depth) {
        super(width, height);
        this.depth = depth;
    }

    public void computeSurfaceArea() {
        this.surfaceArea = this.width * this.height * this.depth;
    }
}
