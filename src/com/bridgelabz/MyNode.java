package com.bridgelabz;

public class MyNode<K extends Object> implements InterfaceNode {
	public static MyNode peak;
	private K key;
	private MyNode next;
	private MyNode head;
	private MyNode tail;
	
	public MyNode(K key) {
		
		this.key = key;
		this.next = null;
		this.head = null;
	}
	public MyNode() {
	
	this.key = null;
	this.next = null;
	this.head = null;
}
	public MyNode<K> getTail() {
		return tail;
	}
	
	public void setTail(MyNode<K> tail) {
		this.tail = tail;
	}
	
	
		
	public void setHead(MyNode<K> head) {
		this.head = head;
	}
	public MyNode<K> getHead() {
		return head;
	}

	
	public void setNext(MyNode<K> next) {
		this.next = next;
	}
	public MyNode<K> getNext() {
		return next;
	}

		
	public K getKey() {
		return  key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	
	// To Add element at begining
	
		public void add(MyNode newNode) {
			if(this.tail == null) {
				this.tail = newNode;
			}
			if(this.head == null) {
				this.head = newNode;
				newNode.next =null;
			}
			else {
				MyNode<K> tempNode = this.head;
				this.head=newNode;
				newNode.next=tempNode;
			}
			 System.out.println("\nLinked list after adding "+newNode.key+" at start");
			 this.printLinkedList();
		}
		// Print Linked List
		public void printLinkedList() {
			
			MyNode<K> tempNode = head;
			while(tempNode.next != null) {
				System.out.print(tempNode.getKey()+"->");
				tempNode =tempNode.next;		
				}
			System.out.print(tempNode.getKey());
			
		}

       // peak
		public MyNode peak() {
		return head ; 
}
		// Delete First element of linked list
		
		public void pop() {
			this.head = head.getNext();
			System.out.println("\n After Deleting 1st Element");
			this.printLinkedList();
			
			}
		// To Appending Node
		
		public void addAtEnd(MyNode newNode) {
			if(this.head == null) {
				this.head = newNode;
				this.tail = newNode;
				newNode.next= null;
			}
			else
			{
				this.tail.next = newNode;
	            newNode.next =null;
	           this.tail = this.tail.next;
				
			}
			 System.out.println("\nLinked list after appending "+newNode.key);
			 this.printLinkedList();
			
		}
		// To Remove
		public void popAtEnd(MyNode newNode)
		{
				MyNode tempNode = head;
				while(!tempNode.next.equals(tail)) {
					tempNode=tempNode.next;	
				}
						
				tempNode.next=null;
		
			}
}

