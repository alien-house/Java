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
public class Part2 {
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

        String t = "";

        t = (4 > 1)? str_true:str_false;
        System.out.println("a : "+ t);

        t = (5 <= 18)? str_true:str_false;
        System.out.println("b : "+ t);

        t = (43 >= 43)? str_true:str_false;
        System.out.println("c : "+ t);

        t = (2 == 3)? str_true:str_false;
        System.out.println("d : "+ t);

        t = (2 + 5 == 7)? str_true:str_false;
        System.out.println("e : "+ t);

        t = (3 + 8 <= 10)? str_true:str_false;
        System.out.println("f : "+ t);

        t = (3 != 9)? str_true:str_false;
        System.out.println("g : "+ t);

        t = (13 != 13)? str_true:str_false;
        System.out.println("h : "+ t);

        t = (-4 != 4)? str_true:str_false;
        System.out.println("i : "+ t);

        t = (2 + 5 * 3 == 21)? str_true:str_false;
        System.out.println("j : "+ t);



        
        
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
        float meters = 2500;
        float hour = 5;
        float minutes = 56;
        float seconds = 23;

        float allsecounds = ((hour*60)*60)+(minutes*60)+seconds;
        float metSec = (meters / allsecounds);

        String after = String.format("%.9f", metSec);
        System.out.println("Your speed in meters/second is "+after);


        float allhours = hour + (minutes/60) + ((seconds/60)/60);
        float metHour = ((meters/1000) / allhours);
        String after2 = String.format("%.9f", metHour);
        System.out.println("Your speed in km/h is "+after2);


        float mileHour = ((meters/1609) / allhours);
        String after3 = String.format("%.9f", mileHour);
        System.out.println("Your speed in miles/h is "+after3);



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


        