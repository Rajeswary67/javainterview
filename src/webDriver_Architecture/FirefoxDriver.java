package webDriver_Architecture;

public class FirefoxDriver implements WebDriver
{
	public FirefoxDriver()
	{
		System.out.println("default constructor of ChromeDriver");
	}

	@Override
	public void findElement()
	{
		System.out.println("finding element");
	}
    @Override
    public void findElements()
    {
    	System.out.println("finding elements");
    }
    @Override
    public String getTitle()
    {
    	return "title of the page";
    }
    @Override
   public void launchURL(String Url)
    {
    	System.out.println("launching the url:" +Url);
    }
    @Override
    public String getUrl()
    {
    	return "http://www.amazon.in";
    }
    @Override
    public void Click()
    {
    	System.out.println("click an element");
    }
    @Override
    public void sendKeys(String Value)
    {
    	System.out.println("enter the value:" +Value);
    }
    @Override
    public void Close()
    {
    	System.out.println("browser is closed");
    }
}





	
	

