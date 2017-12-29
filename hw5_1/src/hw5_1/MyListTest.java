//***************************
// 파일명: MyListTest.java
// 작성자: 201632023 이지훈
// 작성일: 17. 09. 20.
// 설명: 순차자료구조 구현을 연습한다.
//***************************

package hw5_1;

import java.util.Scanner;

public class MyListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList list = new MyList(); // MyList형 객체 생성
		System.out.println("hw5_1 : 이지훈");
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(-999);
		list.add(50);
		list.add(90);
		list.add(10);
		
		System.out.println(list.toString());
		System.out.println("리스트 크기 : " + list.size());
		
		int index;
		Scanner input = new Scanner(System.in);
		System.out.print("\n조회할 인덱스 입력 : ");
		index = input.nextInt();
		System.out.println("인덱스" + index + "의 원소 : " + list.get(index));
		
		System.out.print("\n777로 갱신할 인덱스 입력 : ");
		index = input.nextInt();
		list.set(index, 777);
		System.out.println(list.toString());
		
		System.out.print("\n999를 삽입할 인덱스 입력 : ");
		index = input.nextInt();
		list.add(999, index);
		System.out.println(list.toString());
		
		System.out.print("\n삭제할 인덱스 입력 : ");
		index = input.nextInt();
		list.remove(index);
		System.out.println(list.toString());
	}

}
