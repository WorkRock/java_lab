/*
 * ��¥ : 17. 04. 11
 * �ۼ��� : 201632023 ������
 * ���ϸ� : hw5_1
 * ���� : �ʵ�� �޼ҵ带 ���� Ŭ���� ���� 
 */

package hw5_1;

// �ʵ� ����
public class BankAccount {
	int balance; // �ܾ��� ������ int�� ���� ����
	
	// �Ա� ������ ������ �޼ҵ� ����
	void deposit(int money) // �Ű����� : �ݾ�  / ���ϰ� : ����
	{
		balance += money;
	}
	
	// ��� ������ ������ �޼ҵ� ����
	void withdraw(int money) // �Ű����� : �ݾ� / ���ϰ� : ����
	{
		if(balance>=money) // ��ݾ��� �ܾ׺��� ū ���� �������� �ʴ´�.
			balance -= money;
	}
	
	// ���� �ܾ� ����� ������ �޼ҵ� ����
	int getBalance() // �Ű����� : ���� / ���ϰ� : ���� �ݾ�
	{
		int remainMoney = balance; // int�� ������ ���� �ݾ� ����
		return remainMoney; // ���� �ݾ� ���
	}
}
