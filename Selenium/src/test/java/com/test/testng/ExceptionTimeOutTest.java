package com.test.testng;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
//	@Test (timeOut=2000)
//	public void m1() {
//		System.out.println("test method 1");
//		while(1==1) {
//			System.out.println(1);
//		}
//	}

	
	@Test (expectedExceptions = ArithmeticException.class)
	public void test1() {
		int a = 9/0;
		System.out.println("Test1");
	}
}
