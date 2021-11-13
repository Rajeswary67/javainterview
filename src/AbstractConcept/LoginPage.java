package AbstractConcept;

public class LoginPage extends Page
{
@Override
public void title()
{
System.out.println("LP..Title");
}
@Override
public void header()
{
	System.out.println("LP..header");
}
public static void getUrl()
{
	System.out.println("http://www.xyz.com");
}
//@Overrride
//public final void logo()

{
	System.out.println("page...logo");
}

public void doLogin()
{
	System.out.println("login to app");
}
@Override
public void timeOut()
{
	System.out.println("default page timeOut is" +5);

}
public LoginPage()
{
	System.out.println("Login Page...default constructor");
}
public LoginPage(int a)
{
	System.out.println("login page...Parameter constructor" +a);
}

}



