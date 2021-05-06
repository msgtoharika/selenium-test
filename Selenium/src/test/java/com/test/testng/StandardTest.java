package com.test.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StandardTest {

	WebDriver driver;
	
	@BeforeMethod()
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haa\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	@Test
	public void getTitle() {
		System.out.println("Test 1 --> Printing title");
		System.out.println(driver.getTitle());
	}
	
	
	@Test
	public void getCurrentUrl() {
		System.out.println("Test 2 --> Get current Url");
		System.out.println(driver.getCurrentUrl());
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
}
