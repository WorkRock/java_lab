package hw8_2;

import java.util.Scanner;

public class MyLinkedQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedQueue queue = new MyLinkedQueue();
		int menu = 0;
		int item = 0;
		System.out.println("hw8_2 : ������");
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("1:���� 2:���� 3:��ü���� 4:���� --->");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("������ �����մϴ�.");
				System.out.print("������ ���� �Է�:");
				scan.nextLine();
				item = scan.nextInt();
				queue.enQueue(item);
				break;
			case 2:
				System.out.println("������ �����մϴ�.");
				System.out.println("������ ���� = " + queue.deQueue());
				break;
			case 3:
				System.out.println("��ü������ �����մϴ�.");
				while(!queue.isEmpty()) {
					System.out.println("������ ���� : " + queue.deQueue());
				}
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�޴� ��ȣ ����: �޴��� �ٽ� �����ϼ���.");
			}
		} while(menu != 4);
	}
}
