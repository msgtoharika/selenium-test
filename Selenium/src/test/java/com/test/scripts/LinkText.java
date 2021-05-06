package com.test.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
	
	public static void main(String[] args) {								
        String baseUrl = "http://demo.guru99.com/test/newtours/";					
        System.setProperty("webdriver.chrome.driver","C:\\Users\\haa\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        driver.get(baseUrl);					
        String theLinkText = driver.findElement(By					
                .partialLinkText("egis"))			
                .getText();		
        System.out.println(theLinkText);					
        List<WebElement> allLinks = driver.findElements(By					
                .partialLinkText("Project"));			
                	
        System.out.println(allLinks.size());					

        driver.quit();			

    }

}
