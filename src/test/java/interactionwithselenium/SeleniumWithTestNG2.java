package interactionwithselenium;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ots.factory.BrowserFactory;

public class SeleniumWithTestNG2 extends BaseClass {
	
	@Test(description="Checking application home page",groups="Smoke")
	public void verifyURL()
	{
		
		String currentURL=driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("login"), "This page is not landing the right page");
		
	}
	@Test(description="Checking application home page",groups="Smoke")
	public void verifyTitle()
	{
		
		String currentTitle=driver.getTitle();
		Assert.assertTrue(currentTitle.contains("Automation"),"Title mismatched");
		
	}
	
}
