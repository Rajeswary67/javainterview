package javainterview;

public class SwapingWithoutUsingTemp {
	public static void main(String[] args) {
		int t;
		// temp=t;
		int a = 10;
		int b = 20;
		//t = a;
		//a = b;
		//b = t;
		//System.out.println(a);
		//System.out.println(b);
		
		//using addition
		//a=a+b;
		//b=a-b;
		//a=a-b;
		//System.out.println(a);
		//System.out.println(b);
		
		//using multiplication
		 a=a*b;
		 b=a/b;
		 a=a/b;
		 System.out.println(a);
		 System.out.println(b);
	}
}