package hw6_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw6_1 : ������");
		MetroCard card = new MetroCard(2500); // �ܾ��� 2500���� ����ö ī�� �ϳ� �߱޹���
		
		 // 3ȸ ž�� - 2ȸ�� ������ ���̰�, 1ȸ�� ������ ����
		card.ride();
		card.ride();
		card.ride();
		
		System.out.println("���� �ܾ� : " + card.getBalance()); // �ܾ� ���
		
		card.charge(3000); // �ܾ׿� 3000�� ����
		
		System.out.println("���� �ܾ� : " + card.getBalance()); // �ܾ� ���
	}

}
