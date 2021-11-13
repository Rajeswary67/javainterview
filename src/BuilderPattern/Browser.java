package BuilderPattern;

public class Browser 
{
	public void Launch()
	{
		checkRAM();
	}
	public void checkRAM()
	{
		checkOS();
	}
    public void checkOS() 
    {
    	System.out.println("check os");
    }
    public static void m1()
    {
    	m2();
    }
    public static void m2()
    {
    	m3();
    }
    public static void m3()
    {
    	System.out.println("Bye");
    }
    public static void main(String[] args)
    {
    	Browser br= new Browser();
    	br.Launch();
    	br.m1();
    }
    
    
    
    }