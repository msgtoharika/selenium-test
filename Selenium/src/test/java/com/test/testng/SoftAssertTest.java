package com.test.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void m1() {
		
		System.out.println("launch url");
		System.out.println("login");
		//Assert.assertEquals(true, false);
		System.out.println("home page logo test");
		
		
		softAssert.assertEquals(false, true, "home page test failed");
		System.out.println("contacts page test");
		
		softAssert.assertEquals(false, true, "contacts page test failed");
		System.out.println("search page test");
		
		softAssert.assertEquals(false, true, "search page test failed");
		System.out.println("community page test");
		
		softAssert.assertAll();
		
	}

}
