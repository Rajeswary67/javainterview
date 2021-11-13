package BuilderPattern;

public class Shopping {
	
	public final Shopping Amazon()
	{
		System.out.println("hi all");
		return this;
	}
	
	public Shopping login(long ph,int otp)
	{
		System.out.println("login to app with:" +ph+":"+otp);
		return this;
    }
	public Shopping login(String un,String pwd)
	{
		System.out.println("login to app with:" +un+":"+pwd);
		return this;
	}
	public Shopping doSearch(String ProductName)
	{
		System.out.println("do search with:" +ProductName);
		return this;
	
	}
	public Shopping doSearch(String ProductName,String Color)
	{
		System.out.println("do search with:" +ProductName+Color);
		return this;
	}
	public Shopping addToCart(String ProductName)
	{
		System.out.println("adding to cart:"+ProductName);
		return this;
	}
	public Shopping doPayment(String cc,int otp)
	{
		System.out.println("making payment with:" +cc+otp);
		return this;
	}
    public Shopping doPayment(String UPI,int otp,int code)
    {
    System.out.println("making payment with:" +UPI+code+otp);
    return this;
    }
	public Shopping doPayment(long ccNumber,String password)
	{
		System.out.println("making payment with:"+ccNumber+password);
		return this;

	}
	public Shopping checkOrder(String ProductName)
	{
		System.out.println("product:" +ProductName);
		return this;
	}
	public Shopping logOut()
	{
		System.out.println("logged out from the application");
		return this;
	}
	
	
	
	
	
	
}