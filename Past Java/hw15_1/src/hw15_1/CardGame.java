/*
 * ��¥ : 2017. 06. 14.
 * �ۼ��� : 201632023 ������
 * ���� : �÷��� Ŭ������ �޼ҵ�, ArrayListŬ���� ��� ����
 */
package hw15_1;

import java.util.ArrayList;
import java.util.Collections;

// �ҽ��� �Է��ϰ� Ctrl+Shift+O�� ������ �ʿ��� ������ �����Ѵ�. 

class Card { // ī�带 �ͱ۾��� Ŭ���� ����
	int number;

	public Card(int number) {
		this.number = number;	
	}
	@Override
	public String toString() {
		return number+"";
	} 	
}

class Deck { // ���� ������ Ŭ���� ����
	ArrayList<Card> deck = new ArrayList<Card>();
	// ī�带 �����Ͽ� ���� �ִ´�.
	public Deck() {
		// 20���� ī�带 ������ �մ� ���� �����.
		for (int i = 1; i < 21; i++){
			this.deck.add(new Card(i));
		}
	}
	// ī�带 ���´�.
	public void shuffle() {
		Collections.shuffle(deck);
	}

	// ���� ó������ ī�带 �����Ͽ��� ��ȯ�Ѵ�.
	public Card deal() {
		return deck.remove(0);
	}
}

class Player { // ��Ī�� �ϰԵ� �÷��̾� ����
	ArrayList<Card> list = new ArrayList<Card>();

	public void getCard(Card card) { // ī�带 �̴´�
		list.add(card);
	}

	public void showCards(int i) { // �ڽ��� �и� �巯����
		System.out.println("�÷��̾�" + i + "�� �� " + list);
	}

	public int sum(){ // ���� ���� ����Ѵ�
		int total = 0;
		for(Card c:list){
			total += c.number;
		}
		return total;
	}
}

public class CardGame {
	public static void main(String[] args) {
		System.out.println("hw15_1: ������");
		int p1Sum = 0; // �÷��̾� 1�� ���� ������ int�� ���� ���� �� �ʱ�ȭ
		int p2Sum = 0; // �÷��̾� 2�� ���� ������ int�� ���� ���� �� �ʱ�ȭ
		Deck deck = new Deck();
		deck.shuffle(); // �����ش�
		Player p1 = new Player();
		Player p2 = new Player();
		for(int i=0; i<10; i++){ // ī��̱�
			p1.getCard(deck.deal());
			p2.getCard(deck.deal());	
		}
		p1Sum = p1.sum(); // �÷��̾� 1 �� ����
		p2Sum = p2.sum(); // �÷��̾� 2 �� ����
		p1.showCards(1); // �и� �����Ѵ�
		p2.showCards(2);
		
		System.out.println("�÷��̾�1 ī�� �� =" + p1Sum); // ������ �ȳ����� �Բ� ���� ���� �����Ѵ�.
		System.out.println("�÷��̾�2 ī�� �� =" + p2Sum);
		
		if(p1Sum > p2Sum) { // p1Sum�� �� ũ�ԵǸ� �÷��̾�1�� �¸��̴�.
			System.out.println("�÷��̾�1�� �¸��Դϴ�!");
		}
		else if(p2Sum > p1Sum) {
			System.out.println("�÷��̾�2�� �¸��Դϴ�!");
		}
		else { // ���� ������ ������ ���⵵ �ϱ⿡ ���� ��쵵 �������ش�
			System.out.println("����... ���׿�!");
		}
	}
}