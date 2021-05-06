package com.test.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.utils.MyRetryAnalayzer;

public class RetryLogicTest {
	
	
	@Test(retryAnalyzer = MyRetryAnalayzer.class)
	public void test1() {
		System.out.println("test 1");
		Assert.fail();
	}

	@Test
	public void test2() {
		System.out.println("test 2");
		Assert.fail();
	}
	
	
	@Test
	public void test3() {
		System.out.println("test 3");
	}

}
