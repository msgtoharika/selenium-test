package com.test.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haa\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/menu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		WebElement el = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(el).moveToElement(driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"))).
		moveToElement(driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"))).click().build().perform();
		driver.close();
	}

}
