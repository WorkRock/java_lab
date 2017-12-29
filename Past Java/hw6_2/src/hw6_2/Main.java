package hw6_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw6_2 : 이지훈");
		Circle[] circle = new Circle[3]; // 크기가 3인 Circle 형 배열을 생성
		
		 // 반지름이 각각 2.0, 2.0, 1.0인 원을 배열 원소에 저장
		circle[0] = new Circle(2.0);
		circle[1] = new Circle(2.0);
		circle[2] = new Circle(1.0);
		
		// areaSum()을 호출하여 원 면적의 합을 알아낸 후 출력 - 28.26이 출력될 것임
		System.out.println("넓이 총합 : " + areaSum(circle));
		// minArea()를 호출하여 가장 작은 원 면적을 알아낸 후 출력 - 3.14가 출력될 것임
		System.out.println("최소 면적의 원 크기 : " + minArea(circle));
		
	}
	
	 // Circle형 배열을 매개변수로 받아 면적 합을 리턴
	private static double areaSum(Circle[] array){
		double total = 0;
		for(int i = 0; i<array.length; i++)
		{
			total += array[i].getArea();
		}
		return total;
	}
	
	// Circle형 배열을 매개변수로 받아 최소 면적을 리턴
	private static double minArea(Circle[] array){
		double min = array[0].getArea(); // 최소값에 시작값 저장
		for(int i = 1; i<array.length; i++) // 시작 다음값 부터 계산
		{
			if(min > array[i].getArea())
				min = array[i].getArea();
		}
		return min;
	}

}
