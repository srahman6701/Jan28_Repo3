package testngassert;

import org.testng.annotations.Test;

public class TestNGDependency {

	@Test
	public void loginApp()
	{
		System.out.println("Login Done");
	}
	
	@Test(dependsOnMethods = "loginApp")
	public void logoutApp()
	{
		System.out.println("Logout Done");
	}
	
}
