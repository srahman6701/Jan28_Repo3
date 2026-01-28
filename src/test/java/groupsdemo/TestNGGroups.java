package groupsdemo;

import org.testng.annotations.Test;

public class TestNGGroups {
	
	@Test(groups = "Smoke")
	public void test1()
	{
		System.out.println(" Test 1 Smoke Test");
	}

	@Test(groups = "Smoke")
	public void test2()
	{
		System.out.println(" Test 2 Smoke Test");
	}

	@Test(groups = "Regression")
	public void test3()
	{
		System.out.println(" Test 3 Regression Test");
	}
	@Test(groups = "Regression")
	public void test4()
	{
		System.out.println(" Test 4 Regression Test");
	}


	
}
