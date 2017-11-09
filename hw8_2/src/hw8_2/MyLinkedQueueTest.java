package hw8_2;

import java.util.Scanner;

public class MyLinkedQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedQueue queue = new MyLinkedQueue();
		int menu = 0;
		int item = 0;
		System.out.println("hw8_2 : 이지훈");
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("1:삽입 2:삭제 3:전체삭제 4:종료 --->");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("삽입을 수행합니다.");
				System.out.print("삽입할 원소 입력:");
				scan.nextLine();
				item = scan.nextInt();
				queue.enQueue(item);
				break;
			case 2:
				System.out.println("삭제를 수행합니다.");
				System.out.println("삭제한 원소 = " + queue.deQueue());
				break;
			case 3:
				System.out.println("전체삭제를 수행합니다.");
				while(!queue.isEmpty()) {
					System.out.println("삭제한 원소 : " + queue.deQueue());
				}
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("메뉴 번호 오류: 메뉴를 다시 선택하세요.");
			}
		} while(menu != 4);
	}
}
