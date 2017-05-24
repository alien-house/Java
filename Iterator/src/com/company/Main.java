package com.company;

import java.util.*;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        problem04();
//        problem03_2();
//        problem03();
//        problem02();
//        problem01();

    }
    public static void problem04(){

        ArrayList<Course> al = new ArrayList<Course>();
        al.add(new Course('d',2,"Ok johiekdi",2));
        al.add(new Course('$',12,"eyeonomenthel",12));
        al.add(new Course('&',908,"TokiTOki kyo",3));
        al.add(new Course('%',52,"political assecement",9));
        for (Course e:al) {
            e.toString();
        }
    }

    public static void problem03_2(){

        ArrayList<Animal> al = new ArrayList<Animal>();
        al.add(new Animal(2,"kokok"));
        al.add(new Animal(4,"ererere"));
        al.add(new Animal(8,"aaader"));
        al.add(new Animal(3,"yertrtr"));

        System.out.println("Sorting by age...");

        Collections.sort(al, new AgeComparator());
        Iterator llit = al.iterator();
        while(llit.hasNext()){
            Animal an = (Animal)llit.next();
            System.out.println(an.getAge()+" : "+an.getName());
        }

        System.out.println("Sorting by name...");

        Collections.sort(al, new NameComparator());
        Iterator llit2 = al.iterator();
        while(llit2.hasNext()){
            Animal an = (Animal)llit2.next();
            System.out.println(an.getAge()+" : "+an.getName());
        }

    }

    public static void problem03(){

        ArrayList<Animal> al = new ArrayList<Animal>();
        al.add(new Animal(2,"kokok"));
        al.add(new Animal(4,"ererere"));
        al.add(new Animal(8,"aaader"));
        al.add(new Animal(3,"yertrtr"));
        Collections.sort(al);
        for (Animal an:al){
            System.out.println(an.getAge());
        }

    }

    public static void problem02(){
        LinkedList ll = new LinkedList();
        ll.add("aaa");
        ll.add("ggg");
        ll.add("dddd");
        ll.add("eee");
        Iterator llit = ll.iterator();
        while(llit.hasNext()){
            System.out.println(llit.next());
        }
    }

    public static void problem01(){
        ArrayList al = new ArrayList();
        al.add("aaa");
        al.add("ggg");
        al.add("dddd");
        al.add("eee");
        Iterator alit = al.iterator();
        while(alit.hasNext()){
            System.out.println(alit.next());
        }
    }


}
