package javainterview;

public class Product {

	public static void main(String[] args) {
		Product me = new Product();
		int i2 = me.Product(50, 60);

		System.out.println(i2);
	}

	public int Product(int a, int b) {
		System.out.println("product method");
		int z = a * b;
		return (z);
	}
}
