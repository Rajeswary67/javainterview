package webDriver_Architecture;

public interface WebDriver extends SourceContext {
	@Override
	public void findElement();
	@Override
	public void findElements();
	public String getTitle();
	public void launchURL(String Url);
	public String getUrl();
	public void Click();
	public void sendKeys(String Value);
	public void Close();

}
