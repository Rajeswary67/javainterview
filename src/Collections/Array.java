package Collections;

public class Array

{
	public static void main(String[] args) {
		int a[] = new int[10];
		int b[] = new int[20];
		int c[] = { 10, 20 };
		int d[][] = { { 1, 2, 3 }, { 4, 5 } };
		a[0] = 12;
		a[1] = 123;
		a[2] = 1236;
		System.out.println(a[2]);
		System.out.println(d[0][1]);
		System.out.println(c[1]);
		System.out.println(a.length);
		System.out.println(d.length);
		c[0] = c[1];
		System.out.println(c[0]);
		System.out.println(c[1]);
	}
}
