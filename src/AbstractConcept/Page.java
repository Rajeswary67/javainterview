package AbstractConcept;

public abstract class Page 
{	
public abstract void title();
public abstract void header();
public void timeOut()
{
	System.out.println("default time out is:" +20);
}
public final void logo()

{
	System.out.println("page...logo");
}
public static void getUrl()
{
	System.out.println("http://www.xyz.com");
}
public Page()
{
System.out.println("page....default constructor");
}
public Page(int a)
{
	System.out.println("page...one parameter constructor:" +a);
}


}
