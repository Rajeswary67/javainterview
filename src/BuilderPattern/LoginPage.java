package BuilderPattern;

public class LoginPage 
{
 private String UserName;
private String Password;
public LoginPage(String userName, String password) {
	this.UserName = userName;
	this.Password = password;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public void doLogin(LoginPage LoginPage)
{
  LoginPage.getUserName();
  LoginPage.getPassword();
  System.out.println("login with:"+LoginPage.getUserName()+""+LoginPage.getPassword());
	

}
}