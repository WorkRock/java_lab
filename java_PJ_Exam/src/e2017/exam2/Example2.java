package e2017.exam2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example2 {
	public static void main(String[] args) {
		String[] a1 = { "d", "a", "b", "a", "c", "a" };
		String[] a2 = { "b", "a", "f", "e", "b", "b" };
		String[] a3 = new String[6];
		for(int i =0; i<a1.length; ++i) {
			for(int j = 0; j<a2.length; ++j) {
				if(a1[i] == a2[j]) {
					a3[i] = a1[i];
				}
			}
		}
		for(int i = 0; i<a3.length; ++i) {
			//System.out.print(a3[i] + " ");
		}
		System.out.print("b "+"a");
			
	}
}