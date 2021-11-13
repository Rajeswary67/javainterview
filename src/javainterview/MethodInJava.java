package javainterview;

public class MethodInJava {

	public static void main(String[] args) {
		MethodInJava obj=new MethodInJava();
		obj.test();
	int i=obj.sum();
	System.out.println(i);
	String j=obj.TrainerName();
	System.out.println(j);
	int k=obj.add(40, 40);
	System.out.println(k);
	
	
	}

	public void test()
	{
		System.out.println("Hello test");
	}
	
	public int sum()
	
	{
		int a=10;int b=20;
		int c=a+b;
		System.out.println(c);
	return c;
	}

	public String TrainerName()
	{
		String s="naveen";
		System.out.println(s);
		return s;
		
	}
	
	public int add(int l,int m)
	{
		int add=l+m;
		return add;
	}
	
	
}	

