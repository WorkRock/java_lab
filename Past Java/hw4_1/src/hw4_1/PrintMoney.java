/*
 * �ۼ��� : 17. 04. 01.
 * �ۼ��� : 201632023 ������
 * ���ϸ� : hw4_1
 * ���� : ����� �迭 ����
 */
package hw4_1;
import java.util.Scanner;
public class PrintMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fee = {5000,15000,20000,20000}; // ȸ�� �����ϴ� int�� �迭 ���� �� �ʱ�ȭ

		String [] question = {"1 + 1","5 - 2","2 * 3","8 / 2"}; // ������ ������ String�� �迭 ���� �� �ʱ�ȭ

		int[] correct = {2,3,6,4}; // ������ ���� ������ int�� �迭 ���� �� �ʱ�ȭ

		System.out.println("hw4_1 : ������"); 

		int a, roof = 0; // ����ڿ��� �Է� ���� ���� ����, ���� �ݺ��� ���� ���� ���� �� �ʱ�ȭ

		Scanner input = new Scanner(System.in);

		// while���� ����ؼ� 1~4 ������ ���ڰ� �ƴϸ� �������� �ݺ���Ű��
		while(roof == 0)
		{
			System.out.print("1~4 ������ �г� �Է� : "); // ������ �ȳ����� �Բ� �Է� �ȳ�
			a = input.nextInt();
			
			// ����ڰ� 1~4�� ���� �����ϸ� ���� ����
			if(a>=1 && a<=4) 
			{
				roof = 1; // �ݺ��� ������ ���� roof�� 1�� ����
				int answer; // ������ ������ int�� ���� ����
				System.out.print(question[a-1] + " = "); // �˸��� �ȳ����� �Բ� �Է� �ȳ�
				answer = input.nextInt();
				
				if(answer == correct[a-1]) // �����Ͻ� 10%���ε� �������� ȸ�� ���
				{
					int salePrice = fee[a-1] - fee[a-1]/10; // 10% ���� ȸ�� ������ int�� ���� ���� �� �ʱ�ȭ
					System.out.println("�����Դϴ�.");
					System.out.println("ȸ��� "+ salePrice +  "���Դϴ�." );
				}
				else // �����Ͻ� ���� �������� ȸ�� ����
				{
					System.out.println("Ʋ�Ƚ��ϴ�.");
					System.out.println("ȸ��� "+fee[a-1] + "���Դϴ�." );
				}
			}
		}
	}

}
