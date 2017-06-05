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
public class linearSearchOld {
    static final int NONE = -1;
    
    public linearSearchOld() {
      
    }
    
    public int linearSearch(int target, int[] a) {
        for (int p = 0; p < a.length; p++) {
            if (target == a[p]) return p;
        }
       return NONE;
    }

    public int linearSearch(String target, String[] a) {
        for (int p = 0; p < a.length; p++) {
            if (target.equals(a[p])) return p;	
        }	
        return NONE;
    }
    
    static int linearSearch(Object target, Object[] a) {
        for (int p = 0; p < a.length; p++) {
            if (target.equals(a[p])) return p;
        }
        return NONE;
    }


    
    
    
}
