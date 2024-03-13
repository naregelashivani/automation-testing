package BasePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {
	
	public static ExtentReports extent;
	public static ExtentSparkReporter html;
	public static WebDriver driver;
	
	@BeforeSuite
	public void reportTest()
	{
		extent = new ExtentReports();
		html = new ExtentSparkReporter("./reports/" + "extentReports.html");
		extent.attachReporter(html);
	}
	
	@BeforeMethod
	public void setupBrowser()
	{
		WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://adactinhotelapp.com/");
		 
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After");
	}
	
	@AfterSuite
	public void tearDown()
	{
		extent.flush();
	}

}
