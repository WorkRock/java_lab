package lab0_7;

public class MyList {
		private int[] array; // int형 배열 선언
		private int capacity = 0; // 저장 용량을 저장할 int형 변수 선언 및 초기화
		private int count = 0; // 배열에 저장된 정수 갯수를 나타낼 int형 변수 선언 및 초기화
		
		public MyList()
		{
			this.array = new int[10]; // 크기가 10이고 비어있는 int형 배열 초기화
			this.capacity = 10; // 저장옹량 10으로 지정
			this.count = 0; // 정수 갯수 0으로 지정
		}
		
		public void add(int num) // 정수값을 매개변수로 받아 배열에 저장
		{
			if(count < capacity) // 
			{
				array[count] = num;
				count++;	
			}
			
			else
				System.out.println("Error입니다");
			
		}
		
		public void print() // 알맞은 형식에 맞게 출력
		{
			System.out.print("[");
			
			for(int i=0; i<count; i++)
			{
				System.out.print(array[i]);
				
				if(i < count-1)
					System.out.print(",");
			}
			
			System.out.println("]");
		}

}
