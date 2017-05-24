/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Comparator;

/**
 *
 * @author naimesh
 */
 public abstract class Comparatorex implements Comparator{
    public  static Comparator<Employee> SalaryComp = new Comparator<Employee>(){
        @Override
        public int compare(Employee e1, Employee e2){
            return (int)(e1.getSalary()-e2.getSalary());
            
        }
    };
    
     public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getAge() - e2.getAge();
        }
    };
     public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };

}
