package com.testng.demo;

import org.testng.annotations.Test;

public class TestNgClass1 {
	
	
	@Test (groups="Group1")
	public void testClass1Method1()
	{
		
		System.out.println("TestNg Class 1 mehtod 1 is executed");
		
	}
	
	@Test (groups="Group2")
	public void testClass1Method2()
	{
		
		System.out.println("TestNg Class 1 mehtod 2 is executed");
		
	}

}
