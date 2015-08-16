package com.testng.demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SetupClass {

	@BeforeSuite  (groups={"Group1","Group2"})
	public void beforeSuiteMethod() {
		System.out.println("Method is executed before test Suite execution");

	}

	@AfterSuite  (groups={"Group1","Group2"})
	public void afterSuiteMethod() {
		System.out.println("Method is executed after test Suite execution");

	}
}
