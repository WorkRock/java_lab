package lab8_1;

/*
 * 파일명 : SynchronizedQueue.java
 * 작성일: 2017년 11월 2일
 * 작성자: 201632023 이지훈
 * 내용: 배열로 구현한 동기화된 원형 큐
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
	
	public SynchronizedQueue(int capacity) {
		this.capacity = capacity; 
		array = new int[capacity]; // 큐의 크기 초기화
	}
	
	public boolean isEmpty() {
		return front == rear; // 맨앞과 뒤가 같다 = 비어있다
	}
	
	public boolean isFull() { // 마지막 배열값 +1을 전체 크기로 나눌시 나머지는 0 = 꽉차있다
		return (rear + 1) % capacity == front;
	}

	public void enQueue(int item) throws InterruptedException {
		lock.lock(); // 행동이 끝날때까지 대기
		try {
			while (isFull()) { // 꽉차있을시 대기
				System.out.println("enQueue : 큐가 가득차서 기다립니다.");
				notFull.await(); // notFull대기				
			}
			rear = (rear + 1) % capacity; // 꽉차있을시에는 맨앞으로, 아닐시 1칸증가
			array[rear] = item; // 값을 넣어줌
			notEmpty.signal(); // notEmpty에 신호를줌
		} finally {
			lock.unlock(); // 행동이 끝나면 언락
		}
	}

	public int deQueue() throws InterruptedException {
		lock.lock(); // 행동이 끝날때까지 대기
		try {
			while (isEmpty()) { // 비어있을시 대기
				System.out.println("\t\tdeQueue : 큐가 비어서 기다립니다.");
				notEmpty.await(); // 꽉참상태 대기
			}
			front = (front + 1) % capacity; // 꽉차있을시 가장 앞으로, 아닐 시 1증가
			int item = array[front]; // item에 삭제할 원소 삽입
			notFull.signal(); // 비어있음 상태가 꽉참 상태에게 신호를 줌
			return item; // 삭제한 값 리턴
		} finally {
			lock.unlock(); // 행동이 끝나면 언락
		}
	}
}
