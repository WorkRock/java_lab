package hw6_2;

public class Circle {
	private double radius; // ������
	
	// �������� �Ű������� �޾� �ʱ�ȭ �ϴ� ������
	public Circle(double radius){
		this.radius = radius;
	}
	
	// getArea() - ���� getter
	public double getArea(){
		return radius*radius*3.14;
	}
}
