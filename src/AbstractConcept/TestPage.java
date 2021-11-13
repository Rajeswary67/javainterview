package AbstractConcept;

public class TestPage {

	public static void main(String[] args) {
		LoginPage lp= new LoginPage();
		lp.title();
		lp.doLogin();
		  lp.header();
		  lp.logo();
		  //lp.getUrl();
		  lp.timeOut();
		  lp.title();
		  //lp.loginPage();
		  Page p= new LoginPage();
		  p.header();
		  p.title();
		  //p.doLogin();
		  
		//lp.LoginPage();
        Page.getUrl();
        p.logo();
        //p.page();
	}

}
