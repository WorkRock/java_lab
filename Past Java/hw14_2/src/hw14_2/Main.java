/*
 * 작성일 : 17. 06. 02.
 * 작성자 : 201632023 이지훈
 * 파일명 : hw14_2
 * 목적 : 사용자 정의 예외 연습
 */

package hw14_2;

import java.util.InputMismatchException;
import java.util.Scanner;

// 사용자에게 정수값을 입력 받고 출력하는 프로그램. (1~100사이가 아니면 적절한 안내문과 함께 프로그램 종료)
public class Main {
	public static void main(String[] args) {
		System.out.println("hw14_2: 이지훈");

		Scanner input = new Scanner(System.in);
		System.out.print("1~100 범위의 정수를 입력하세요: "); // 알맞은 안내문과 함께 정수 입력 안내
		int value = 0;
		try{ // 문제가 일어나는 문장에 try 사용
			value = input.nextInt(); // 정수 입력 받기

			if(value<1){
				throw new TooSmallException(); // 1보다 작으면 TooSmallException 함수 불러옴
			}
			else if(value>100){
				throw new TooBigException(); // 100보다 크면 TooBigException 함수 불러옴
			}

		}catch(InputMismatchException e1){ // int형 타입이 아닐시 null값 출력
			System.out.println(e1.getMessage());
		}catch(TooSmallException e2){ // 1보다 작을시 value를 1로 고정
			System.out.println(e2.getMessage());
			value = 1;
		}catch(TooBigException e3){ // 100보다 클시 value를 100으로 고정
			System.out.println(e3.getMessage());
			value = 100;
		}
		System.out.println("value = " + value); // 1~100사이의 정수일 시 출력되는 문장
	}

	static class TooSmallException extends Exception{ // exception을 상속받은 사용자 정의 예외 - 1보다 작을시
		public TooSmallException(){
			super("정수값이 너무 작습니다.");
		}
	}

	static class TooBigException extends Exception{ // exception을 상속받은 사용자 정의 예외 - 100보다 클시
		public TooBigException(){
			super("정수값이 너무 큽니다.");
		}
	}
}