package com.test.scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haa\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");

		// Element which needs to drag.
		WebElement From = driver.findElement(By.xpath("//a[text()=' 5000 ']"));

		// Element on which need to drop.
		WebElement To = driver.findElement(By.xpath("//ol[@id='amt8']/li"));

		// Using Action class for drag and drop.
		Actions actions = new Actions(driver);

		// Dragged and dropped.
		actions.dragAndDrop(From, To).build().perform();
		
		//actions.clickAndHold(From).moveToElement(To).release().build().perform();
		
		Thread.sleep(4000);
		
		//actions.dragAndDropBy(From, 500, 500);
		
		driver.close();
		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		alert.dismiss();
//		alert.sendKeys("abc");
//		alert.getText();
		

	}

}
