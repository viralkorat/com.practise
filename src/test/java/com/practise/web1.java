package com.practise;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;



public class web1 {

	
	/*@BeforeTest
	public void beforeMethod() {
		long id = Thread.currentThread().getId(); 
		System.out.println("beforeMethod" + " : " + id);
	}*/

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void webMethod() {
		
		
		System.out.println("webMethod");
		Assert.assertTrue(false);
		
	}

	@Test
	public void phoneMethod() {
		 
		System.out.println("phoneMethod");
	}

	/*@Test
	public void callMethod() {
		long id = Thread.currentThread().getId(); 
		System.out.println("callMethod"+ " : " + id);
	}

	@AfterTest
	public void afterMethod() {
		long id = Thread.currentThread().getId(); 
		System.out.println("afterMethod"+ " : " + id);
	}*/
}
