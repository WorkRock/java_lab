package lab0_6;

public class MyPair  
{
		private int x, y; // 두 개의 정수 선언
		
		public MyPair(int x, int y) { // 두개의 정수 초기화
			this.x = x;
			this.y = y;
		}

		public int sum() // 합을 저장하는 메소드 sum 정의
		{
			return x + y;
		}
		
		public double average() // 평균을 출력할 메소드 average 정의
		{
			return (x+y)/2;
		}
		
		public void swap() // x와 y값을 바꿔주는 메소드 swap 정의
		{
			int swap = x; // int형 변수를 하나 선언해주어 x저장
			x = y; // x에는 y값을 넣었지만 swap에는 x값이 남아있음
			y = swap; // y에 swap. 즉, x값을 넣어줌
		}

		@Override
		public String toString() { // 이 클래스에 적합한 결과를 얻도록 오버라이드한 toString
			return "MyPair [x = " + x + ", y = " + y + "]";
		}
		
}

