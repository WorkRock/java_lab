package lab_Prac;

import java.util.NoSuchElementException;

public class MyQueue {
	private Node front = null;
	private Node rear = null;
	
	private class Node{
		int data;
		Node link;
	}
	
	public void enQueue(int item) {
		Node newNode = new Node();
		newNode.data = item;
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		}
		else {
			rear.link = newNode;
			rear = newNode;
		}
	}
	public int deQueue() {
		if(isEmpty())
			throw new NoSuchElementException("삭제 실패");
		else {
			int item = front.data;
			front = front.link;
			if(front == null)
				rear = null;
			return item;
		}
	}
	public boolean isEmpty() {
		return front == null;
	}
	
	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		q.enQueue(2);
		q.enQueue(5);
		q.enQueue(3);
		q.enQueue(7);
		System.out.println(q.deQueue());
		q.enQueue(q.deQueue());
		System.out.println(q.deQueue());
	}
}
