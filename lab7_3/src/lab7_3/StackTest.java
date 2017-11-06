package lab7_3;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();

		System.out.println("lab7_3 : 이지훈");

		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴 번호를 입력하세요.");
		int menu = 0;
		int item = 0;
		do {
			System.out.print("1:삽입 2:삭제 3:조회 4:전체삭제 5:종료 --->");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("삽입을 수행합니다.");
				System.out.print("삽입할 원소 입력:");
				scan.nextLine();
				item = scan.nextInt();
				stack.push(item);
				break;
			case 2:
				System.out.println("삭제를 수행합니다.");
				System.out.println("삭제한 원소 = " + stack.pop());
				break;
			case 3:
				System.out.println("조회를 수행합니다.");
				System.out.println("조회한 원소 : " + stack.peek());
				break;
			case 4:
				System.out.println("전체삭제를 수행합니다.");
				while(!stack.isEmpty()) {
					System.out.println("삭제한 원소 : " + stack.pop());
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("메뉴 번호 오류: 메뉴를 다시 선택하세요.");
			}
		} while(menu != 5);
	}

}