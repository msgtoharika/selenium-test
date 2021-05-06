package com.test.testng;

import org.testng.annotations.Test;

public class TestPriority {
	
	@Test(priority=2)
	public void test1() {
		System.out.println("test method 1");
	}
	
	
	@Test
	public void test2() {
		System.out.println("test method 2");
	}
	
	
	@Test (priority=0)
	public void test3() {
		System.out.println("test method 3");
	}
	
	@Test
	public void test4() {
		System.out.println("test method 4");
	}
	
	@Test(priority=3)
	public void test5() {
		System.out.println("test method 5");
	}
	
	
	@Test (priority=1)
	public void test6() {
		System.out.println("test method 6");
	}
	
	
	@Test(priority=3)
	public void test7() {
		System.out.println("test method 7");
	}

}
