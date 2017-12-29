/*
 * 작성일 : 17. 04. 02.
 * 작성자 : 201632023 이지훈
 * 파일명 : hw4_2
 * 목적 : 최대값 찾기 알고리즘과 배열 매개변수 사용을 연습
 */
package hw4_2;
import java.util.Scanner;
public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int size; // 배열의 크기를 저장할 int형 변수 정의
		
		System.out.println("hw4_2 : 이지훈");
		
		System.out.print("정수 갯수 입력: "); // 알맞은 안내문과 함께 배열안에 넣을 정수의 갯수 입력 안내
		
		size = input.nextInt();
		
		System.out.print("5개의 정수 입력 : "); // 알맞은 안내문과 함께 입력안내
		
		int[] arr = new int[size]; // 사용자에게 입력받은 크기만큼의 int형 배열 정의
		
		// 반복문을 이용해 사용자에게 정수값 입력받기
		for(int i = 0; i<size; i++)
		{
			arr[i] = input.nextInt();
		}
		
		int maxIndex = findIndex(arr);
		
		System.out.println("최대값 인덱스 : "+ maxIndex); // findIndex함수를 이용해서 인덱스값 출력
		
		System.out.println("최대값 : " + arr[maxIndex]); // findIndex함수를 이용해서 최대값 출력
	}

	public static int findIndex(int[] array) // 정수 배열을 매개변수로 받고 int형 인덱스 값을 리턴하는 함수 정의
	{
		int index = 0; // 인덱스 값을 저장할 int형 변수 정의 및 초기화
		
		int max = array[0]; // 최대값을 저장해놓을 int형 변수 정의 및 배열의 초기값으로 초기화
		
		// 반복문을 이용해 인덱스값 찾아내기
		for(int i = 0; i<array.length;i++)
		{
			if(max<array[i]) // max가 array[i]보다 작으면 max에 최대값을 저장하고 index에 인덱스값 저장.
			{
				max = array[i];
				index = i;
			} // max와 array[i]가 같을시에는 이 조건을 수행하지 않는다.
		}
		return index; // 인덱스값 리턴
	}
}
