package interactionwithselenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ots.factory.BrowserFactory;

public class BaseClass {

	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.out.println("Running before method - setup browser");
		driver=BrowserFactory.startBrowser("Chrome","https://freelance-learn-automation.vercel.app/login");
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("Running after method - closing the session");
		driver.quit();
	}
}
