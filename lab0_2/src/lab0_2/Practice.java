//***************************
// 파일명: Practice.java
// 작성자: 201632023 이지훈
// 작성일: 17. 08. 30
// 설명: 키보드 입력, 반복문, 조건문, 배열 등, 자바 프로그래밍을 복습한다.
//***************************
package lab0_2;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab0_2 : 이지훈");
		Scanner input = new Scanner(System.in); // Scanner 선언
		int[] arr = new int[10]; // 10개의 정수를 저장하는 int형 배열 선언
		double total = 0; // 배열의 합을 저장할 double형 변수 선언 및 초기화
		System.out.print("10개의 정수 입력 : "); // 알맞은 안내문과 함께 입력 안내
		for(int i = 0; i<10; i++)
		{
			arr[i] = input.nextInt();
			total += arr[i]; // total에 배열의 합 저장
		}
		double aver = total/10; // 평균을 저장할 double형 변수 정의 및 초기화
		System.out.println("평균 : " + aver);
		System.out.println("평균 이상인 값 : ");
		for(int i = 0; i<10; i++)
		{
			if(arr[i]>=aver) // 평균보다 큰거나 같은 값 찾아내기
				System.out.print(arr[i] + " ");
		}
	}

}
