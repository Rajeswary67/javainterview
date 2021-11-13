package javainterview;

public class StaticMethods {

public static void sendMail()
{
	System.out.println(" send mail");
}
public  void getMail()
{
	System.out.println(" get mail");
}

public static void main(String[]args)
{
	StaticMethods obj=new StaticMethods();
	StaticMethods.sendMail();
	//StaticMethods.getMail();
	obj.getMail();

}
}

