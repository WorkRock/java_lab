package lab15_3;

public class Main {
	public static void main(String[] args) {
		System.out.println("lab15_3: 이지훈");
		System.out.println("");

		// 문자열을 좌우 원소로 갖는 MyPair 객체 stringPair를 생성
		MyPair<String> stringPair = new MyPair<String>(new String("hello"), new String("bye"));
		// stringPair의 정보를 출력
		System.out.println(stringPair);
		// stringPair의 좌우 원소를 교환
		stringPair.swap();
		// stringPair의 정보를 출력
		System.out.println(stringPair);
		System.out.println("");

		// 책(Book 객체)을 좌우 원소로 갖는 MyPair 객체 bookPair를 생성
		MyPair<Book> bookPair = new MyPair<Book>(new Book("Java"), new Book("C++ "));
		// bookPair의 정보를 출력
		System.out.println(bookPair);
		// bookPair의 좌우 원소를 교환
		bookPair.swap();
		// bookPair의 정보를 출력
		System.out.println(bookPair);
		System.out.println("");

		// 정수객체(Integer 객체)를 좌우 원소로 갖는 MyPair 객체 integerPair를 생성
		MyPair<Integer> integerPair = new MyPair<Integer>(new Integer(1), new Integer(2));
		// integerPair의 정보를 출력
		System.out.println(integerPair);
		// integerPair의 좌우 원소를 교환
		integerPair.swap();
		// integerPair의 정보를 출력
		System.out.println(integerPair);
	}
}

// String형 좌우 원소를 저장하는 클래스
class MyPair<T> {
	private T left;
	private T right;

	public MyPair(T left, T right) {  //  생성자
		this.left = left;
		this.right = right;
	}

	public void swap() {  //  좌우 원소를 교환하는 메소드
		T tmp;
		tmp = this.left;
		this.left = this.right;
		this.right = tmp;
	}

	@Override
	public String toString() { // 객체의 속성(좌우 원소)을 하나의 문자열로 리턴하는 메소드
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

