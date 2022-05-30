package testClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 {
    
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforesuite TestClass 2");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("bedore Test TestClass 2");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass TestClass 2");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod TestClass 2");
	}

	@Test
	public void testC()
	{
		System.out.println("testC TestClass 2");
	}
	
	@Test
	public void testD()
	{
		System.out.println("testD TestClass 2");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod TestClass 2");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass TestClass 2");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("after Test TestClass 2");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suite TestClass 2");
	}
}
