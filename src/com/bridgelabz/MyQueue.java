 package com.bridgelabz;

public class MyQueue {
	private MyNode MyNode;

	public MyQueue() {
		MyNode = new MyNode();
	}
	
	public void enQueue(MyNode newNode) {
		MyNode.addAtEnd(newNode);
	}
	 
	public void printStack() {
		MyNode.printLinkedList();
	}
	 
	public void deQueue() { 
		MyNode.popAtEnd(MyNode);
		           
	}
}
