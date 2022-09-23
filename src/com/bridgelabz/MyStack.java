package com.bridgelabz;

public class MyStack {
	
		private MyNode MyNode;

		public MyStack() {
			this.MyNode = new MyNode();
		}

		public void push(MyNode newNode) {
			MyNode.add(newNode);
			
		}
		public void printStack() {
			MyNode.printLinkedList();
		}
	
	
}
