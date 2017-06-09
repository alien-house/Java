/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching.sorting;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author naimesh
 */
public class Sortdemo {

    public static void main(String[] args) {
    //    int[] num = {12, 45, 7, 42, 89, 99, 54, 23, 63, 52, 41, 75, 65, 54, 94, 68, 62, 43, 49, 89, 40, 60, 50, 70, 223, 336, 225};
        int[] num = new int[1000];
        for (int i = 0; i < 1000; i++) {
            num[i] = (int) (Math.random()*1000);
        }       
        Instant start = Instant.now();
        BubbleSort.BubbleSort(num);
        Instant end = Instant.now();
        System.out.println("");
        System.out.println("time taken in avg case Bubble sort " + Duration.between(start, end));
        Arrays.sort(num);
        start = Instant.now();
        BubbleSort.BubbleSort(num);
        end = Instant.now();
        System.out.println("");
        System.out.println("time taken in best case Bubble sort " + Duration.between(start, end));
        Collections.reverse(Arrays.asList(num));
        start = Instant.now();
        BubbleSort.BubbleSort(num);
        end = Instant.now();
        System.out.println("");
        System.out.println("time taken in worst case Bubble sort " + Duration.between(start, end));
        
        
       // do same for all sort algorithms. selection sort and insertion sort
    }

}
