package hw6_1;
/*
 * ���ϸ�: MyDoublyLinkedListTest.java
 * �ۼ���: 201632023 ������
 * �ۼ���: 17. 10. 11.
 * ����: MyDoublyLinkedList ��ü�� �����ϰ� ����, ��� ����� �׽�Ʈ�ϴ� ���α׷�
 */

import java.util.Scanner;

public class MyLinkedListTest {
	public static void main(String[] args) {
		
		System.out.println("hw6_1: ������\n");

		MyLinkedList list = new MyLinkedList();

		Scanner scan = new Scanner(System.in);
		System.out.println("�޴� ��ȣ�� �Է��ϼ���.");
		int menu = 0;
		int item = 0;
		int index = 0;
		do {
			System.out.print("1:����Ʈ��� 2:�Ǿջ��� 3:�Ǿջ��� 4:�˻� 5:�ε������� 6:�ε������� 9:���� --->");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("����Ʈ����� �����մϴ�.");
				System.out.println(list.toString());
				break;
			case 2:
				System.out.println("�Ǿջ����� �����մϴ�.");
				System.out.print("������ ���� �Է�:");
				item = scan.nextInt();
				list.addFirst(item);
				break;
			case 3:
				System.out.println("�Ǿջ����� �����մϴ�.");
				System.out.println("������ ���� = " + list.removeFirst());
				break;
			case 4:
				System.out.println("�˻��� �����մϴ�.");
				System.out.print("� ���� ã���ʴϱ�?:");
				item = scan.nextInt();
				System.out.println("���� ���� ���� : " + list.contains(item));
				break;
			case 5:
				System.out.println("�ε��������� �����մϴ�.");
				System.out.print("������ �ε��� �Է�:");
				index = scan.nextInt();
				System.out.print("������ ���� �Է�:");
				item = scan.nextInt();
				list.add(index, item);
				break;
			case 6:
				System.out.println("�ε��������� �����մϴ�.");
				System.out.print("������ �ε��� �Է�:");
				item = scan.nextInt();
				System.out.println("������ ���� = " + list.remove(item));
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�޴� ��ȣ ����: �޴��� �ٽ� �����ϼ���.");
			}
		} while(menu != 9);
	}
}