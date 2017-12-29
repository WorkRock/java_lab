/*
 * 날짜 : 17. 03. 27.
 * 파일 이름 : lab4_2
 * 작성자 : 201632023 이지훈
 * 목적 : 배열과 반복문 연습
 */
package lab4_2;
import java.util.Scanner;
public class CheckInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// double형 배열 정의 및 초기화
		double[] temp = {-5.0, 0.2, 7.0, 9.5, 15.0, 25.5, 28.0, 30.5, 29.5, 18.5, 8.0, -1.5};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("lab4_2 : 이지훈");
		int roof = 0; // 반복을 위한 int형 변수 정의 및 초기화
		
		while(roof == 0) // while문을 이용해 roof가 0이 아닐때까지 반복
		{
			int month; // 사용자에게 원하는 달을 입력받을 int형 변수 정의
			System.out.print("1~12범위의 월을 입력하세요: "); // 알맞은 안내문과 함께 입력 안내
			month = input.nextInt();
			
			// if문을 사용해서 month가 1~12월 사이인지 확인
			if(month<=12 && month>=1)
			{
				System.out.println(month + "월의 평균 기온 = " +temp[month-1]);
				roof = -1; // month가 1~12월 사이이면 roof값을 변경해서 반복문 종료
			}
		}
	}
}
