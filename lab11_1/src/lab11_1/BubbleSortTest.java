package lab11_1;

import java.util.Scanner;

public class BubbleSortTest {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("���� ���� �Է� : ");
		int n = input.nextInt();

		int[] a = new int[n];

		for(int i = 0; i<n; i++) {
			System.out.print("������ ���� �Է� : ");
			int x = input.nextInt();
			a[i] = x;
		}
		BubbleSort.bSort(a);

		for(int i = 0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
