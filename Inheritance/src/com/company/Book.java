package com.company;

/**
 * Created by shinji on 2017/05/08.
 */
public class Book {
    private String title;
    private int pagesNum;

    public void setTitle(String title){
        this.title = title;
    }
    public void setPagesNum(int pagesNum){
        this.pagesNum = pagesNum;
    }

    public String getTitle(){
        return this.title;
    }
    public int getPagesNum(){
        return this.pagesNum;
    }

}
