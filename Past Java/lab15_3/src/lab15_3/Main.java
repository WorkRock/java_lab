package lab15_3;

public class Main {
	public static void main(String[] args) {
		System.out.println("lab15_3: ������");
		System.out.println("");

		// ���ڿ��� �¿� ���ҷ� ���� MyPair ��ü stringPair�� ����
		MyPair<String> stringPair = new MyPair<String>(new String("hello"), new String("bye"));
		// stringPair�� ������ ���
		System.out.println(stringPair);
		// stringPair�� �¿� ���Ҹ� ��ȯ
		stringPair.swap();
		// stringPair�� ������ ���
		System.out.println(stringPair);
		System.out.println("");

		// å(Book ��ü)�� �¿� ���ҷ� ���� MyPair ��ü bookPair�� ����
		MyPair<Book> bookPair = new MyPair<Book>(new Book("Java"), new Book("C++ "));
		// bookPair�� ������ ���
		System.out.println(bookPair);
		// bookPair�� �¿� ���Ҹ� ��ȯ
		bookPair.swap();
		// bookPair�� ������ ���
		System.out.println(bookPair);
		System.out.println("");

		// ������ü(Integer ��ü)�� �¿� ���ҷ� ���� MyPair ��ü integerPair�� ����
		MyPair<Integer> integerPair = new MyPair<Integer>(new Integer(1), new Integer(2));
		// integerPair�� ������ ���
		System.out.println(integerPair);
		// integerPair�� �¿� ���Ҹ� ��ȯ
		integerPair.swap();
		// integerPair�� ������ ���
		System.out.println(integerPair);
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
		return "left:" + this.left +" right:" + this.right;
	}

}
class Book<T>{
	private T name;

	public Book(T name)
	{
		this.name = name;
	}

	@Override
	public String toString() {
		return " " + this.name;
	}
}

