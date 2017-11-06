package e2017.exam1;
class Data2 { 
	Integer a; String b; 
	public Data2(Integer a, String b) {
		this.a = a; this.b = b; 
	} 
	@Override public boolean equals(Object obj) {
		if ((obj instanceof Data2) == false) 
			return false; 
		Data2 p = (Data2)obj;
		return this.a == p.a && (this.b == null ? p.b == null : this.b.equals(p.b));
	}
} 
public class Example10 {
	public static void main(String[] args) { 
		Data2[] a1 = new Data2[] { 
				new Data2(1, "a"),
				new Data2(2, null), 
				new Data2(null, "c") 
		};
		
		Data2[] a2 = new Data2[] { 
				new Data2(1, "a"), 
				new Data2(2, "b"), 
				new Data2(null, "c") 
		};
		
		System.out.println( a1[0].equals(a2[0])); 
		System.out.println( a1[1].equals(a2[1])); 
		System.out.println( a1[2].equals(a2[2])); 
	} 
}