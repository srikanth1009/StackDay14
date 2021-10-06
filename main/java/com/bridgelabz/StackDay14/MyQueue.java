package com.bridgelabz.StackDay14;

public class MyQueue<K> {
		public final MyLinkedList myLinkedList;

		public MyQueue() {
			this.myLinkedList = new MyLinkedList();

		}

		public void enqueue(INode element) {
			myLinkedList.append(element);
		}

		public INode peak() {
			return myLinkedList.head;
		}
		public INode<K> dequeue() {
			return myLinkedList.popLast();
		}


		public void printQueue() {
			myLinkedList.display();
		}

}

