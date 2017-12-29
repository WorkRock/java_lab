/*
 * 작성일 : 17. 04. 01.
 * 작성자 : 201632023 이지훈
 * 파일명 : hw4_1
 * 목적 : 제어문과 배열 연습
 */
package hw4_1;
import java.util.Scanner;
public class PrintMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fee = {5000,15000,20000,20000}; // 회비를 저장하는 int형 배열 정의 및 초기화

		String [] question = {"1 + 1","5 - 2","2 * 3","8 / 2"}; // 문제를 저장할 String형 배열 정의 및 초기화

		int[] correct = {2,3,6,4}; // 문제의 답을 저장할 int형 배열 정의 및 초기화

		System.out.println("hw4_1 : 이지훈"); 

		int a, roof = 0; // 사용자에게 입력 받을 변수 정의, 무한 반복을 돌릴 변수 정의 및 초기화

		Scanner input = new Scanner(System.in);

		// while문을 사용해서 1~4 사이의 숫자가 아니면 무한으로 반복시키기
		while(roof == 0)
		{
			System.out.print("1~4 범위의 학년 입력 : "); // 적절한 안내문과 함께 입력 안내
			a = input.nextInt();
			
			// 사용자가 1~4의 수를 만족하면 문제 제시
			if(a>=1 && a<=4) 
			{
				roof = 1; // 반복을 끝내기 위해 roof를 1로 설정
				int answer; // 정답을 저장할 int형 변수 정의
				System.out.print(question[a-1] + " = "); // 알맞은 안내문과 함께 입력 안내
				answer = input.nextInt();
				
				if(answer == correct[a-1]) // 정답일시 10%할인된 가격으로 회비 계산
				{
					int salePrice = fee[a-1] - fee[a-1]/10; // 10% 깎인 회비를 저장할 int형 변수 정의 및 초기화
					System.out.println("정답입니다.");
					System.out.println("회비는 "+ salePrice +  "원입니다." );
				}
				else // 오답일시 원래 가격으로 회비를 받음
				{
					System.out.println("틀렸습니다.");
					System.out.println("회비는 "+fee[a-1] + "원입니다." );
				}
			}
		}
	}

}
