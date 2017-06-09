/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmanalysisex;

/**
 *
 * @author shinji
 */
public class AlgorithmAnalysisEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  dominant term(worst)
        2n : exoinents
        nx : 
        log :
        n :
        
        
        */
    }
    public static void ex_a_02(){
        /*
        F(n) = 25 + 5 n3 log (n) + 26 n2 + 100 n4
        A. n4
        */
        
        /*
        for(i = 1; i < n; i++) => n => 0(n)
        for(i=0; i<n;i++) => n => o(n)
        for(i=1;i<n*n;i++)
        =>n*n
        =>n2
        =>o(n2)
        */
        
        /*
            O(m*n)
        */
        
        /*
        outer: n2
        inner: log n
        o(n2 log n)
        */
    }
    
    public static void ex_a_01(){
        // 01. 5 + 0.001n3 + 0.0025n
        // constants is always igonore
        // n3 > n
        
        // n1.5 > n log10 n
        // o(n1.5)
        //
        
        // 03. 2.5 n1.75
        
        // 04. 
        // o(n2 log2 n)
        
        // 05
        // o(n log n)
        
        // 06
        /*
            3 log8 n => 2 log n
            log2 log2 log2 n => log n
            A. O(log n) // both are same
        
        
        07. n2
        08. n2
        09. n1.25
        10. n(log2 n)2 // 2times is more
        11. n3
        12. log n
        
        */
        
    }
    
    public static void ex01(){
        // Big O
        // a. 10n2 + 100 + 1000
        // order is n2(n squared)
        
        //7 is constants
        //n 
        //o(n3)
        
        // c. 
        // 2n > n3
        // o(2n)
        
        // n2 log n
        // o (n2 log n)
    
    }
    
    public static void ex02(){
        // O(n) (for loop)
        // Arrays.sort(a) = o(n2)    
    }
    
    public static void ex03(){
        
        // o + 2 + 4 .... + (n + 2)
        //n + 1 / 2
        /// n * (n + 1)/2
        // n2 * n / 2 ( 1/2 n2 * 1/2 *)
        // dominate dom (greatest value)
        
        
        // complexity is ... o(n2)
    }
    
    
    
}
