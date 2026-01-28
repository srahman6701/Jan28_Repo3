package parametersintestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ots.factory.BrowserFactory;
import com.ots.helper.Utility;



public class ParameterDemo 
{

	@Parameters({"Browser","Env"})
	@Test
	public void testApp( @Optional("Chrome") String browsername ,@Optional("https://freelance-learn-automation.vercel.app/login") String env) throws InterruptedException
	{	
		WebDriver driver = BrowserFactory.startBrowser(browsername, env);
		driver.findElement(By.id("email1")).sendKeys("admin@email.com");
		driver.findElement(By.id("password1")).sendKeys("admin@123");
		Thread.sleep(3000);
		driver.findElement(By.className("submit-btn")).click();
		driver.quit();
	}
	
	
	
	
}
