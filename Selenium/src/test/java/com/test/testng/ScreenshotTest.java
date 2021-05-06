package com.test.testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.base.TestBase;

public class ScreenshotTest extends TestBase{
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	
	@Test
	public void screenshotTest() {
		System.out.println("Test method");
		Assert.assertEquals(true, false);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
