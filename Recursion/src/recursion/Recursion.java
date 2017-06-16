/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author shinji
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    static int n = 0;
    
    public static void main(String[] args) {
        
        // Recursive ReverseLines
        ReverseLines rl = new ReverseLines();
        
        // Recursive Reverse
        System.out.println(reverse("abcd"));
        
    }
    
    
    // Recursive Reverse
    public static String reverse (String s) {
        String rs = "";
        if(s.length() - 1 != n){
            char c = s.charAt(n);
            String s2 = s.replaceFirst(String.valueOf(c), "");
            rs = s2.concat(String.valueOf(c));
            n++;
            reverse(rs);
        }
        return rs;
    }

    
}
