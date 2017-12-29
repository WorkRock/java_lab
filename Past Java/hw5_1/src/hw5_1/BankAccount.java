/*
 * 날짜 : 17. 04. 11
 * 작성자 : 201632023 이지훈
 * 파일명 : hw5_1
 * 목적 : 필드와 메소드를 갖는 클래스 연습 
 */

package hw5_1;

// 필드 정의
public class BankAccount {
	int balance; // 잔액을 저장할 int형 변수 정의
	
	// 입금 동작을 수행할 메소드 정의
	void deposit(int money) // 매개변수 : 금액  / 리턴값 : 없음
	{
		balance += money;
	}
	
	// 출금 동작을 수행할 메소드 정의
	void withdraw(int money) // 매개변수 : 금액 / 리턴값 : 없음
	{
		if(balance>=money) // 출금액이 잔액보다 큰 경우는 수행하지 않는다.
			balance -= money;
	}
	
	// 남은 잔액 출력을 수행할 메소드 정의
	int getBalance() // 매개변수 : 없음 / 리턴값 : 남은 금액
	{
		int remainMoney = balance; // int형 변수에 남은 금액 저장
		return remainMoney; // 남은 금액 출력
	}
}
