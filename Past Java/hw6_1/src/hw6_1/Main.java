package hw6_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw6_1 : 이지훈");
		MetroCard card = new MetroCard(2500); // 잔액이 2500원인 지하철 카드 하나 발급받음
		
		 // 3회 탑승 - 2회는 성공할 것이고, 1회는 실패할 것임
		card.ride();
		card.ride();
		card.ride();
		
		System.out.println("남은 잔액 : " + card.getBalance()); // 잔액 출력
		
		card.charge(3000); // 잔액에 3000원 충전
		
		System.out.println("남은 잔액 : " + card.getBalance()); // 잔액 출력
	}

}
