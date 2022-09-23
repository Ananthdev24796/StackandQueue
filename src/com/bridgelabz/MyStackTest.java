package com.bridgelabz;

import java.util.Stack;

public class MyStackTest {

	public static void main(String[] args) {
		 System.out.println("Stack");
		MyStack myStack = new MyStack();
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
        MyNode<Integer> thirdNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        myStack.push(firstNode); 
        myStack.push(secondNode); 
        myStack.push(thirdNode); 
       
        
       // To diplay the Stack
        System.out.println("\nAfter pushing three ");
       myStack.printStack(); 
       
       
       // To peek
       System.out.println("\nAfter peak ");
       myStack.peak();
       
       myStack.printStack(); 
       // To pop
       System.out.println("\nAfter pop  ");
       myStack.pop();
       
      
       System.out.println("\nQueue");
       
       MyQueue myQueue = new MyQueue();
       myQueue.enQueue(firstNode);
       myQueue.enQueue(secondNode);
       myQueue.enQueue(thirdNode);

    // To diplay the queue
       System.out.println("\nAfter EnQueue  ");
       myQueue.printStack(); 
       System.out.println("\nAfter DeQueue  ");
       myQueue.deQueue();
       myQueue.printStack(); 
       
	}

}
