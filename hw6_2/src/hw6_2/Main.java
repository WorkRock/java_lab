package hw6_2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// (1) �������� ������ LinkedList ��ü�����Ͽ� ���� list�� ����(raw type ��� ����)
		LinkedList<Integer>list = new LinkedList();

		Scanner scan = new Scanner(System.in);
		System.out.println("�޴� ��ȣ�� �Է��ϼ���.");
		int menu = 0;
		int item = 0;
		int index = 0;

		// ���Ḧ ������ ������ �ݺ��Ͽ� �޴��� �����ϰ� �׿� �´� �۾��� ����
		do {
			System.out.print("1:����Ʈ��� 2:�Ǿջ��� 3:�Ǿջ��� 4:�˻� 5:�ε������� 6:�ε������� 9:���� --->");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("����Ʈ����� �����մϴ�.");
				System.out.println(list);		// (2)
				break;
			case 2:
				System.out.println("�Ǿջ����� �����մϴ�.");
				System.out.print("������ ���� �Է�:");
				item = scan.nextInt();
				list.addFirst(item);;		// (3)
				break;
			case 3:
				System.out.println("�Ǿջ����� �����մϴ�.");
				System.out.println("������ ���� = " + list.removeFirst());	// (4)
				break;
			case 4:
				System.out.println("�˻��� �����մϴ�.");
				System.out.print("�˻��� ���� �Է�:");
				item = scan.nextInt();
				if(item == list.element())			// (5)
					System.out.println("�˻� ����");
				else
					System.out.println("�˻� ����");
				break;
			case 5:
				System.out.println("�ε��������� �����մϴ�.");
				System.out.print("�ε��� �Է�:");
				index = scan.nextInt();
				System.out.print("������ ���� �Է�:");
				item = scan.nextInt();
				list.add(index, item);;		// (6)
				break;
			case 6:
				System.out.println("�ε��������� �����մϴ�.");
				System.out.print("�ε��� �Է�:");
				index = scan.nextInt();
				System.out.println("������ ���� = " + list.remove(index));	// (7)
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

