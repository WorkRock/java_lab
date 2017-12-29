package hw6_1;

public class MetroCard {
	private int balance; // �ܾ��� ������ �ʵ� ����
	
	// �ܾ��� �Ű������� �޾� �ʱ�ȭ �ϴ� ������
	public MetroCard(int balance){
		this.balance = balance;
	}
	
	 // getBalance() - �ܾ� getter
	public int getBalance(){
		return balance;
	}
	
	// ride() - 1ȸ ž�¸��� ȣ��Ǵ� �޼ҵ�
	public void ride(){
		if(balance>=1000) // �ܾ��� 1000������ ũ�ų� �������� ȣ��
		{
			System.out.println("ž�� �㰡");
			balance -= 1000;
		}
		else // �ƴҽ� �ȳ����� �Բ� ž�� �Ұ� �ȳ�
			System.out.println("�ܾ� ����");
	}
	
	// charge() -�Ű������� ���� �ݾ׸�ŭ �����ϴ� �޼ҵ�
	public void charge(int balance){
		this.balance += balance;
	}
}
