package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginPage {
	WebDriver driver;

	public loginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(id="username")
	WebElement username	;
	
@FindBy(id="password")
WebElement password	;

@FindBy(id="login")
WebElement login	;

public void loginAction(String email) {
	
	username.sendKeys(email);
	
}

public void setpassword(String Password) {
password.sendKeys(Password);
}

public void clicAction() {
login.click();

}

		
		
	}


