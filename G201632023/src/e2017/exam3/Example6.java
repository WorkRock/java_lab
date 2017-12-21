package e2017.exam3;

import java.util.Arrays;
import java.util.Random;

public class Example6 {

	static void solution(int[] a) {
		/*for(int i = 0; i < a.length ; ++i) {
			if(a[i] % 3 == 0 || a[i] % 2 == 0) {
				if(i+1 == a.length-1) {
					a[i] = 0;
				System.out.println(Arrays.toString(a));
				}
				else {
					a[i] = a[i+1];
					if(a[i+1] == 0) {
						continue;
					}
					a[i+1] = 0;
					System.out.println(Arrays.toString(a));
					if(i != 0)
						--i;
				}
			}
		}*/
		for(int i = 0; i<a.length; ++i) {
			if(a[i] % 2 == 0 || a[i] % 3 == 0) {
				a[i] = 0;
				System.out.println(Arrays.toString(a));
			}
		}
		for(int i = a.length-1; i>=0; --i) {
			if(a[i] == 0)
				a[i] = -1;
			else {
				
			}
		}
		
	}

	public static void main(String[] args) {
		Random random = new Random();
		int[] a = new int[10];
		for (int i = 0; i < 10; ++i)
			a[i] = random.nextInt(8) + 1;
		System.out.println(Arrays.toString(a));
		solution(a);
		System.out.println(Arrays.toString(a));
	}
}
