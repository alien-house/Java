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
public class Queuedemo {
    public static void main(String[] args) {  
  Queue queueDemo = new Queue();  
  queueDemo.enQueue(0);
  queueDemo.enQueue(23);  
  queueDemo.enQueue(2);  
  queueDemo.enQueue(73);  
  queueDemo.enQueue(21);  
  queueDemo.deQueue();
  queueDemo.deQueue();  
  queueDemo.deQueue();  
  queueDemo.deQueue();  
 }  
    
}
