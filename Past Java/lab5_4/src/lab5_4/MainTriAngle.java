package lab5_4;

public class MainTriAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriAngle angle1 = new TriAngle();
		TriAngle angle2 = new TriAngle();
		System.out.println("lab5_4 : ������\n");
		angle1.length = 2.5;
		angle1.height = 3.0;
		System.out.println("1�� �ﰢ���� ���� : " + angle1.calculArea());
		
		
		angle2.length = 5.0;
		angle2.height = 4.5;
		System.out.println("2�� �ﰢ���� ���� : " + angle2.calculArea());
	}

}
