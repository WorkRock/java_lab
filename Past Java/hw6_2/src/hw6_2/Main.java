package hw6_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw6_2 : ������");
		Circle[] circle = new Circle[3]; // ũ�Ⱑ 3�� Circle �� �迭�� ����
		
		 // �������� ���� 2.0, 2.0, 1.0�� ���� �迭 ���ҿ� ����
		circle[0] = new Circle(2.0);
		circle[1] = new Circle(2.0);
		circle[2] = new Circle(1.0);
		
		// areaSum()�� ȣ���Ͽ� �� ������ ���� �˾Ƴ� �� ��� - 28.26�� ��µ� ����
		System.out.println("���� ���� : " + areaSum(circle));
		// minArea()�� ȣ���Ͽ� ���� ���� �� ������ �˾Ƴ� �� ��� - 3.14�� ��µ� ����
		System.out.println("�ּ� ������ �� ũ�� : " + minArea(circle));
		
	}
	
	 // Circle�� �迭�� �Ű������� �޾� ���� ���� ����
	private static double areaSum(Circle[] array){
		double total = 0;
		for(int i = 0; i<array.length; i++)
		{
			total += array[i].getArea();
		}
		return total;
	}
	
	// Circle�� �迭�� �Ű������� �޾� �ּ� ������ ����
	private static double minArea(Circle[] array){
		double min = array[0].getArea(); // �ּҰ��� ���۰� ����
		for(int i = 1; i<array.length; i++) // ���� ������ ���� ���
		{
			if(min > array[i].getArea())
				min = array[i].getArea();
		}
		return min;
	}

}
