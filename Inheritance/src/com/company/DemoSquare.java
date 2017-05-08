package com.company;

/**
 * Created by shinji on 2017/05/08.
 */
public class DemoSquare {

    public static void main(String[] args) {
        Square square = new Square(2,4);
        square.computeSurfaceArea();
        System.out.println("square");
        System.out.println(square.surfaceArea);

        Cube cube = new Cube(2,3,5);
        cube.computeSurfaceArea();
        System.out.println("cube");
        System.out.println(cube.surfaceArea);


    }


}
