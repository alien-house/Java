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
public class Queue {

    private static final int capacity = 3;
    int arr[] = new int[capacity];
    int size = 0;
    int front  = -1;   //index if stack
    int rear = 0;

    public void enQueue(int Element) {
        if (front < capacity - 1) {
            front++;
            arr[front] = Element;
            System.out.println("Element " + Element
                    + " is pushed to Queue !");
            display();
        } else {
            System.out.println("Overflow !");
        }

    }

    public void deQueue() {
        if (front  >= rear) {
            rear++;
            System.out.println("Pop operation done !");
            display();
        } else {
            System.out.println("Underflow !");
        }
    }

    public void display() {
        if (front >= rear) {
            System.out.println("Elements in Queue : ");
            for (int i = rear; i <= front ; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
