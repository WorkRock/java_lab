/*
 * 2017. 03. 21
 * �й� : 201632023
 * �̸� : ������
 * ���� : �ּ�, ���� ���, ������ ����, �Է°� ����� �����ϱ�
 */
package hw2_1;
import java.util.Scanner;
/**
 * 
 * @author pc
 *
 */
public class AdoptRateOlymphic {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lastOlymphic = 2016; // �������� �ø����� ������ ������ ������ int�� ���� ���� �� �ʱ�ȭ
		int period; // ���� �ֱ⸦ �Է��� int�� ���� ����
		String nameOfCompetition; // ��ȸ���� ������ String�� ���� ����

		Scanner input = new Scanner(System.in);

		System.out.println("hw2_1 : ������");

		System.out.print("��ȸ�� �Է� : "); // �˸��� �ȳ����� �Բ� ��ȸ�� �Է� �ȳ�
		nameOfCompetition = input.nextLine();
		
		
		System.out.print("���� �ֱ�(��) �Է� : "); // �˸��� �ȳ����� �Բ� �����ֱ� �Է� �ȳ�
		period = input.nextInt();
		input.nextLine();
		
		String nameOfSport; // ������� ������ String�� ���� ����
		System.out.print("����� �Է� : "); // �˸��� �ȳ����� �Բ� ����� �Է� �ȳ�
		nameOfSport = input.nextLine();
		
		int firstAdoptYear; // ����ä�ÿ����� ������ int�� ���� ����
		System.out.print("����ä�ÿ��� �Է� : "); // �˸��� �ȳ����� �Բ� ����ä�ÿ��� �Է� �ȳ�
		firstAdoptYear = input.nextInt();

		int adoptNumber=0; // ä��Ƚ���� ������ int�� ���� ���� �� �ʱ�ȭ
		adoptNumber = (lastOlymphic - firstAdoptYear)/period; // ������ ���ֳ⵵���� ó������ ������ ������ ���� �ֱ�� ������ ä��Ƚ�� ����
		
		// �˸°� ���
		System.out.println(period + "�� ���� ���ֵǴ� " + nameOfCompetition + "����");
		System.out.println(nameOfSport + " ������ " + firstAdoptYear + "�� ó�� ä�õǾ� �� " + (adoptNumber+1) + "ȸ ä��");
		// ä��Ƚ���� +1�� �Ͽ� ó�� ������ ���� ������
	}

}
