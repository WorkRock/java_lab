package lab3_2;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int grade = 0;
		int roof = 0;
		System.out.println("lab3_2 : ������\n");
		while(roof == 0)
		{
			System.out.print("�г� �Է� : ");
			grade = input.nextInt();
			if(grade >= 1 && grade <= 4)
					roof = 1;
			else
				System.out.println("�г��� 1~4�г� �����Դϴ�. �ٽ� �Է����ּ���.");
		}
		final int TABLE = 9;
		int answer;
		int total = 0;
		switch(grade)
		{
			case 1:
				for(int i=0; i<5; i++)
				{
					int randomNum = (int)(Math.random()*TABLE+1);
					System.out.print("����" + (i + 1) + " : " + "2 X " + randomNum + " = ");
					answer = input.nextInt();
					if(answer == 2*randomNum)
					{
						System.out.println("�����Դϴ�.\n");
						total += 20;
					}
					else
						System.out.println("�����Դϴ�.\n");
				}
				System.out.println("����� ������ " + total + "�� �Դϴ�.");
				break;
			case 2:
				for(int i=0; i<5; i++)
				{
					int randomNum = (int)(Math.random()*TABLE+1);
					System.out.print("����" + (i + 1) + " : " + "3 X " + randomNum + " = ");
					answer = input.nextInt();
					if(answer == 3*randomNum)
					{
						System.out.println("�����Դϴ�.\n");
						total += 20;
					}
					else
						System.out.println("�����Դϴ�.\n");
				}
				System.out.println("����� ������ " + total + "�� �Դϴ�.");
				break;
			case 3:
				for(int i=0; i<5; i++)
				{
					int randomNum = (int)(Math.random()*TABLE+1);
					System.out.print("����" + (i + 1) + " : " + "4 X " + randomNum + " = ");
					answer = input.nextInt();
					if(answer == 4*randomNum)
					{
						System.out.println("�����Դϴ�.\n");
						total += 20;
					}
					else
						System.out.println("�����Դϴ�.\n");
				}
				System.out.println("����� ������ " + total + "�� �Դϴ�.");
				break;
			case 4:
				for(int i=0; i<5; i++)
				{
					int randomNum = (int)(Math.random()*TABLE+1);
					System.out.print("����" + (i + 1) + " : " + "5 X " + randomNum + " = ");
					answer = input.nextInt();
					if(answer == 5*randomNum)
					{
						System.out.println("�����Դϴ�.\n");
						total += 20;
					}
					else
						System.out.println("�����Դϴ�.\n");
				}
				System.out.println("����� ������ " + total + "�� �Դϴ�.");
				break;
		}
	}
}
