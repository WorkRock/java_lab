package e2017.exam2;

public class Example1 {

	public static void main(String[] args) { 
		String[] a = { "d", "a", "b", "a", "c", "d", "e", "f", "e" };
		int size = a.length;
		String[] b = new String[size];
		String[] c = {"d","a","b","c","e","f"};
		int error = 0;
		for(int i = 0; i<size; ++i) {
			for(int j = 0; j<size; ++j) {
				if(a[j] == a[i]) {
					++error;
				}
			}
			if(error == 1) {
				//System.out.print(a[i] + " ");
				error = 0;
			}
			else {
				b[i] = a[i];
				for(int j = 0; j<size; ++j) {
					if(b[j] != a[i]) {
						error = 0;
						continue;
					}
					//System.out.print(a[i] + " ");
				}

			}
		}
		for(int i =0; i<c.length; ++i) {
			System.out.print(c[i] + " ");
		}
	}
}
