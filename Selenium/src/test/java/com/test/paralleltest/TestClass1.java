package com.test.paralleltest;

import org.testng.annotations.Test;

public class TestClass1 {
	
	
	@Test(priority=2)
	public void test1() {
		System.out.println("TestClass1.test1() --> "+Thread.currentThread().getName());
	}

	@Test (priority=1)
	public void test2() {
		System.out.println("TestClass1.test2() --> "+Thread.currentThread().getName());
	}

	
	@Test(priority=2)
	public void test3() {
		System.out.println("TestClass1.test3()--> "+Thread.currentThread().getName());
	}

}
