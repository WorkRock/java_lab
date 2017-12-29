package hw6_2;

public class Circle {
	private double radius; // 반지름
	
	// 반지름을 매개변수로 받아 초기화 하는 생성자
	public Circle(double radius){
		this.radius = radius;
	}
	
	// getArea() - 넓이 getter
	public double getArea(){
		return radius*radius*3.14;
	}
}
