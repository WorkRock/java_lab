package e2017.exam2;

import java.util.Random;

public class Example5 {
	public static void main(String[] args) { 
		Random random = new Random(); 
		int[] a = new int[20]; 
		for (int i = 0; i < a.length; ++i) 
			a[i] = random.nextInt(5); 
		int zero = 0,one=0,two=0,three=0,four=0;
		for(int i =0; i < a.length ; ++i) {
			if(a[i] == 0) {
				++zero;
			}
			else if(a[i] == 1)
				++one;
			else if(a[i] == 2)
				++two;
			else if(a[i] == 3)
				++three;
			else
				++four;
		}
		System.out.println("0="+ zero +" 1=" + one + " 2=" + two + " 3=" + three + " 4=" + four );
	}

}
