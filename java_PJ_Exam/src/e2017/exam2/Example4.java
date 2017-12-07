package e2017.exam2;

public class Example4 {
	int a = 3, b = 4; 
	
	class innerClass{
		int a = 0;
		int b = 0;
		void swap() {
			this.a = b;
			this.b = a;
		}
	}
	void doSomethoing() { 
		System.out.printf("%d %d\n", b, a);
		}
	
	public static void main(String[] args) { 
		new Example4().doSomethoing(); 
	}
}
