package lab16_2;

class WordRunnable implements Runnable{ // (1) Runnable을 구현하는 WordRunnable 클래스를 정의
	private String word; // 단어
	private int number; // 반복횟수

	public WordRunnable(String word, int number) {
		this.word = word;
		this.number = number;
	}

	@Override// (2) run() 메소드 오버라이드 - word를 number번 반복하여 한 칸씩 띄어 한 줄에 출력
	public void run() {
		for (int i=1; i<this.number; i++){
			System.out.print(this.word+" ");
		}
	}
}
public class Main {
	public static void main(String[] args) {

		System.out.println("lab16_2: 이지훈");

		// (3) WordRunnable형 객체 r1 생성
		Runnable r1 = new WordRunnable("aaa", 4);

		// (4) r1을 매개변수로 하여 Thread형 스레드 객체 t1 생성
		Thread t1 = new Thread(r1);

		// (5) WordRunnable형 객체 r2 생성
		Runnable r2 = new WordRunnable("bbb", 4);  

		// (6) r2를 매개변수로 하여 Thread형 스레드 객체 t2 생성
		Thread t2 = new Thread(r2);

		// (7) 스레드 t1 시작
		t1.start();

		// (8) 스레드 t2 시작
		t2.start();
	}
}