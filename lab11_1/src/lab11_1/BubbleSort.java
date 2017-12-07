package lab11_1;

public class BubbleSort {
	public static void bSort(int[] a) {
		int n = a.length;
		for(int i = n-1; i>0; --i) {
			for(int j = 0; j<i; j++) {
				swap(a,i,j);
				}
			}
	}
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[j];
		if(a[j]>a[j+1]) {
			a[j] = a[j+1];
			a[j+1] = temp;
		}
	}
}
