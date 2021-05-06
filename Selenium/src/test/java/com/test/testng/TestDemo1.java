package com.test.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDemo1 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}
	

	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	
	@Test
	public void test1() {
		System.out.println("test method 1");
	}
	
	@Test
	public void test2() {
		System.out.println("test method 2");
	}
	
	
	@Test
	public void test3() {
		System.out.println("test method 3");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after Test");
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
	
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after Suite");
	}
	
	
	
	
	

	
	
	
}