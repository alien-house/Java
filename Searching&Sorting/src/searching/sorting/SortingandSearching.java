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
public class SortingandSearching<T extends Comparable>{
   
    public static <T extends Comparable<T>> int binarySearch(T[] data, int min, int max, T target) {
    
            System.out.println("とおた");
	for (int i = min; i <= max; i++) {
	    if (data[i].compareTo(target) == 0) return i;
	} // for
	return -1;
    }
    
    
//    public boolean linearSearch (T[] data,int min, int max, T target) {
//      int index = min;
//      boolean found = false;
//
//      while (!found && index <= max) {
//        if (data[index].compareTo(target) == 0) {
//            found = true;
//            index++;
//        }
//      }
//      return found;
//   }
    
    
    public int binarySearch(int[] a, int target){
        int min = 0;
        int max = a.length - 1;
        while(min <= max){
            int mid = (min + max) / 2;
//            System.out.println("binary:"+mid);
            if(a[mid] < target){
                min = mid + 1;
            }else if(a[mid] > target){
                max = mid - 1;
            }else{
                return mid;
            }
        }
        return - (min + 1);
    }
    
    
    
}
