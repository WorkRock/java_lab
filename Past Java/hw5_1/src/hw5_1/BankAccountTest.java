/*
 * ��¥ : 17. 04. 11
 * �ۼ��� : 201632023 ������
 * ���ϸ� : hw5_1
 * ���� : �ʵ�� �޼ҵ带 ���� Ŭ���� ���� 
 */

package hw5_1;
import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount chargeMoney = new BankAccount(); // �������(BankAccount) ��ü ����
		
		System.out.println("hw5_1 : ������");
		/* �ܰ� 1
		chargeMoney.deposit(3000); // ��ü�� �̿��� deposit �Լ��� �ҷ��� 3000�� �Ա�
		System.out.println("���� ���� �ܾ� : " + chargeMoney.getBalance()); // ��ü�� �̿��� ���� ���� �ݾ� ���
		chargeMoney.withdraw(4000); // ��ü�� �̿��� withdraw �Լ��� �ҷ��� 4000�� ���
		System.out.println("���� ���� �ܾ� : " + chargeMoney.getBalance()); // �ܾ� ���
		chargeMoney.withdraw(1000); // ��ü�̿�, 1000�� ���
		System.out.println("���� ���� �ܾ� : " + chargeMoney.getBalance()); // �ܾ� ���
		*/
		
		// �ܰ� 2
		int inputNum; // ����ڿ��� �Է¹��� int�� ���� ����
		Scanner input = new Scanner(System.in); // ScannerŸ�� ����
		
		int roof = 0; // �ݺ����� �ݺ��� ���� ���� roof ����
		
		// while���� ���. roof�� 0�� �ƴҶ� ���� ���� �ݺ�
		while(roof == 0)
		{
			System.out.print("1:�Ա�, 2:���, 3:�ܾ���ȸ, 4:���� --> "); // �˸��� �ȳ����� �Բ� �Է� �ȳ�
			inputNum = input.nextInt(); // ����ڿ��� �Է¹ޱ�
			
			// switch���� �̿��� ����ڰ� �Է��� ��ȣ ã�ư���
			switch(inputNum)
			{
				case 1: // 1�� ���
					System.out.println("�Աݾ��� �Է��ϼ��� : "); // �˸��� �ȳ����� �Բ� �Է� �ȳ�
					inputNum = input.nextInt(); // ����ڿ��� �Աݾ��� �Է� �ް�
					chargeMoney.deposit(inputNum); // ��ü�� �̿��ؼ�  �Ա��Լ� ���, �Աݾ� ����
					break; // Ż��
				case 2: // 2�� ���
					System.out.println("��ݾ��� �Է��ϼ��� : "); // �˸��� �ȳ����� �Բ� �Է� �ȳ�
					inputNum = input.nextInt(); // ����ڿ��� ��ݾ��� �Է� �ް�
					chargeMoney.withdraw(inputNum); // ��ü�� �̿��ؼ� ����Լ� ���, ��ݾ� ����
					break; // Ż��
				case 3: // 3�� ���
					System.out.println("���� �ܾ� : " + chargeMoney.getBalance()); // ��ü�� �̿��� ���� �ܾ��� �ҷ���
					break; // Ż��
				case 4: // 4�� ���
					System.out.println("���α׷��� �����մϴ�."); // �˸��� �ȳ��� ���
					roof = 1; // roof�� 1�� �ٲپ� ���ѹݺ� ����
					break; // Ż��
				default: // 1,2,3,4�� �ƴѰ��
					System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��� �ּ���."); // ���Է��� �䱸�ϴ� �ȳ��� ���
					break; // Ż�� 
			}
		}
	}

}
