package hw8_2;

import java.util.NoSuchElementException;

public class MyLinkedQueue {
	private Node front = null;
	private Node rear = null;
	
	public boolean isEmpty() {
		return front == null;
	}


	public void enQueue(int item) {
		Node newNode = new Node();
		newNode.data = item;
		newNode.link = null;
		if(isEmpty()) {
			rear = newNode;
			front = newNode;
		}
		else {
			rear.link = newNode;
			rear = newNode;
		}
	}

	public int deQueue() throws NoSuchElementException{
		if(isEmpty())
			throw new NoSuchElementException("에러! 큐가 비어있습니다!");
		else {
			int item = front.data;
			front = front.link;
			if(front == null) {
				rear = null;
			}
			return item;
		}
	}
	
	private class Node{
		int data;
		Node link;
	}
}
