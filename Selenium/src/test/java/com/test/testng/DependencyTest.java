package com.test.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
	
	
	@Test
	public void test1() {
		System.out.println("test method 1");
		Assert.fail();
	}
	
	
	@Test(dependsOnMethods = "test1")
	public void test2() {
		System.out.println("test method 2");
	}
	
	
	@Test(dependsOnMethods = "test2")
	public void test3() {
		System.out.println("test method 3");
	}
	

}
