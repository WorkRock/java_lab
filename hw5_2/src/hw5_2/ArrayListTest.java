//***************************
// ���ϸ�: ArrayListTest.java
// �ۼ���: 201632023 ������
// �ۼ���: 17. 09. 20.
// ����: �ڹ� API�� ArrayList�� �����Ѵ�.
//***************************
package hw5_2;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListTest{
	public static void main(String[] args) {
		System.out.println("hw5_2 : ������");
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(-999);
		list.add(50);
		list.add(90);
		list.add(10);

		System.out.println(list);
		System.out.println("����Ʈ ũ�� : " + list.size());

		int index;
		Scanner input = new Scanner(System.in);
		System.out.print("\n��ȸ�� �ε��� �Է� : ");
		index = input.nextInt();

		System.out.println("�ε���" + index + "�� ���� : " + list.get(index));

		System.out.print("\n777�� ������ �ε��� �Է� : ");
		index = input.nextInt();
		list.remove(index);
		list.add(index, 777);
		System.out.println(list);

		System.out.print("\n999�� ������ �ε��� �Է� : ");
		index = input.nextInt();
		list.add(index, 999);
		System.out.println(list);

		System.out.print("\n������ �ε��� �Է� : ");
		index = input.nextInt();
		System.out.println("�ε���" + index + "�� ���� : " + list.remove(index));
		System.out.println(list);
	}
}
