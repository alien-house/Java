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
public class ClosestX {
    static final int NONE = -1;
    
    public static void main(String[] args) {
        int arr[] = {10, 22, 28, 29, 30, 40};
        int x = 54;
        // 22 and 30
        int rx[] = linearSearch(x,arr);
        System.out.println(arr[rx[0]]+" and "+arr[rx[1]]);
        
        int arr2[] = {1, 3, 4, 7, 10}, x2 = 15;        
        int rx2[] = linearSearch(x2,arr2);
        System.out.println(arr2[rx2[0]]+" and "+arr2[rx2[1]]);
        
    }
    
    
    public static int[] linearSearch(int target, int[] a) {
        int minarr[] = new int[2];
        int sum = 0;
        int preSum = a[0] + a[0]; //should be anything!
        int gap = 0;
        int preGap = target - preSum;
        for (int p = 0; p < a.length; p++) {
            for (int i = a.length-1; 0 < i; i--) {
                sum = a[p] + a[i];
                gap = target - sum;
                if(gap < 0){
                    gap = -gap;
                }
                if(gap < preGap){
                    preGap = gap;
                    System.out.println("gap:"+gap);
                    minarr[0] = p;
                    minarr[1] = i;
                }
            }
        }
        System.out.println("minarr[0]:"+minarr[0]);
        System.out.println("minarr[1]:"+minarr[1]);
       return minarr;
    }
    
    
}
