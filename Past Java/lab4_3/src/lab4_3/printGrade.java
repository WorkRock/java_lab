package lab4_3;
import java.util.Scanner;
public class printGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("lab4_3 : ÀÌÁöÈÆ");
		
		final int SIZE = 3;
		
		for(int i =0; i<10; i++)
			System.out.print((int)(Math.random()*SIZE)+4 + " ");
	}

}
