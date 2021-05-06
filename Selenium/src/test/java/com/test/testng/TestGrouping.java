package com.test.testng;

import org.testng.annotations.Test;

public class TestGrouping {
	
	@Test(groups = {"test"})
	public void test1() {
		System.out.println("test method 1");
	}
	
	
	@Test(groups="group1")
	public void test2() {
		System.out.println("test method 2");
	}
	
	
	@Test (groups={"group2", "group3"})
	public void test3() {
		System.out.println("test method 3");
	}
	
	@Test(groups = {"test"})
	public void test4() {
		System.out.println("test method 4");
	}
	
	@Test(groups="group1")
	public void test5() {
		System.out.println("test method 5");
	}
	
	
	@Test (groups = {"test"})
	public void test6() {
		System.out.println("test method 6");
	}
	
	
	@Test(groups="group1")
	public void test7() {
		System.out.println("test method 7");
	}


}
