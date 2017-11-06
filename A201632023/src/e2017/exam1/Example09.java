package e2017.exam1;
class Data {
	Object obj = new Object();
	public Data() {
		obj = new String("hello");
	}
	public Data(int a) {
		this.obj = new int[] {1,2,3};
	}
	public Data(Integer a) {
		this.obj = new Integer[] {1,2,3};
	}
} 
public class Example09 { 
	public static void main(String[] args) {
		Data[] a = new Data[3];
		a[0] = new Data((int)0);
		a[1] = new Data((Integer)0);
		a[2] = new Data();
	}
}