package hw6_1;
/*
 * 파일명: MyDoublyLinkedListTest.java
 * 작성자: 201632023 이지훈
 * 작성일: 17. 10. 11.
 * 내용: MyDoublyLinkedList 객체를 생성하고 삽입, 출력 기능을 테스트하는 프로그램
 */

import java.util.Scanner;

public class MyLinkedListTest {
	public static void main(String[] args) {
		
		System.out.println("hw6_1: 이지훈\n");

		MyLinkedList list = new MyLinkedList();

		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴 번호를 입력하세요.");
		int menu = 0;
		int item = 0;
		int index = 0;
		do {
			System.out.print("1:리스트출력 2:맨앞삽입 3:맨앞삭제 4:검색 5:인덱스삽입 6:인덱스삭제 9:종료 --->");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("리스트출력을 수행합니다.");
				System.out.println(list.toString());
				break;
			case 2:
				System.out.println("맨앞삽입을 수행합니다.");
				System.out.print("삽입할 정수 입력:");
				item = scan.nextInt();
				list.addFirst(item);
				break;
			case 3:
				System.out.println("맨앞삭제를 수행합니다.");
				System.out.println("삭제한 원소 = " + list.removeFirst());
				break;
			case 4:
				System.out.println("검색을 수행합니다.");
				System.out.print("어떤 값을 찾으십니까?:");
				item = scan.nextInt();
				System.out.println("값의 존재 여부 : " + list.contains(item));
				break;
			case 5:
				System.out.println("인덱스삽입을 수행합니다.");
				System.out.print("삽입할 인덱스 입력:");
				index = scan.nextInt();
				System.out.print("삽입할 정수 입력:");
				item = scan.nextInt();
				list.add(index, item);
				break;
			case 6:
				System.out.println("인덱스삭제를 수행합니다.");
				System.out.print("삽입할 인덱스 입력:");
				item = scan.nextInt();
				System.out.println("삭제한 원소 = " + list.remove(item));
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("메뉴 번호 오류: 메뉴를 다시 선택하세요.");
			}
		} while(menu != 9);
	}
}