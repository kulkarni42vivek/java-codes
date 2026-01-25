package CoreJava;

public class ArrayBasic {
	public static void main(String[] args) {
		int[] a = new int[5];
		System.out.println(a[4]);
		a[2] = 5;
		System.out.println(a[2]);
		
		for(int i = 0 ;i< a.length;i++) {
			System.out.print(a[i]);
		}
		for(int i: a) {
			System.out.print(i);
		}
		int[] b = {4,5,5,5,5};
	}
}
