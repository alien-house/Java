/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching.sorting;

import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author shinji
 */
public class CompareTime {
    
    public static void main(String[] args) {
    
        int index = 0;
        int[] intArray = new int[1000];
        for(int i:intArray){
            intArray[index] = index;
            index++;            
        }
        
        // ===========================
        // linear Search
        // ===========================

        linearSearchOld ls = new linearSearchOld();
        Instant start = Instant.now();
        int o = ls.linearSearch(121,intArray);
        System.out.println("linear Search : intArray =======================");
        System.out.println(o);
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end));

        
        // ===========================
        // Binary  Search
        // ===========================
        
        SortingandSearching ss = new SortingandSearching();
        Instant start2 = Instant.now();
        int sso = ss.binarySearch(intArray, 121);
        System.out.println("binary Search : intArray =======================");
        System.out.println(sso);
        
        Instant end2 = Instant.now();
        System.out.println(Duration.between(start2, end2));
        
        
        
        
        
        
        
    }
    
}
