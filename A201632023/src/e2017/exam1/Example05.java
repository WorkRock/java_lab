package e2017.exam1; 
public class Example05 { 
	static String convertToSnakeCase(String s) {
		StringBuilder builder = new StringBuilder();
		String a = s.toUpperCase();
		String b = s.toLowerCase();
		for(int i =0; i<s.length(); ++i){
			char c = s.charAt(i);
			char u = a.charAt(i);
			char l = b.charAt(i);
			if (builder.length() <= 1) {
				builder.append(l);
				continue;
			}
			else if (builder.length() > 1)
				if(c == u) {
					builder.append("_");
					builder.append(l);
					continue;
				}
			builder.append(c);
		}
		return builder.toString();
	} 
	public static void main(String[] args) { 
		String[] a = { "helloWorld", "oneTwoThree", "HowDoYouDo", "One" }; 
		for (String s : a) 
			System.out.printf("%s ", convertToSnakeCase(s)); 
	} 
}