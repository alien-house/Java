package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by shinji on 2017/05/11.
 */
public class NegativeArray {

    public static void main(String[] args) {

        try{
            System.out.println("Enter the Subscript!");
            Scanner number = new Scanner(System.in);
            String str = "aaaaaa";
            int no = Integer.parseInt(str);
//            if (number.hasNextInt()) {
//            }
//            int n = number.nextInt();
//            int array[] = new int[n];
//            if(array.length == n){
//                System.out.println("You created your Array!");
//            }
        }catch (NegativeArraySizeException e){
            System.out.println("negative size!");
            System.out.println("Your Array is not gonna create.");
        }catch (NumberFormatException e){
            System.out.println("non numeric value!"+e);
            System.out.println("Your Array is not gonna create.");
        }catch (InputMismatchException e){
            System.out.println("non numeric value!"+e);
            System.out.println("Your Array is not gonna create.");
        }
//        catch (Exception e){
//            System.out.println("another reasons!");
//            System.out.println("Your Array is not gonna create.");
//        }
//        finally {
//            System.out.println("finally");
//        }

    }


}
