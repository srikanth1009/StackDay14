package com.bridgelabz.StackDay14;
	import org.junit.Assert;
	import org.junit.Test;

public class MyQueueTest {
		
		@Test
		public void given3NumbersInQueueWhenAddedShouldPassQueueTest() {
			MyQueue<Integer> myQueue = new MyQueue<Integer>();
			MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
			MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
			MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
			myQueue.enqueue(myFirstNode);
			myQueue.enqueue(mySecondNode);
			myQueue.enqueue(myThirdNode);
			INode<Integer> myNode = myQueue.peak();
			myQueue.printQueue();
			Assert.assertEquals(myNode, myFirstNode);
		}

}
