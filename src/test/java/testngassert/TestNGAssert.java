package testngassert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssert {

	
	@Test
	public void testngAssert1()
	{
		System.out.println("********Test started****");
		
		int actual=11;
		int expected=11;
		
		Assert.assertEquals(actual, expected, "value did not match");
		System.out.println("*********Ending Test*********");
	}
	
	@Test
	public void testngAssert2()
	{
	  boolean status=true; //actual
	  
		Assert.assertTrue(status, "Status mismatch");
		 
		System.out.println("*********Ending Test*********");
	}
	
	@Test
	public void testngAssert3()
	{
	  boolean status=true; //actual
	  
		Assert.assertTrue(status, "Status mismatch");
		 
		
	}
	
}
