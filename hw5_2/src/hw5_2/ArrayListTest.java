//***************************
// 파일명: ArrayListTest.java
// 작성자: 201632023 이지훈
// 작성일: 17. 09. 20.
// 설명: 자바 API의 ArrayList를 연습한다.
//***************************
package hw5_2;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListTest{
	public static void main(String[] args) {
		System.out.println("hw5_2 : 이지훈");
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(-999);
		list.add(50);
		list.add(90);
		list.add(10);

		System.out.println(list);
		System.out.println("리스트 크기 : " + list.size());

		int index;
		Scanner input = new Scanner(System.in);
		System.out.print("\n조회할 인덱스 입력 : ");
		index = input.nextInt();

		System.out.println("인덱스" + index + "의 원소 : " + list.get(index));

		System.out.print("\n777로 갱신할 인덱스 입력 : ");
		index = input.nextInt();
		list.remove(index);
		list.add(index, 777);
		System.out.println(list);

		System.out.print("\n999를 삽입할 인덱스 입력 : ");
		index = input.nextInt();
		list.add(index, 999);
		System.out.println(list);

		System.out.print("\n삭제할 인덱스 입력 : ");
		index = input.nextInt();
		System.out.println("인덱스" + index + "의 원소 : " + list.remove(index));
		System.out.println(list);
	}
}
