package com.practise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class web2 {

	@BeforeTest
	public void beforeMethod2() {
		long id = Thread.currentThread().getId(); 
		System.out.println("beforeMethod 2" + " : " + id);
	}

	@Test
	public void webMethod2() {
		long id = Thread.currentThread().getId(); 
		System.out.println("webMethod 2"+ " : " + id);
	}

	@Test
	public void phoneMethod2() {
		long id = Thread.currentThread().getId(); 
		System.out.println("phoneMethod 2"+ " : " + id);
	}

	@Test
	public void callMethod2() {
		long id = Thread.currentThread().getId(); 
		System.out.println("callMethod 2"+ " : " + id);
	}

	@AfterTest
	public void afterMethod2() {
		long id = Thread.currentThread().getId(); 
		System.out.println("afterMethod 2"+ " : " + id);
	}

}
