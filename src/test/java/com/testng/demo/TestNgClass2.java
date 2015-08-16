package com.testng.demo;

import org.testng.annotations.Test;

public class TestNgClass2 {
	
	
	@Test (groups="Group1")
	public void testClass2Method1()
	{
		
		System.out.println("TestNg Class 2 mehtod 1 is executed");
		
	}
	
	@Test (groups="Group2")
	public void testClass2Method2()
	{
		
		System.out.println("TestNg Class 2 mehtod 2 is executed");
		
	}

}
