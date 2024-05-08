package Basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest2 {
	
	@BeforeMethod
	public void b1()
	{
		System.out.println("Test Start");
	}
	
	
	@Test(priority=3, groups="smoke")
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test(priority=1)
	public void test2()
	{
		System.out.println("Test2");
	}
	
	@Test(priority=2)
	public void test3()
	{
		System.out.println("Test3");
	}
	
	@Test(groups="smoke")
	public void test4()
	{
		System.out.println("Test4");
	}
  
	@AfterMethod
	public void b2()
	{
		System.out.println("Test End");
	}
	
}
