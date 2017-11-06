package e2017.exam1; 
public class Example02 {
	static int countVowel(String s) {
		int count = 0;
		s = s.toLowerCase();
		for(int i =0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c == 'a')
				count++;
			else if(c == 'e')
				count++;
			else if(c == 'i')
				count++;
			else if(c == 'o')
				count++;
			else if(c == 'u')
				count++;
		}
		return count;	
	} 
	public static void main(String[] args) {
		String[] a = { "hello", "1234", "HELLO world", "aeiou AEIOU" }; 
		for (String s : a) 
			System.out.printf("%d ", countVowel(s)); 
	} 
}