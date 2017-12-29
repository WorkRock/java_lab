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
	// 카드를 생성하여 덱에 넣는다.
	public Deck() {
		// 20장의 카드를 가지고 잇는 덱을 만든다.
		for (int i = 1; i < 21; i++){
			this.deck.add(new Card(i));
		}
	}
	// 카드를 섞는다.
	public void shuffle() {
		Collections.shuffle(deck);
	}

	// 덱의 처음에서 카드를 제거하여서 반환한다.
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
		System.out.println("플레이어"+i+list);
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
		System.out.println("hw15_1: 김희수");
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
		
		System.out.println("플레이어1 카드 합="+sum1);
		System.out.println("플레이어2 카드 합="+sum2);
		
		if(sum1>sum2){
			System.out.println("플레이어1 승리");
		}
		else if(sum2>sum1){
			System.out.println("플레이어2 승리");
		}
		else{
			System.out.println("무승부");
		}
	}
}