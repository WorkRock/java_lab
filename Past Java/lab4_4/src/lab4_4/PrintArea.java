package lab4_4;
import java.util.Scanner;

public class PrintArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab4_4 : ������");
		Scanner input = new Scanner(System.in);
		int leng1 = 4, leng2 = 3, hei1 = 5, hei2 = 7;
		
		System.out.println("1�� �ﰢ�� : �غ� " + leng1 + " ���� " + hei1 + " ���� " + calculArea(leng1,hei1));
		System.out.println("2�� �ﰢ�� : �غ� " + leng2 + " ���� " + hei2 + " ���� " + calculArea(leng2,hei2));
	}
	public static double calculArea (int x, int y){
		double area = 0;
		area = x*y;
		return area/2;
	}
}
