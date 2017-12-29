package lab0_7;

public class MyList {
		private int[] array; // int�� �迭 ����
		private int capacity = 0; // ���� �뷮�� ������ int�� ���� ���� �� �ʱ�ȭ
		private int count = 0; // �迭�� ����� ���� ������ ��Ÿ�� int�� ���� ���� �� �ʱ�ȭ
		
		public MyList()
		{
			this.array = new int[10]; // ũ�Ⱑ 10�̰� ����ִ� int�� �迭 �ʱ�ȭ
			this.capacity = 10; // ����˷� 10���� ����
			this.count = 0; // ���� ���� 0���� ����
		}
		
		public void add(int num) // �������� �Ű������� �޾� �迭�� ����
		{
			if(count < capacity) // 
			{
				array[count] = num;
				count++;	
			}
			
			else
				System.out.println("Error�Դϴ�");
			
		}
		
		public void print() // �˸��� ���Ŀ� �°� ���
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
