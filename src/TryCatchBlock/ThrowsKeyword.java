package TryCatchBlock;

public class ThrowsKeyword 
{
public void m1()
{
	m2();
}
public void m2()
{
	m3();

}
public void m3()
{
	try {
	int a=9/0;
}catch(Exception e)
	{
	System.out.println("handled exception");
	}
	}
public static void main(String[] args)
{
	ThrowsKeyword obj = new ThrowsKeyword();
	obj.m1();
	System.out.println("Bye");
}
}