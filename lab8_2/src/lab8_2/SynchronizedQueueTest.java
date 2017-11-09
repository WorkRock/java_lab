package lab8_2;
/*
 * ���ϸ� : SynchronizedQueueTest.java
 * �ۼ���: 2017�� 11�� 09��
 * �ۼ���: 201632023 ������
 * ����: �ϳ��� ���� ť�� �����ϴ� ������, �Һ��� �����带 �����ϴ� ���α׷�
 */

public class SynchronizedQueueTest {
	public static void main(String[] args) {
		System.out.println("lab8_2: ������");

		// ũ�� 5�� ���� ť�� ����
		SynchronizedQueue queue = new SynchronizedQueue(5);

		// ���� ť�� �����ϴ� ������ ������, �Һ��� �����带 ����
		Thread producer = new ProducerThread(queue);
		Thread consumer = new ConsumerThread(queue);
		producer.start();
		consumer.start();
	}
}


class ProducerThread extends Thread {
	private SynchronizedQueue queue;

	public ProducerThread(SynchronizedQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		for(int i = 1; i <= 20; i++) {
			System.out.println(currentThread().getName() + ": " + i + " ����");
			try {
				queue.enQueue(i);
				sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


class ConsumerThread extends Thread {
	private SynchronizedQueue queue;

	public ConsumerThread(SynchronizedQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		int sum = 0;
		try {
			sleep(3000);
			for(int i = 0; i < 20; i++) {
				int value = queue.deQueue();		
				System.out.println("\t\t\t" + currentThread().getName() + ": " + value + " �Һ�");
				sum += value;
				sleep((int) (Math.random() * 500));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�Һ��ڰ� ����� ���� �� = " + sum);
	}
}