package com.Jenkins.jenkins;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Jenkins {
	
	@BeforeTest
	public void setUp()
	{
		System.out.println("This is test begin");
	}
	
	
	@Test
	public void test(){
		
		System.out.println("This is the test man");
		
	}
	
	@AfterTest
	public void test2()
	{
		System.out.println("This is the second test man");
	
	}
	
	public void tearDown()
	{
		System.out.println("No test for old man ");
		System.out.println("Test done buddy");
	}

}
