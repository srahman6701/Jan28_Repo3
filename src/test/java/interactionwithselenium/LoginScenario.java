package interactionwithselenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginScenario extends BaseClass{

	@Test(description = "Verifying login scenario with admin role", groups="Regression")
	public void login()
	{
		driver.findElement(By.id("email1")).sendKeys("admin@email.com");
		driver.findElement(By.id("password1")).sendKeys("admin@123");
		
		driver.findElement(By.className("submit-btn")).click();
	}
			
	
	
}
