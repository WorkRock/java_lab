package lab4_1;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab4_1 : 이지훈");

		Scanner input = new Scanner(System.in);

		// 크기가 10인 double형 배열 scores를 생성
		double[] scores = new double[5];

		// 현재 배열 원소를 한 줄에 모두 출력
		for(int i =0; i<scores.length;i++)
		{
			System.out.print(scores[i]+" ");
		}
		System.out.println();

		// 배열 원소 입력받기
		for(int i = 0; i<scores.length; i++)
		{
			System.out.print((i+1)+"번째 실수 입력 : ");
			scores[i] = input.nextDouble();
		}

		// 입력받은 배열 원소 한 줄에 모두 출력
		for(int i = 0; i<scores.length ; i++){
			System.out.print(scores[i] + " ");
		}
		System.out.println();

		// 합계를 저장할 double형 변수 정의 및 초기화
		double total = 0;
		for(int i = 0; i<scores.length;i++){
			total += scores[i]; // 합 저장
		}

		System.out.println("합 : "+total); // 합 출력
	}
}
