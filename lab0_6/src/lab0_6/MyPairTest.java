//***************************
// ���ϸ�:  MyPairTest.java
// �ۼ���: 201632023 ������
// �ۼ���: 17. 09. 08.
// ����: Ŭ���� �ۼ�, ��ü ������ ����� �����Ѵ�.
//***************************
package lab0_6;
import java.util.Scanner;

public class MyPairTest 
{

	public static void main(String[] args) 
	{
		System.out.println("lab0_6 : ������");
		Scanner input = new Scanner(System.in);
		
		System.out.print("2���� ������ �Է��ϼ��� : "); // �˸��� �ȳ����� �Բ� �Է� �ȳ�
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		MyPair pair = new MyPair(x,y); // MyPair��ü�� ����ϰ�, x, y������ �ʱ�ȭ
		
		System.out.println(pair.toString());
		System.out.println("�� = " + pair.sum());
		System.out.println("��� = " + pair.average());
		
		System.out.println("\nswap ���� ��");
		pair.swap();
		
		System.out.println(pair.toString());
		System.out.println("�� = " + pair.sum());
		System.out.println("��� = " + pair.average());
		
	}
}
