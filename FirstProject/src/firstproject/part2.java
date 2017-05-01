/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author shinji
 */
public class part2 {
    final Date currentTime = new Date();
    
    public static void main(String[] args) {
        // TODO code application logic here
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
    }
    
    public static void question6(){
        System.out.println("◆question6");
        
        String str_true = "true";
        String str_false = "false";
                
        if(4 > 1){}
        
        
    }
    
    public static void question5(){
        System.out.println("◆question5");
        
        System.out.println(4 + 6 * 3);
        System.out.println(6 / 3 * 7);
        System.out.println(18 / 2 + 14 / 2);
        System.out.println(16 / 2);
        System.out.println(17 / 2);
        System.out.println(28 / 5);
        System.out.println(16 % 2);
        System.out.println(17 % 2);
        System.out.println(28 % 5);
        System.out.println(28 % 5 * 3 + 1);
        System.out.println((2 + 3) * 4);
        System.out.println(20 / (4 + 1));
        
    }
    
    public static void question4(){
        System.out.println("◆question4");
        int meters = 2500;
        int hour = 5;
        int minutes = 56;
        int seconds = 23;
        
        int allsecounds = ((hour*60)*60)+(minutes*60)+seconds;
        double metSec = (meters / allsecounds);
        
        System.out.println(allsecounds);
        System.out.println(meters);
        System.out.printf("%f", metSec);
        System.out.println(metSec);
        
    }
    
    public static void question3(){
        System.out.println("◆question3");

        Date localTime = new Date(); 
        DateFormat converter = new SimpleDateFormat("HH:mm:ss");
        converter.setTimeZone(TimeZone.getTimeZone("GMT"));

        System.out.println("local time : " + localTime);;
        System.out.println("Current time is : " + converter.format(localTime));


    }
    
    
    public static void question1(){
        System.out.println("◆question1");
        double Fahrenheit = 112;
        double Celsius = (Fahrenheit - 32) / 1.8;
        System.out.println("Input a degree in Fahrenheit:"+Fahrenheit);
        System.out.println(Fahrenheit+" degree Fahrenheit is equal to "+Celsius+" in Celsius");
        
        
    }
    
    public static void question2(){
        System.out.println("◆question2");
        compute(549);
    }
    
    public static int compute( int num ){
        int sum = 0;
        int num_be = num;
        while (num > 0) {
            sum = sum + num % 10;//caluctate remainder, add to sum
            num = num / 10;
        }
        System.out.println("The sum of all digits in "+num_be+" is "+sum);
        return sum;
    }
    
    
    
}


        