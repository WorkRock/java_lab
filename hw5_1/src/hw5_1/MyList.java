package hw5_1;

public class MyList {
		private int[] array; // int�� �迭 ����
		private int capacity; // ���� �뷮�� ������ int�� ���� ���� �� �ʱ�ȭ
		private int count; // �迭�� ����� ���� ������ ��Ÿ�� int�� ���� ���� �� �ʱ�ȭ
		
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
		
		public void add(int num, int index)
		{
			for(int i = count; i>index; i--)
			{
				array[i] = array[i-1];
			}

			array[index]=num;
			
			count++;
		}
		
		public int get(int index)
		{
			return array[index];	
		}

		public void set(int index, int num)
		{
			this.array[index] = num;
		}

		public int size()
		{
			return count;
		}

		public int remove(int index)
		{
			int result = array[index];

			for(int i = index; i<count; i++)
			{
				array[i] = array[i+1];
			}

			count--;

			return result;

		}

		@Override
		public String toString() {
			String str = "[";
			for(int i = 0; i<count; i++){
				str += array[i] + ", ";
				if(i == count-1)
					str += array[i] + "]";
			}
			return str;
		}

}
