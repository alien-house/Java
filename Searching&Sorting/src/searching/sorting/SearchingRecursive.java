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
public class SearchingRecursive {
    
    public int binarySearch(int[] a, int target){
        return binarySearch(a, target, 0, a.length - 1);
    }
    
    private int binarySearch(int[] a, int target, int min, int max){
        if(min > max){
            return -1;
        }else{
            int mid = (min + max) / 2;
            if(a[mid] < target){
                return binarySearch(a, target, mid + 1, max);
            }else if(a[mid] > target){
                return binarySearch(a, target, min, mid - 1);
            }else{
                return mid;
            }
        }
    }
    
    
    
    public int binarySearch(String[] a, String target){
        return binarySearch(a, target, 0, a.length - 1);
    }
    
    private int binarySearch(String[] a, String target, int min, int max){
        if(min > max){
            return -1;
        }else{
            int mid = (min + max) / 2;
            System.out.println("@@"+mid);
            
            if(a[mid].equals(target)){
                return mid;
            }else if(a[mid].compareTo(target) > 0) {
                return binarySearch(a, target, min, mid - 1);
            } else {
                return binarySearch(a, target, mid + 1, max);
            }
        }
    }
    
    
    
    
    
    
    
}
