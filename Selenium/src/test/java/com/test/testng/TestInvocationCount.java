package com.test.testng;

import org.testng.annotations.Test;

public class TestInvocationCount {

	
	@Test(invocationCount=10)
	public void m1() {
		System.out.println("Test method");
	}
}
