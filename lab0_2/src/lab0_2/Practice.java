//***************************
// ���ϸ�: Practice.java
// �ۼ���: 201632023 ������
// �ۼ���: 17. 08. 30
// ����: Ű���� �Է�, �ݺ���, ���ǹ�, �迭 ��, �ڹ� ���α׷����� �����Ѵ�.
//***************************
package lab0_2;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab0_2 : ������");
		Scanner input = new Scanner(System.in); // Scanner ����
		int[] arr = new int[10]; // 10���� ������ �����ϴ� int�� �迭 ����
		double total = 0; // �迭�� ���� ������ double�� ���� ���� �� �ʱ�ȭ
		System.out.print("10���� ���� �Է� : "); // �˸��� �ȳ����� �Բ� �Է� �ȳ�
		for(int i = 0; i<10; i++)
		{
			arr[i] = input.nextInt();
			total += arr[i]; // total�� �迭�� �� ����
		}
		double aver = total/10; // ����� ������ double�� ���� ���� �� �ʱ�ȭ
		System.out.println("��� : " + aver);
		System.out.println("��� �̻��� �� : ");
		for(int i = 0; i<10; i++)
		{
			if(arr[i]>=aver) // ��պ��� ū�ų� ���� �� ã�Ƴ���
				System.out.print(arr[i] + " ");
		}
	}

}
