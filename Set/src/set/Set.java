/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
/**
 *
 * @author shinji
 */
public class Set {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Z");
        hs.add("Y");
        hs.add("Y");
        hs.add("X");
        hs.add(null);
        
        HashSet<Integer> hs2 = new HashSet<Integer>(Arrays.asList(13,5,23,6));

        //画面表示
        Iterator<Integer> it = hs2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
}
