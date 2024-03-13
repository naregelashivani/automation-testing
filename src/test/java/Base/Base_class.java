package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Readconfig;

public class Base_class {
	Readconfig readconfig=new Readconfig();
    // static final Logger logger = LogManager.getLogger(Base_class.class);

   
	public String baseUrl=readconfig.getApplication();
	public String username=readconfig.getusername();
	public String password =readconfig.getpassword();
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

@BeforeClass
@Parameters	("browser") 

public void setup(String br) {
	
	System.setProperty("log4j.configurationFile", "C:\\Users\\sb21149\\Documents\\Testing\\Adactin_22\\logs");
if(br.equals("chrome")) {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
}
else if(br.equals("Firefox")) {
	WebDriverManager.firefoxdriver().setup();
	 driver=new FirefoxDriver();
}
else if(br.equals("edage")) {
	WebDriverManager.edgedriver().setup();
	 driver=new EdgeDriver();
}
driver.get(baseUrl);

}
@AfterSuite
public void exsit()
{
	extent.flush();
}
@AfterClass
public void tearDown() {
	driver.quit();
}

}
