/*
 * ���ϸ�: Final.java
 * �ۼ���: 2017.12.21
 * �ۼ���: ȫ�浿
 * ����: ���� �˻��� �̿��Ͽ� �������� �˻��ϴ� ���α׷�
 */


import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("final: ȫ�浿");
		Scanner scan = new Scanner(System.in);

		// ����ڰ� ���ϴ� ������ int�� ���Ҹ� �Է¹޾� �迭 array�� ����
		System.out.print("\n���� ���� �Է�: ");
		int n = scan.nextInt();
		int[] array = new int[n];

		System.out.println(n + "���� ���� �Է�: ");
		for(int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}

		// �迭 array�� ���Ҹ� ������������ ����
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		// �˻��� Ű���� �Է¹���
		System.out.print("\n�˻��� Ű�� �Է�:");
		int key = scan.nextInt();

		// ���� �˻� ����� �̿��Ͽ� �迤���� Ű���� �˻�
		System.out.print("(1)���� �˻� ���: ");
		int index1 = sequentialSearch(array, key);
		if(index1 == -1)
			System.out.println("�˻� ����");
		else 
			System.out.println("�˻� ���� : �ε��� = " + index1);

		// ���� �˻� ����� �̿��Ͽ� �迤���� Ű���� �˻�
		System.out.print("(2)���� �˻� ���: ");
		int index2 = binarySearch(array, key);
		if(index2 == -1)
			System.out.println("�˻� ����");
		else 
			System.out.println("�˻� ���� : �ε��� = " + index2);

		// ����(3):  ���� �˻�, ���� �˻� ����� �ٸ��� ������ ��찡 �ִ���, �ִٸ� � ������� ����ϼ���.
		System.out.println("�������� �ΰ� �̻���");
	}

	// ����(1): ���� �˻� �޼ҵ� - array ��ü���� key�� �˻��Ͽ� �ε����� ����; �˻� ���н� -1 ���� 
	private static int sequentialSearch(int[] array, int key) {
		for(int i = 0; i<array.length; ++i) {
			if(array[i] == key) {
				return i;
			}
		}
		return -1;	// �˻� ����
	}

	// ����(2): iterative algorithm�� �̿��� ���� �˻� �޼ҵ� - array ��ü���� key�� �˻��Ͽ� �ε����� ����; �˻� ���н� -1 ���� 
	private static int binarySearch(int[] array, int key) {
		int lb = 0;
		int ub = array.length-1;
		while(lb <= ub) {
			int middle = (lb+ub)/2;
			if(array[middle] == key) {
				return middle;
			}
			else if(key > array[middle]) {
				lb++;
			}
			else
				ub--;
		}
		return -1;
	}
}

