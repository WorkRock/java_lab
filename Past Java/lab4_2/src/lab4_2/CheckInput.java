/*
 * ��¥ : 17. 03. 27.
 * ���� �̸� : lab4_2
 * �ۼ��� : 201632023 ������
 * ���� : �迭�� �ݺ��� ����
 */
package lab4_2;
import java.util.Scanner;
public class CheckInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// double�� �迭 ���� �� �ʱ�ȭ
		double[] temp = {-5.0, 0.2, 7.0, 9.5, 15.0, 25.5, 28.0, 30.5, 29.5, 18.5, 8.0, -1.5};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("lab4_2 : ������");
		int roof = 0; // �ݺ��� ���� int�� ���� ���� �� �ʱ�ȭ
		
		while(roof == 0) // while���� �̿��� roof�� 0�� �ƴҶ����� �ݺ�
		{
			int month; // ����ڿ��� ���ϴ� ���� �Է¹��� int�� ���� ����
			System.out.print("1~12������ ���� �Է��ϼ���: "); // �˸��� �ȳ����� �Բ� �Է� �ȳ�
			month = input.nextInt();
			
			// if���� ����ؼ� month�� 1~12�� �������� Ȯ��
			if(month<=12 && month>=1)
			{
				System.out.println(month + "���� ��� ��� = " +temp[month-1]);
				roof = -1; // month�� 1~12�� �����̸� roof���� �����ؼ� �ݺ��� ����
			}
		}
	}
}
