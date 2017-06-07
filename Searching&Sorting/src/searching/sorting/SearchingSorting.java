/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching.sorting;

import java.util.Arrays;

/**
 *
 * @author shinji
 */
public class SearchingSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // linear Search Integer
        int[] intArray = new int[] {4,5,6,7,8,2,63,45,7,131,63,121};
        linearSearchOld ls = new linearSearchOld();
        int o = ls.linearSearch(121,intArray);
        System.out.println("linear Search : intArray =======================");
        System.out.println(o);
        
        
        String[] stringArray = new String[] {
            "tonkotsu","miso","shoyu","sora","shio"
        };
        int so = ls.linearSearch("shoyu",stringArray);
        System.out.println("linear Search : stringArray =======================");
        System.out.println(so);
        
        
        Integer[] objArray = new Integer[] {
            3,4,11,64,234567,735,4666,2333,98
        };
        int oo = ls.linearSearch(98,objArray);
        System.out.println("linear Search : objArray =======================");
        System.out.println(oo);
        
        
        SortingandSearching ss = new SortingandSearching();
        int sso = ss.binarySearch(intArray, 121);
        System.out.println("binary Search : intArray =======================");
        System.out.println(sso);
//        boolean sso2 = ss.binarySearch(intArray, 0, intArray.length, 121);

        Student s = new Student(2);
        Student s2 = new Student(21);
        Student[] StudentArray = new Student[] {s2,s,new Student(212)};
        Comparable [ ] a = new Student [ 2 ];
        a = StudentArray;
        Comparable t = new Student(21);
        int x = SortingandSearching.binarySearch(a, 0, 2, t);
        System.out.println("binary Search(generic) : StudentArray =======================");
        System.out.println(x);
        
        
        
        SearchingRecursive sr = new SearchingRecursive();
        int sro = sr.binarySearch(intArray, 121);
        System.out.println("binary Search(Recursive) : intArray ==============");
        System.out.println(sro);
        
        
        
        System.out.println("binary Search(Recursive) : stringArray ==============");
        String[] stringArray2 = new String[] {
            "tonkotsu","miso","shoyu","sora","shio"
        };
        Arrays.sort(stringArray2);//miso,shio,shoyu,sora,tonkotsu
        for(String i:stringArray2){
            System.out.println(i);
        };
        int srso = sr.binarySearch(stringArray2, "miso");
        System.out.println(srso);
        
    }
    
    
    
}
