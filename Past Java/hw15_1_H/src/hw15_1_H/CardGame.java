package hw15_1_H;
import java.util.ArrayList;
import java.util.Collections;

class Card {
	int number;
	
	public Card(int number) {
		this.number = number;	
	}
	@Override
	public String toString() {
		return number+"";
	} 	
}

class Deck {
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

class Player {
	ArrayList<Card> list = new ArrayList<Card>();

	public void getCard(Card card) {
		list.add(card);
	}

	public void showCards(int i) {
		System.out.println("�÷��̾�"+i+list);
	}
	
	public int sum(){
		int sum1 = 0;
		for(Card c:list){
			sum1 += c.number;
		}
		
		return sum1;
	}
}

public class CardGame {
	public static void main(String[] args) {
		System.out.println("hw15_1: �����");
		int sum1 = 0;
		int sum2 = 0;
		Deck deck = new Deck();
		deck.shuffle();
		Player p1 = new Player();
		Player p2 = new Player();
		for(int i=0; i<10; i++){
			p1.getCard(deck.deal());
			p2.getCard(deck.deal());	
		}
		sum1 = p1.sum();
		sum2 = p2.sum();
		p1.showCards(1);
		p2.showCards(2);
		
		System.out.println("�÷��̾�1 ī�� ��="+sum1);
		System.out.println("�÷��̾�2 ī�� ��="+sum2);
		
		if(sum1>sum2){
			System.out.println("�÷��̾�1 �¸�");
		}
		else if(sum2>sum1){
			System.out.println("�÷��̾�2 �¸�");
		}
		else{
			System.out.println("���º�");
		}
	}
}