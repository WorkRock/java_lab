package lab4_1;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab4_1 : ������");

		Scanner input = new Scanner(System.in);

		// ũ�Ⱑ 10�� double�� �迭 scores�� ����
		double[] scores = new double[5];

		// ���� �迭 ���Ҹ� �� �ٿ� ��� ���
		for(int i =0; i<scores.length;i++)
		{
			System.out.print(scores[i]+" ");
		}
		System.out.println();

		// �迭 ���� �Է¹ޱ�
		for(int i = 0; i<scores.length; i++)
		{
			System.out.print((i+1)+"��° �Ǽ� �Է� : ");
			scores[i] = input.nextDouble();
		}

		// �Է¹��� �迭 ���� �� �ٿ� ��� ���
		for(int i = 0; i<scores.length ; i++){
			System.out.print(scores[i] + " ");
		}
		System.out.println();

		// �հ踦 ������ double�� ���� ���� �� �ʱ�ȭ
		double total = 0;
		for(int i = 0; i<scores.length;i++){
			total += scores[i]; // �� ����
		}

		System.out.println("�� : "+total); // �� ���
	}
}
