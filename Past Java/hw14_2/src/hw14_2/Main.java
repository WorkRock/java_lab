/*
 * �ۼ��� : 17. 06. 02.
 * �ۼ��� : 201632023 ������
 * ���ϸ� : hw14_2
 * ���� : ����� ���� ���� ����
 */

package hw14_2;

import java.util.InputMismatchException;
import java.util.Scanner;

// ����ڿ��� �������� �Է� �ް� ����ϴ� ���α׷�. (1~100���̰� �ƴϸ� ������ �ȳ����� �Բ� ���α׷� ����)
public class Main {
	public static void main(String[] args) {
		System.out.println("hw14_2: ������");

		Scanner input = new Scanner(System.in);
		System.out.print("1~100 ������ ������ �Է��ϼ���: "); // �˸��� �ȳ����� �Բ� ���� �Է� �ȳ�
		int value = 0;
		try{ // ������ �Ͼ�� ���忡 try ���
			value = input.nextInt(); // ���� �Է� �ޱ�

			if(value<1){
				throw new TooSmallException(); // 1���� ������ TooSmallException �Լ� �ҷ���
			}
			else if(value>100){
				throw new TooBigException(); // 100���� ũ�� TooBigException �Լ� �ҷ���
			}

		}catch(InputMismatchException e1){ // int�� Ÿ���� �ƴҽ� null�� ���
			System.out.println(e1.getMessage());
		}catch(TooSmallException e2){ // 1���� ������ value�� 1�� ����
			System.out.println(e2.getMessage());
			value = 1;
		}catch(TooBigException e3){ // 100���� Ŭ�� value�� 100���� ����
			System.out.println(e3.getMessage());
			value = 100;
		}
		System.out.println("value = " + value); // 1~100������ ������ �� ��µǴ� ����
	}

	static class TooSmallException extends Exception{ // exception�� ��ӹ��� ����� ���� ���� - 1���� ������
		public TooSmallException(){
			super("�������� �ʹ� �۽��ϴ�.");
		}
	}

	static class TooBigException extends Exception{ // exception�� ��ӹ��� ����� ���� ���� - 100���� Ŭ��
		public TooBigException(){
			super("�������� �ʹ� Ů�ϴ�.");
		}
	}
}