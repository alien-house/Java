/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author naimesh
 */
public class Comparabledemo {

    public static void main(String[] args) {
       
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Mikey", 25, 10000);
        empArr[1] = new Employee(20, "Arun", 29, 20000);
        empArr[2] = new Employee(5, "Lisa", 35, 5000);
        empArr[3] = new Employee(1, "Pankaj", 32, 50000);
     /*   Arrays.sort(empArr);
        System.out.println("Default Sorting of Employees list:\n" + Arrays.toString(empArr));


        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(101, "Vijay", 23,50000));
        al.add(new Employee(102, "Ajay", 27,25000));
        al.add(new Employee(103, "Jai", 21,60000));
     
        System.out.println("Default Sorting of Employees list using arraylist:\n");
        Collections.sort(al);
        for (Employee e : al) {
            System.out.print(e.toString());
        }*/
     //. array of objects == Arrays.sort()
     // collection i.e. arraylist, linkedlis = collections.sort()
        
        System.out.println("demo using comparator");
        Arrays.sort(empArr,Comparatorex.SalaryComp);
        System.out.println("Employees list sorted by Salary:\n"+Arrays.toString(empArr));
        
         System.out.println("demo using comparator");
        Arrays.sort(empArr,Comparatorex.NameComparator);
        System.out.println("Employees list sorted by Name:\n"+Arrays.toString(empArr));


    }

}
