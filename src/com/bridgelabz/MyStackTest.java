package com.bridgelabz;

import java.util.Stack;

public class MyStackTest {

	public static void main(String[] args) {
	
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
	}

}
