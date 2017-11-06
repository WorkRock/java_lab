package mid;
/*
 * 파일명: MyListTest.java
 * 작성자: 홍길동
 * 작성일: 2017년 10월19일
 * 내용: MyList 객체를 생성하고 삽입, 출력 기능을 테스트하는 프로그램
 */

import java.util.Scanner;

public class MyListTest {
	public static void main(String[] args) {
		
		System.out.println("mid: 홍길동\n"); 

		MyList list = new MyList();

		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴 번호를 입력하세요.");
		int menu = 0;
		int item = 0;
		do {
			System.out.print("1:맨뒤삽입 2:양방향연결확인 3:종료 --->");
			menu = scan.nextInt();
			switch(menu) {

			case 1:
				System.out.println("맨뒤삽입을 수행합니다.");
				System.out.print("삽입할 정수 입력:");
				item = scan.nextInt();
				list.addLast(item);
				break;
			case 2:
				System.out.println("양방향 연결을 확인합니다.");
				list.printLink();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("메뉴 번호 오류: 메뉴를 다시 선택하세요.");
			}
		} while(menu != 3);
		
		scan.close();
	}
}

