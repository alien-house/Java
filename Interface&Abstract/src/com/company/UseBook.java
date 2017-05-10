package com.company;

/**
 * Created by shinji on 2017/05/09.
 */
public class UseBook {

    public static void main(String[] args){
        Fiction book_fic = new Fiction("HurryDoder");
        System.out.println("Fiction Book");
        System.out.println(book_fic.getTitle());
        System.out.println(book_fic.getPrice());

        System.out.println("");

        NonFiction book_non = new NonFiction("Strategy");
        System.out.println("NonFiction Book");
        System.out.println(book_non.getTitle());
        System.out.println(book_non.getPrice());

    }

}
