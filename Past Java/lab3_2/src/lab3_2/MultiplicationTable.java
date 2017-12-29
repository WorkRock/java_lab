package lab3_2;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int grade = 0;
		int roof = 0;
		System.out.println("lab3_2 : 이지훈\n");
		while(roof == 0)
		{
			System.out.print("학년 입력 : ");
			grade = input.nextInt();
			if(grade >= 1 && grade <= 4)
					roof = 1;
			else
				System.out.println("학년은 1~4학년 사이입니다. 다시 입력해주세요.");
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
					System.out.print("문제" + (i + 1) + " : " + "2 X " + randomNum + " = ");
					answer = input.nextInt();
					if(answer == 2*randomNum)
					{
						System.out.println("정답입니다.\n");
						total += 20;
					}
					else
						System.out.println("오답입니다.\n");
				}
				System.out.println("당신의 점수는 " + total + "점 입니다.");
				break;
			case 2:
				for(int i=0; i<5; i++)
				{
					int randomNum = (int)(Math.random()*TABLE+1);
					System.out.print("문제" + (i + 1) + " : " + "3 X " + randomNum + " = ");
					answer = input.nextInt();
					if(answer == 3*randomNum)
					{
						System.out.println("정답입니다.\n");
						total += 20;
					}
					else
						System.out.println("오답입니다.\n");
				}
				System.out.println("당신의 점수는 " + total + "점 입니다.");
				break;
			case 3:
				for(int i=0; i<5; i++)
				{
					int randomNum = (int)(Math.random()*TABLE+1);
					System.out.print("문제" + (i + 1) + " : " + "4 X " + randomNum + " = ");
					answer = input.nextInt();
					if(answer == 4*randomNum)
					{
						System.out.println("정답입니다.\n");
						total += 20;
					}
					else
						System.out.println("오답입니다.\n");
				}
				System.out.println("당신의 점수는 " + total + "점 입니다.");
				break;
			case 4:
				for(int i=0; i<5; i++)
				{
					int randomNum = (int)(Math.random()*TABLE+1);
					System.out.print("문제" + (i + 1) + " : " + "5 X " + randomNum + " = ");
					answer = input.nextInt();
					if(answer == 5*randomNum)
					{
						System.out.println("정답입니다.\n");
						total += 20;
					}
					else
						System.out.println("오답입니다.\n");
				}
				System.out.println("당신의 점수는 " + total + "점 입니다.");
				break;
		}
	}
}
