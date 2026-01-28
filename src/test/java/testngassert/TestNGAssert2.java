package testngassert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssert2 {

	@Test
	public void testassert1()
	{
		int actual=10;
		int expected=10;
		
		SoftAssert sAssert=new SoftAssert();
		
		Assert.assertEquals(actual, expected);
		
		sAssert.assertAll();
		
	}
	
}
