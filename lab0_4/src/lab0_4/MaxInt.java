package lab0_4;

import java.util.Scanner;

public class MaxInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("lab0_4 : ������");
		int a;
		int b;
		System.out.print("�� ������ �Է� �ϼ��� : "); // �˸��� �ȳ����� �Բ� �Է� �ȳ�
		a = input.nextInt();
		b = input.nextInt();
		
		System.out.println("�ִ밪 : " + findMax(a,b)); // findMax�żҵ� ȣ��
	}
	
	public static int findMax(int a, int b) // �ΰ��� ������ �Ű������� �ް� int���� �����ϴ� findMax �޼ҵ� ����
	{
		int max = 0; // �ִ밪�� ������ int�� ���� ���� �� �ʱ�ȭ
		if(a>b)
			max = a;
		else
			max = b;
		return max; // �ִ밪 ����
	}
}
