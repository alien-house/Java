package com.company;

/**
 * Created by shinji on 2017/05/08.
 */
public class DemoBook {

    public static void main(String[] args){

        Book book1 = new Book();
        book1.setTitle("This is a Book!");
        book1.setPagesNum(9084);
        String className = book1.getClass().toString();
        System.out.println("***"+className+"***");
        System.out.println("Title is "+book1.getTitle());
        System.out.println("Pages Number is "+book1.getPagesNum());

        Textbook textbook1 = new Textbook();
        textbook1.setTitle("TextBook is awesome");
        textbook1.setPagesNum(32);
        textbook1.setGradeLevel(3);
        String classNameText = textbook1.getClass().toString();
        System.out.println("***"+classNameText+"***");
        System.out.println("Title is "+textbook1.getTitle());
        System.out.println("Pages Number is "+textbook1.getPagesNum());
        System.out.println("Grade Level is "+textbook1.getGradeLevel());


    }


}
