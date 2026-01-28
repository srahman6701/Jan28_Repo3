package dataproviderexamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTDemo {

	
	@Test(dataProvider="logindata")
	public void loginscenario(String username , String password)
	{
		System.out.println("Username is " +username);
		System.out.println("Password is " + password);
	}
	
	@DataProvider(name="logindata")
	public Object[][] getLoginData()
	{
		
		System.out.println("Test data is getting ready");
		Object[][] arr=new Object [4][2];
		
		arr[0][0]="admin@email.com";
		arr[0][1]="admin@123";
		
		arr[1][0] ="mukesh@gmail.com";
		arr[1][1] ="admin@123";
		
		arr[2][0] ="ankur@gmail.com";
		arr[2][1]="admin@123";
		
		arr[3][0]="Manisa@gmail.com";
		arr[3][1]="admin@123";
		
		System.out.println(" Test data is ready for test");
		
		return arr;
	}
	
	
}
