package e2017.exam1;

import java.util.Arrays;

public class Example11 {
	static void printSum(int... a) {
		int sum = 0;
		int size = a.length;
		System.out.print("배열 : [");
		for(int i =0; i<size-1; ++i) {
			System.out.print(a[i] + ", ");
			sum += a[i];
		}
		sum += a[size-1];
		System.out.printf("%d]  합계 : %d",a[size-1],sum);
		System.out.println("");
		
	} 
	public static void main(String[] args) {
		int[] a = new int[] { 21, 33, 17, 40, 5, 13 }; 
		printSum( 11, 13, 17, 20 ); 
		printSum( a ); 
	} 
}