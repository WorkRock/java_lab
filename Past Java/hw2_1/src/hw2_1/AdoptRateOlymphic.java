/*
 * 2017. 03. 21
 * 학번 : 201632023
 * 이름 : 이지훈
 * 목적 : 주석, 변수 사용, 간단한 수식, 입력과 출력을 연습하기
 */
package hw2_1;
import java.util.Scanner;
/**
 * 
 * @author pc
 *
 */
public class AdoptRateOlymphic {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lastOlymphic = 2016; // 마지막로 올림픽을 개최한 연도를 저장할 int형 변수 정의 및 초기화
		int period; // 개최 주기를 입력할 int형 변수 정의
		String nameOfCompetition; // 대회명을 저장할 String형 변수 정의

		Scanner input = new Scanner(System.in);

		System.out.println("hw2_1 : 이지훈");

		System.out.print("대회명 입력 : "); // 알맞은 안내문과 함께 대회명 입력 안내
		nameOfCompetition = input.nextLine();
		
		
		System.out.print("개최 주기(년) 입력 : "); // 알맞은 안내문과 함께 개최주기 입력 안내
		period = input.nextInt();
		input.nextLine();
		
		String nameOfSport; // 종목명을 저장할 String형 변수 정의
		System.out.print("종목명 입력 : "); // 알맞은 안내문과 함께 종목명 입력 안내
		nameOfSport = input.nextLine();
		
		int firstAdoptYear; // 최초채택연도를 저장할 int형 변수 정의
		System.out.print("최초채택연도 입력 : "); // 알맞은 안내문과 함께 최초채택연도 입력 안내
		firstAdoptYear = input.nextInt();

		int adoptNumber=0; // 채택횟수를 저장할 int형 변수 정의 및 초기화
		adoptNumber = (lastOlymphic - firstAdoptYear)/period; // 마지막 개최년도에서 처음으로 개최한 연도를 빼고 주기로 나눠서 채택횟수 저장
		
		// 알맞게 출력
		System.out.println(period + "년 마다 개최되는 " + nameOfCompetition + "에서");
		System.out.println(nameOfSport + " 종목은 " + firstAdoptYear + "년 처음 채택되어 총 " + (adoptNumber+1) + "회 채택");
		// 채택횟수에 +1을 하여 처음 개최한 날도 더해줌
	}

}
