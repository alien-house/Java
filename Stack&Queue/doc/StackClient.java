/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

/**
 *
 * @author naimesh
 */
public class StackClient {
     public static void main(String[] args) {

        Stack stack = new Stack(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Size of stack after push operations: " + stack.size());

        System.out.printf("2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            //System.out.printf(" %d", stack.pop());
            System.out.println(" " + stack.pop());
        }

        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
    }
    
}
