/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

/**
 *
 * @author shinji
 */
public class FirstProject {
    public static final double PI = 3.14;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        question5();
        question4();
        question3();
        question2();
        question1();
        question6();
    }
    
    public static void question6(){
        System.out.println("◆question6");
        int num = 252;
        System.out.println(compute(num));
        int test = num;
        int valLen = String.valueOf( num ).length(); 
        for (int i = 0; i < valLen; i++) {
            test = num / 10;
//            test = test % 10;
        }
        
    }
    public static int compute( int num ){
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
        return sum;
}
        
        
        
    public static void question5(){
        System.out.println("◆question5");
        double radius = 7.5;
        System.out.println("Perimeter:"+(radius+radius)*PI);
        System.out.println("Area:"+(radius*radius)*PI);
        
    }
        
        
    public static void question4(){
        System.out.println("◆question4");
        
        float fn = 125;
        float sn = 20;
        System.out.println("+:"+(fn + sn));
        System.out.println("*:"+fn * sn);
        System.out.println("-:"+ (fn - sn));
        System.out.println("/:"+fn / sn);
        System.out.println("%:"+fn % sn);
        
    }
    
    public static void question3(){
        
        System.out.println("◆question3");
        float a = -5 + 8 * 6;
        System.out.println("a:"+a);
        
        float b =  (55+9) % 9;
        System.out.println("b:"+b);
        
        float c = 20 + -3*5 / 8 ;
        System.out.println("c:"+c);
        
        float d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("d:"+d);
        
    }
    
    public static void question2(){
        
        System.out.println("◆question2");
        float sum1 = 2 + 2;
        System.out.println(sum1);
        
        float sum2 = 2 - 2;
        System.out.println(sum2);
        
        float sum3 = 2 * 2;
        System.out.println(sum3);
        
        float sum4 = 2 / 2;
        System.out.println(sum4);
        
    }
    
    public static void question1(){
        
        System.out.println("◆question1");
        System.out.println("Hello");
        System.out.println("My name is Shinji");
        System.out.println("|");
        
    }
    
    
    
}
