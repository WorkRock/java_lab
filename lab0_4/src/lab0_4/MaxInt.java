package lab0_4;

import java.util.Scanner;

public class MaxInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("lab0_4 : 이지훈");
		int a;
		int b;
		System.out.print("두 정수를 입력 하세요 : "); // 알맞은 안내문과 함께 입력 안내
		a = input.nextInt();
		b = input.nextInt();
		
		System.out.println("최대값 : " + findMax(a,b)); // findMax매소드 호출
	}
	
	public static int findMax(int a, int b) // 두개의 정수를 매개변수로 받고 int형을 리턴하는 findMax 메소드 선언
	{
		int max = 0; // 최대값을 저장할 int형 변수 선언 및 초기화
		if(a>b)
			max = a;
		else
			max = b;
		return max; // 최대값 리턴
	}
}
