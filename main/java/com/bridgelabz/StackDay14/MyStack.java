package com.bridgelabz.StackDay14;

public class MyStack {
	private final MyLinkedList myLinkedList; 
	public MyStack() {
		// TODO Auto-generated constructor stub
		this.myLinkedList = new MyLinkedList();

	}
	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}
	public void printStack() {
		myLinkedList.printNodes();
	}
	public INode peak() {
		return myLinkedList.head;
	}

}
