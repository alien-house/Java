/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching.sorting;

/**
 *
 * @author shinji
 */
public class Student implements Comparable<Student>  {
    
    int rollno;
    String name;
    int age;
    
    Student(int age){
        this.age = age;
    }
    
    @Override
    public int compareTo(Student o) {
       return (o.age - this.age);
    }
    
    
}
