package lab16_1;

class WordThread extends Thread{ // (1) Thread를 상속하는 WordThread 클래스를 정의
	private String word; // 단어
	private int number; // 반복횟수

	public WordThread(String word, int number) {
		this.word = word;
		this.number = number;
	}

	// (2) run() 메소드 오버라이드 - word를 number번 반복하여 한 칸씩 띄어 한 줄에 출력
	@Override
	public void run(){
		for(int i = 0; i<this.number; i++)
			System.out.print(this.word + " ");
	}
}
public class Main {
	public static void main(String[] args) {

		System.out.println("lab16_1: 이지훈");

		// (3) WordThread형 스레드 객체 t1 생성
		Thread t1 = new WordThread("aaa",4);

		// (4) WordThread형 스레드 객체 t2 생성 
		Thread t2 =  new WordThread("bbb",4);

		// (5) 스레드 t1 시작
		t1.start();

		// (6) 스레드 t2 시작
		t2.start();
	}
}
