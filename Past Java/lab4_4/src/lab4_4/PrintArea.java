package lab4_4;
import java.util.Scanner;

public class PrintArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab4_4 : 이지훈");
		Scanner input = new Scanner(System.in);
		int leng1 = 4, leng2 = 3, hei1 = 5, hei2 = 7;
		
		System.out.println("1번 삼각형 : 밑변 " + leng1 + " 높이 " + hei1 + " 면적 " + calculArea(leng1,hei1));
		System.out.println("2번 삼각형 : 밑변 " + leng2 + " 높이 " + hei2 + " 면적 " + calculArea(leng2,hei2));
	}
	public static double calculArea (int x, int y){
		double area = 0;
		area = x*y;
		return area/2;
	}
}
