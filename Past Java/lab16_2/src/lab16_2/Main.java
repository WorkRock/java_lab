package lab16_2;

class WordRunnable implements Runnable{ // (1) Runnable�� �����ϴ� WordRunnable Ŭ������ ����
	private String word; // �ܾ�
	private int number; // �ݺ�Ƚ��

	public WordRunnable(String word, int number) {
		this.word = word;
		this.number = number;
	}

	@Override// (2) run() �޼ҵ� �������̵� - word�� number�� �ݺ��Ͽ� �� ĭ�� ��� �� �ٿ� ���
	public void run() {
		for (int i=1; i<this.number; i++){
			System.out.print(this.word+" ");
		}
	}
}
public class Main {
	public static void main(String[] args) {

		System.out.println("lab16_2: ������");

		// (3) WordRunnable�� ��ü r1 ����
		Runnable r1 = new WordRunnable("aaa", 4);

		// (4) r1�� �Ű������� �Ͽ� Thread�� ������ ��ü t1 ����
		Thread t1 = new Thread(r1);

		// (5) WordRunnable�� ��ü r2 ����
		Runnable r2 = new WordRunnable("bbb", 4);  

		// (6) r2�� �Ű������� �Ͽ� Thread�� ������ ��ü t2 ����
		Thread t2 = new Thread(r2);

		// (7) ������ t1 ����
		t1.start();

		// (8) ������ t2 ����
		t2.start();
	}
}