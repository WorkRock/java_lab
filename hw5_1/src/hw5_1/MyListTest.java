//***************************
// ���ϸ�: MyListTest.java
// �ۼ���: 201632023 ������
// �ۼ���: 17. 09. 20.
// ����: �����ڷᱸ�� ������ �����Ѵ�.
//***************************

package hw5_1;

import java.util.Scanner;

public class MyListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList list = new MyList(); // MyList�� ��ü ����
		System.out.println("hw5_1 : ������");
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(-999);
		list.add(50);
		list.add(90);
		list.add(10);
		
		System.out.println(list.toString());
		System.out.println("����Ʈ ũ�� : " + list.size());
		
		int index;
		Scanner input = new Scanner(System.in);
		System.out.print("\n��ȸ�� �ε��� �Է� : ");
		index = input.nextInt();
		System.out.println("�ε���" + index + "�� ���� : " + list.get(index));
		
		System.out.print("\n777�� ������ �ε��� �Է� : ");
		index = input.nextInt();
		list.set(index, 777);
		System.out.println(list.toString());
		
		System.out.print("\n999�� ������ �ε��� �Է� : ");
		index = input.nextInt();
		list.add(999, index);
		System.out.println(list.toString());
		
		System.out.print("\n������ �ε��� �Է� : ");
		index = input.nextInt();
		list.remove(index);
		System.out.println(list.toString());
	}

}
