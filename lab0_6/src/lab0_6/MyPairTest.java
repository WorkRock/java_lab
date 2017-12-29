//***************************
// 파일명:  MyPairTest.java
// 작성자: 201632023 이지훈
// 작성일: 17. 09. 08.
// 설명: 클래스 작성, 객체 생성과 사용을 연습한다.
//***************************
package lab0_6;
import java.util.Scanner;

public class MyPairTest 
{

	public static void main(String[] args) 
	{
		System.out.println("lab0_6 : 이지훈");
		Scanner input = new Scanner(System.in);
		
		System.out.print("2개의 정수를 입력하세요 : "); // 알맞은 안내문과 함께 입력 안내
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		MyPair pair = new MyPair(x,y); // MyPair객체를 사용하고, x, y값으로 초기화
		
		System.out.println(pair.toString());
		System.out.println("합 = " + pair.sum());
		System.out.println("평균 = " + pair.average());
		
		System.out.println("\nswap 수행 후");
		pair.swap();
		
		System.out.println(pair.toString());
		System.out.println("합 = " + pair.sum());
		System.out.println("평균 = " + pair.average());
		
	}
}
