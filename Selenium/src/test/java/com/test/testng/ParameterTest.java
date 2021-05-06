package com.test.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	
	@Test
	@Parameters({"url", "un", "browser"})
	public void test1(String url, String un, String browser) {
		System.out.println(url);
		System.out.println(un);
		if(browser.equals("chrome")) {
			System.out.println("Launching chrome browser");
		}else if (browser.equals("ff")){
			System.out.println("Launching ff browser");
		}
	
	}
}
