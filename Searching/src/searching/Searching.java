/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shinji
 */
public class Searching {

    /**
     * @param args the command line arguments
     */
    
    static final int NUMMAX = 10000000;
    public static void main(String[] args) {
        
        Integer int2 = 2;
        Integer int3 = 33;
        int2.compareTo(int3);
        System.out.println(int2.compareTo(int3));
        
        String str1 = "Strings are immutable";
        String str4 = "Strings are immutable";
        String str2 = new String("Strings are immutable");
        String str3 = new String("Strings are immutable");
        int result = str1.compareTo( str2 );
        System.out.println(result);

        result = str2.compareTo( str3 );
        System.out.println(result);
        
        
        // ==================
//        normallinearSearch();
        // ==================
        
//        String[] stringArrRandom = new String[NUMMAX];
//        int[] intArrRandom = new int[NUMMAX];
//        for(int i = 0; i < NUMMAX; i++){
//            int t = (int)(Math.floor(Math.random() * (NUMMAX - 1)) + 1);
////            stringArrRandom[i] = String.valueOf(t);
//            intArrRandom[i] = t;
////            System.out.println(t);
//        }
//        
//        Instant ss3 = Instant.now();
////        boolean num3 = linearSearch(stringArrRandom,0,stringArrRandom.length-1,"9");
//        Instant es3 = Instant.now();
////        System.out.print(num3 + ":");
////        System.out.println(Duration.between(ss3, es3));
////        
        
        Integer[] intArr = new Integer[NUMMAX];
        for(int i = 0; i < NUMMAX; i++){
            intArr[i] = new Integer(i);
//            System.out.println(t);
        }
        Instant ss4 = Instant.now();
        
        boolean t = SearchingRecursiveGeneric.binarySearch(intArr, new Integer(32));
        System.out.print(t + ":");
//        int num4 = binarySearch( intArr, 1090000);
//        int num4 = linearSearch( 1090000, intArr );
        
        Instant es4 = Instant.now();
//        System.out.print(num4 + ":");
        System.out.println(Duration.between(ss4, es4));
        
        
        
        
        
        
        
    }
    
    static void normallinearSearch(){
    
        int[] intArrRandom = new int[NUMMAX];
        for(int i = 0; i < NUMMAX; i++){
            double t = Math.floor(Math.random() * (NUMMAX - 1)) + 1;
            intArrRandom[i] = (int) t;
//            System.out.println(t);
        }
        int[] intArr = new int[NUMMAX];
        for(int i = 0; i < NUMMAX; i++){
            intArr[i] = i;
//            System.out.println(t);
        }
        
        
        Instant ss = Instant.now();
        int num = linearSearch(222333, intArrRandom);
        Instant es = Instant.now();
        System.out.print(num + ":");
        System.out.println(Duration.between(ss, es));
        
        
        Instant ss2 = Instant.now();
        int num2 = linearSearch(222333, intArr);
        Instant es2 = Instant.now();
        System.out.print(num2 + ":");
        System.out.println(Duration.between(ss2, es2));
        
    
        String[] stringArrRandom = new String[NUMMAX];
        for(int i = 0; i < NUMMAX; i++){
            double t = Math.floor(Math.random() * (NUMMAX - 1)) + 1;
            stringArrRandom[i] = String.valueOf(t);
//            System.out.println(t);
        }
        Instant ss3 = Instant.now();
        int num4 = linearSearch("9", stringArrRandom);
        Instant es3 = Instant.now();
        System.out.print(num4 + ":");
        System.out.println(Duration.between(ss3, es3));
    }
    
    
    /*
    It's better algorithm. for following.
      - Array of Integer
      - Not Sorted
    */
    static int linearSearch(int target, int[] a) {	
        for(int p = 0; p < a.length; p++) {		
            if (target == a[p]) return p;	
        }
        return -1;
    }
    
    // for String
    static int linearSearch(String target, String[] a){
        for(int p = 0; p < a.length; p++){
            if(target.equals(a[p])){
                return p;
            }
        }
        return -1;
    }
    
    // for Object
    static int linearSearch(Object target, Object[] a){
        for(int p = 0; p < a.length; p++){
            if(target.equals(a[p])){
                return p;
            }
        }
        return -1;
    }
    
    //===========================================
    //Generic Methods
    //===========================================
    //linear Searrch
    /*
    */
    static <T extends Comparable<T>> boolean linearSearch(T[] data, int min, int max, T target){
        int index = min;
        boolean found = false;
        while(!found && index <= max){
            found = data[index].equals(target);
            index++;
        }
        return found;
    }
    
    //Binary Search
    /*
        if it sorted, more efficient.
        リニアサーチより高速であるがデータを必ずソートしなければならない
    */
    static int binarySearch(int[] a, int target){
//        System.out.print(target + ":");
        int min = 0;
        int max = a.length - 1;
        while(min <= max){
            int mid = (min + max) / 2;
            if(a[mid] < target){
                min = mid + 1;
            }else if(a[mid] > target){
                max = mid - 1;
            }else{
                return mid;
            }
        }
        return -(min + 1);
    }
    
    
}
