//***************************
// ���ϸ�: MaxInt.java
// �ۼ���: 201632023 ������
// �ۼ���: 17. 09. 03
// ����: �ִ밪 ã�� �˰����� ������.
//***************************
package lab0_3;

import java.util.Scanner;

public class MaxInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab0_3 : ������");
		Scanner input = new Scanner(System.in); // Scanner ����
		int a;
		System.out.print("���� ������ �Է��ϼ���: ");
		a = input.nextInt();
		int[] arr = new int[a]; // �Է¹��� �� ��ŭ ������ �����ϴ� int�� �迭 ����
		
		if(a == 0) // a�� 0�̸� ������ �Է� ���� �� �����Ƿ� ���� ������ ���� ������ ���α׷��� �����Ѵ�.
			System.out.println("�ִ밪 : ����(�Է¹��� ������ �����ϴ�.)");
		else
		{
			int max = arr[0]; // �ִ밪�� ������ int�� ���� ���� �� �迭�� ù��° ������ �ʱ�ȭ
			System.out.print(a + "���� ���� �Է� : "); // �˸��� �ȳ����� �Բ� �Է� �ȳ�
			for(int i = 0; i<a; i++)
			{
				arr[i] = input.nextInt();
				max = arr[0]; // max�� �迭�� ù �� ����
				if(arr[i]>max)
					max = arr[i]; // �迭���� ���� �ִ밪���� Ŭ �� max�� �� �� �ٽ� ����
			}
			System.out.println("�ִ밪 = " + max); // �ִ밪 ���}
		}
	}
}