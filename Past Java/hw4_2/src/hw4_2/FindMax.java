/*
 * �ۼ��� : 17. 04. 02.
 * �ۼ��� : 201632023 ������
 * ���ϸ� : hw4_2
 * ���� : �ִ밪 ã�� �˰���� �迭 �Ű����� ����� ����
 */
package hw4_2;
import java.util.Scanner;
public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int size; // �迭�� ũ�⸦ ������ int�� ���� ����
		
		System.out.println("hw4_2 : ������");
		
		System.out.print("���� ���� �Է�: "); // �˸��� �ȳ����� �Բ� �迭�ȿ� ���� ������ ���� �Է� �ȳ�
		
		size = input.nextInt();
		
		System.out.print("5���� ���� �Է� : "); // �˸��� �ȳ����� �Բ� �Է¾ȳ�
		
		int[] arr = new int[size]; // ����ڿ��� �Է¹��� ũ�⸸ŭ�� int�� �迭 ����
		
		// �ݺ����� �̿��� ����ڿ��� ������ �Է¹ޱ�
		for(int i = 0; i<size; i++)
		{
			arr[i] = input.nextInt();
		}
		
		int maxIndex = findIndex(arr);
		
		System.out.println("�ִ밪 �ε��� : "+ maxIndex); // findIndex�Լ��� �̿��ؼ� �ε����� ���
		
		System.out.println("�ִ밪 : " + arr[maxIndex]); // findIndex�Լ��� �̿��ؼ� �ִ밪 ���
	}

	public static int findIndex(int[] array) // ���� �迭�� �Ű������� �ް� int�� �ε��� ���� �����ϴ� �Լ� ����
	{
		int index = 0; // �ε��� ���� ������ int�� ���� ���� �� �ʱ�ȭ
		
		int max = array[0]; // �ִ밪�� �����س��� int�� ���� ���� �� �迭�� �ʱⰪ���� �ʱ�ȭ
		
		// �ݺ����� �̿��� �ε����� ã�Ƴ���
		for(int i = 0; i<array.length;i++)
		{
			if(max<array[i]) // max�� array[i]���� ������ max�� �ִ밪�� �����ϰ� index�� �ε����� ����.
			{
				max = array[i];
				index = i;
			} // max�� array[i]�� �����ÿ��� �� ������ �������� �ʴ´�.
		}
		return index; // �ε����� ����
	}
}
