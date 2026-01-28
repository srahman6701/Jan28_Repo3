package firstTestngProgram;

import org.testng.annotations.Test;

public class LoginScenario {

	@Test(priority=1, description="Test this will check login functionality", groups ="Smoke")
	public void LoginApp()
	{
		System.out.println("Login to the application");
	}
	
	@Test(priority=2, description="Test this will check add to cart functionality" , groups ="Smoke")
	public void AddToCart()
	{
		System.out.println("Add product to the cart");
	}
	
	@Test(priority=3, description="Test this will check logout functionality" , groups ="Smoke")
	public void LogoutApp()
	{
		System.out.println("Logout from the application");
	}
}
