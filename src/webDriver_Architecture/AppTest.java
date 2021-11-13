package webDriver_Architecture;

public class AppTest 
{
    static WebDriver driver;
	public static void main(String[] args)
	{
//	chromeDriver driver=new chromeDriver();
//	driver.launchURL("http://www.amazon.com");
//	driver.getTitle();
//	driver.getUrl();
//	driver.findElement();
//	driver.findElements();
//	driver.sendKeys("raji software engineer");
//	driver.Click();
//	driver.Close();
//	}
   // WebDriver driver= new chromeDriver();
   // WebDriver driver= new FirefoxDriver();
    //WebDriver driver= new SafariDriver();
    String browser="chrome";
    if(browser.equals("chrome"))
    {
    	driver=new chromeDriver();
	}
	else if(browser.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(browser.equals("Safari"))
	{
		driver=new SafariDriver();
	}
	else
	{
		System.out.println("pls pass the right browser name");
	}
    driver.launchURL("http://www.amazon.com");
    System.out.println(driver.getTitle());
    System.out.println(driver.getUrl());
     driver.findElement();
     driver.findElements();
     driver.sendKeys("rajeswary");
     driver.sendKeys("rajeswary mekala");
     driver.Close();
	}
		
}
