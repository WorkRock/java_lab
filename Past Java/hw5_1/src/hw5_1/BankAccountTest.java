/*
 * 날짜 : 17. 04. 11
 * 작성자 : 201632023 이지훈
 * 파일명 : hw5_1
 * 목적 : 필드와 메소드를 갖는 클래스 연습 
 */

package hw5_1;
import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount chargeMoney = new BankAccount(); // 은행계좌(BankAccount) 객체 생성
		
		System.out.println("hw5_1 : 이지훈");
		/* 단계 1
		chargeMoney.deposit(3000); // 객체를 이용해 deposit 함수를 불러와 3000원 입금
		System.out.println("현재 남은 잔액 : " + chargeMoney.getBalance()); // 객체를 이용해 현재 남은 금액 출력
		chargeMoney.withdraw(4000); // 객체를 이용해 withdraw 함수를 불러와 4000원 출금
		System.out.println("현재 남은 잔액 : " + chargeMoney.getBalance()); // 잔액 출력
		chargeMoney.withdraw(1000); // 객체이용, 1000원 출금
		System.out.println("현재 남은 잔액 : " + chargeMoney.getBalance()); // 잔액 출력
		*/
		
		// 단계 2
		int inputNum; // 사용자에게 입력받을 int형 변수 정의
		Scanner input = new Scanner(System.in); // Scanner타입 정의
		
		int roof = 0; // 반복문의 반복을 위한 변수 roof 정의
		
		// while문을 사용. roof가 0이 아닐때 까지 무한 반복
		while(roof == 0)
		{
			System.out.print("1:입금, 2:출금, 3:잔액조회, 4:종료 --> "); // 알맞은 안내문과 함께 입력 안내
			inputNum = input.nextInt(); // 사용자에게 입력받기
			
			// switch문을 이용해 사용자가 입력한 번호 찾아가기
			switch(inputNum)
			{
				case 1: // 1일 경우
					System.out.println("입금액을 입력하세요 : "); // 알맞은 안내문과 함께 입력 안내
					inputNum = input.nextInt(); // 사용자에게 입금액을 입력 받고
					chargeMoney.deposit(inputNum); // 객체를 이용해서  입금함수 사용, 입금액 저장
					break; // 탈출
				case 2: // 2일 경우
					System.out.println("출금액을 입력하세요 : "); // 알맞은 안내문과 함께 입력 안내
					inputNum = input.nextInt(); // 사용자에게 출금액을 입력 받고
					chargeMoney.withdraw(inputNum); // 객체를 이용해서 출금함수 사용, 출금액 저장
					break; // 탈출
				case 3: // 3일 경우
					System.out.println("남은 잔액 : " + chargeMoney.getBalance()); // 객체를 이용해 남은 잔액을 불러옴
					break; // 탈출
				case 4: // 4일 경우
					System.out.println("프로그램을 종료합니다."); // 알맞은 안내문 출력
					roof = 1; // roof를 1로 바꾸어 무한반복 종료
					break; // 탈출
				default: // 1,2,3,4가 아닌경우
					System.out.println("잘못된 번호입니다. 다시 입력해 주세요."); // 재입력을 요구하는 안내문 출력
					break; // 탈출 
			}
		}
	}

}
