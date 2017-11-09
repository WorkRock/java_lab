package lab8_2;

/*
 * ���ϸ� : SynchronizedQueue.java
 * �ۼ���: 2017�� 11�� 09��
 * �ۼ���: 201632023 ������
 * ����: �迭�� ������ ����ȭ�� ���� ť
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedQueue {
	private final Lock lock = new ReentrantLock();
	private final Condition notFull  = lock.newCondition(); 
	private final Condition notEmpty = lock.newCondition(); 
	private int[] array; 
	private int capacity;
	private int front = 0;
	private int rear = 0;
	private int count = 0;
	
	public SynchronizedQueue(int capacity) {
		this.capacity = capacity;
		array = new int[capacity];
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public boolean isFull() {
		return count == capacity;
	}

	public void enQueue(int item) throws InterruptedException {
		lock.lock();
		try {
			while (isFull()) {
				System.out.println("enQueue : ť�� �������� ��ٸ��ϴ�.");
				notFull.await();				
			}
			rear = (rear + 1) % capacity;
			array[rear] = item;
			notEmpty.signal();
			++count;
		} finally {
			lock.unlock();
		}
	}

	public int deQueue() throws InterruptedException {
		lock.lock();
		try {
			while (isEmpty()) {
				System.out.println("\t\tdeQueue : ť�� �� ��ٸ��ϴ�.");
				notEmpty.await();
			}
			front = (front + 1) % capacity;
			int item = array[front];
			notFull.signal();
			--count;
			return item;
		} finally {
			lock.unlock();
		}
	}
}

