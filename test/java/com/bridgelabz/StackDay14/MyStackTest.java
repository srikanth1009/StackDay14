package com.bridgelabz.StackDay14;
import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
	@Test
	public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70); 
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30); 
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56); 
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push( myThirdNode);
		INode peak = myStack.peak();
		myStack.printStack();
		Assert.assertEquals(myThirdNode,peak);

	}
}
