package login_test;


import org.testng.annotations.Test;

import Base.Base_class;
import Base.loginPage;


public class login_test_ad extends  Base_class{
	
	loginPage lp=new loginPage(driver);

	@Test
	public void login() {
    
	extent.createTest("LoginTest").assignCategory("FunctionalTesting").assignAuthor("shivani");

	lp.loginAction(username);
	lp.setpassword(password);
	lp.clicAction();
		
	
	}
	@Test
	public void test2() {
		extent.createTest("test2").assignCategory("loadtesting").assignAuthor("vinay");
		lp.loginAction(username);
		lp.setpassword(password);
		lp.clicAction();
	}
	@Test
	public void test3() {
		extent.createTest("test3").assignCategory("Retesting").assignAuthor("mohan");
	}
	
	
	
}
