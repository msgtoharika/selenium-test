package com.test.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	public static WebDriver driver;
	
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\haa\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://google.com");
	}
	
	
	
	public void captureScreenshot(String methodName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\Users\\haa\\eclipse-workspace\\Selenium\\screenshots\\failshot_"+methodName+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
