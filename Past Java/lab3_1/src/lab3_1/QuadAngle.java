package lab3_1;
import java.util.Scanner;
public class QuadAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int length = 0,height = 0;
		int roof = 0;
		System.out.println("lab3_1 : ������\n");
		while(roof == 0)
		{
			System.out.print("���� �Է� : ");
			length = input.nextInt();
			if(length < 2)
			{
				System.out.println("ó������ �� �Է� ���ֽʽÿ�.");
				continue;
			}
			System.out.print("���� �Է� : ");
			height = input.nextInt();
			if(height < 2)
			{
				System.out.println("ó������ �� �Է� ���ֽʽÿ�.");
				continue;
			}
			roof = 1;
		}
		for(int i=0 ; i<length; i++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
		for(int i=0; i<height-2;i++)
		{
			System.out.print("*");
			for(int j=0; j<length-2; j++)
			{
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for(int i=0 ; i<length; i++)
		{
			System.out.print("*");
		}
	}

}
