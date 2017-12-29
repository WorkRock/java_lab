//***************************
// 파일명: MaxInt.java
// 작성자: 201632023 이지훈
// 작성일: 17. 09. 03
// 설명: 최대값 찾기 알고리즘을 익힌다.
//***************************
package lab0_3;

import java.util.Scanner;

public class MaxInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab0_3 : 이지훈");
		Scanner input = new Scanner(System.in); // Scanner 선언
		int a;
		System.out.print("정수 갯수를 입력하세요: ");
		a = input.nextInt();
		int[] arr = new int[a]; // 입력받은 수 만큼 정수를 저장하는 int형 배열 선언
		
		if(a == 0) // a가 0이면 정수를 입력 받을 수 없으므로 비교할 정수가 없기 때문에 프로그램을 종료한다.
			System.out.println("최대값 : 없음(입력받은 정수가 없습니다.)");
		else
		{
			int max = arr[0]; // 최대값을 저장할 int형 변수 선언 및 배열의 첫번째 값으로 초기화
			System.out.print(a + "개의 정수 입력 : "); // 알맞은 안내문과 함께 입력 안내
			for(int i = 0; i<a; i++)
			{
				arr[i] = input.nextInt();
				max = arr[0]; // max에 배열의 첫 항 저장
				if(arr[i]>max)
					max = arr[i]; // 배열안의 수가 최대값보다 클 시 max에 그 값 다시 저장
			}
			System.out.println("최대값 = " + max); // 최대값 출력}
		}
	}
}