package e2017.exam1;
public class Example01 {
	static String reverse(String s) {
		StringBuilder builder = new StringBuilder(s);
		builder.reverse();
		return builder.toString();
	} 
	public static void main(String[] args) { 
		String[] a = { "a", "1234", "hello" }; 
		for (String s : a) 
			System.out.printf("%s ", reverse(s)); 
	} 
}