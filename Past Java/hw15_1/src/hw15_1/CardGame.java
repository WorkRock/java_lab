/*
 * 날짜 : 2017. 06. 14.
 * 작성자 : 201632023 이지훈
 * 목적 : 컬렉션 클래스와 메소드, ArrayList클래스 사용 연습
 */
package hw15_1;

import java.util.ArrayList;
import java.util.Collections;

// 소스를 입력하고 Ctrl+Shift+O를 눌러서 필요한 파일을 포함한다. 

class Card { // 카드를 맹글어줄 클레스 정의
	int number;

	public Card(int number) {
		this.number = number;	
	}
	@Override
	public String toString() {
		return number+"";
	} 	
}

class Deck { // 덱을 생설할 클레스 정의
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

class Player { // 매칭을 하게될 플레이어 정의
	ArrayList<Card> list = new ArrayList<Card>();

	public void getCard(Card card) { // 카드를 뽑는다
		list.add(card);
	}

	public void showCards(int i) { // 자신의 패를 드러낸다
		System.out.println("플레이어" + i + "의 패 " + list);
	}

	public int sum(){ // 패의 합을 계산한다
		int total = 0;
		for(Card c:list){
			total += c.number;
		}
		return total;
	}
}

public class CardGame {
	public static void main(String[] args) {
		System.out.println("hw15_1: 이지훈");
		int p1Sum = 0; // 플레이어 1의 합을 저장할 int형 변수 정의 및 초기화
		int p2Sum = 0; // 플레이어 2의 합을 저장할 int형 변수 정의 및 초기화
		Deck deck = new Deck();
		deck.shuffle(); // 섞어준다
		Player p1 = new Player();
		Player p2 = new Player();
		for(int i=0; i<10; i++){ // 카드뽑기
			p1.getCard(deck.deal());
			p2.getCard(deck.deal());	
		}
		p1Sum = p1.sum(); // 플레이어 1 합 저장
		p2Sum = p2.sum(); // 플레이어 2 합 저장
		p1.showCards(1); // 패를 공개한다
		p2.showCards(2);
		
		System.out.println("플레이어1 카드 합 =" + p1Sum); // 적절한 안내문과 함께 패의 합을 공개한다.
		System.out.println("플레이어2 카드 합 =" + p2Sum);
		
		if(p1Sum > p2Sum) { // p1Sum이 더 크게되면 플레이어1의 승리이다.
			System.out.println("플레이어1의 승리입니다!");
		}
		else if(p2Sum > p1Sum) {
			System.out.println("플레이어2의 승리입니다!");
		}
		else { // 거의 나오지 않지만 비기기도 하기에 비기는 경우도 생성해준다
			System.out.println("세상에... 비겼네요!");
		}
	}
}