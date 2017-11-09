package hw8_1;

import java.util.NoSuchElementException;

public class MyCircularQueue {
	private int[] array; 
	private int capacity;
	private int count = 0;
	private int front = 0;
	private int rear = 0;
	
	public MyCircularQueue(int capacity) {
		this.capacity = capacity;
		array = new int[capacity];
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public boolean isFull() {
		return count == capacity;
	}
	
	public void enQueue(int item) throws Exception{
		if(isFull())
			throw new Exception("에러! 큐가 가득찼습니다!");
		else {
			rear = (rear + 1) % capacity;
			array[rear] = item;
			++count;
		}
	}
	
	public int deQueue() throws NoSuchElementException{
		if(isEmpty())
			throw new NoSuchElementException("에러! 큐가 비어있습니다!");
		else {
			front = (front + 1) % capacity;
			int item = array[front];
			--count;
			return item;
		}
	}
}
