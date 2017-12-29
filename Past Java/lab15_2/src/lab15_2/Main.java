package lab15_2;

public class Main {
	public static void main(String[] args) {
		System.out.println("lab15_2: ������");

		// ���ڿ��� �¿� ���ҷ� ���� MyPair ��ü stringPair�� ����
		MyPair<String> stringPair = new MyPair<String>(new String("hello"), new String("bye"));

		// stringPair�� ������ ���
		System.out.println(stringPair);

		// stringPair�� �¿� ���Ҹ� ��ȯ
		stringPair.swap();

		// stringPair�� ������ ���
		System.out.println(stringPair);
	}
}

// String�� �¿� ���Ҹ� �����ϴ� Ŭ����
class MyPair<T> {
	private T left;
	private T right;

	public MyPair(T left, T right) {  //  ������
		this.left = left;
		this.right = right;
	}

	public void swap() {  //  �¿� ���Ҹ� ��ȯ�ϴ� �޼ҵ�
		T tmp;
		tmp = this.left;
		this.left = this.right;
		this.right = tmp;
	}

	@Override
	public String toString() { // ��ü�� �Ӽ�(�¿� ����)�� �ϳ��� ���ڿ��� �����ϴ� �޼ҵ�
		return "left:" + this.left + " right:" + this.right;
	}
}

