package hw6_1;

public class MetroCard {
	private int balance; // 잔액을 저장할 필드 형성
	
	// 잔액을 매개변수로 받아 초기화 하는 생성자
	public MetroCard(int balance){
		this.balance = balance;
	}
	
	 // getBalance() - 잔액 getter
	public int getBalance(){
		return balance;
	}
	
	// ride() - 1회 탑승마다 호출되는 메소드
	public void ride(){
		if(balance>=1000) // 잔액이 1000원보다 크거나 같을때만 호출
		{
			System.out.println("탑승 허가");
			balance -= 1000;
		}
		else // 아닐시 안내문과 함께 탑승 불가 안내
			System.out.println("잔액 부족");
	}
	
	// charge() -매개변수로 받은 금액만큼 충전하는 메소드
	public void charge(int balance){
		this.balance += balance;
	}
}
