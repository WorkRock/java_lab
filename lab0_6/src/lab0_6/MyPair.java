package lab0_6;

public class MyPair  
{
		private int x, y; // �� ���� ���� ����
		
		public MyPair(int x, int y) { // �ΰ��� ���� �ʱ�ȭ
			this.x = x;
			this.y = y;
		}

		public int sum() // ���� �����ϴ� �޼ҵ� sum ����
		{
			return x + y;
		}
		
		public double average() // ����� ����� �޼ҵ� average ����
		{
			return (x+y)/2;
		}
		
		public void swap() // x�� y���� �ٲ��ִ� �޼ҵ� swap ����
		{
			int swap = x; // int�� ������ �ϳ� �������־� x����
			x = y; // x���� y���� �־����� swap���� x���� ��������
			y = swap; // y�� swap. ��, x���� �־���
		}

		@Override
		public String toString() { // �� Ŭ������ ������ ����� �򵵷� �������̵��� toString
			return "MyPair [x = " + x + ", y = " + y + "]";
		}
		
}

