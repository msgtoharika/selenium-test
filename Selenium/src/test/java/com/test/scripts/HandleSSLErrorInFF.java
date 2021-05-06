package com.test.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class HandleSSLErrorInFF {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "https://cacert.org/";					
        System.setProperty("webdriver.gecko.driver","C:\\Users\\haa\\eclipse-workspace\\Selenium\\driver\\geckodriver.exe");		
        
        FirefoxOptions ffOpt = new FirefoxOptions();
        ffOpt.setAcceptInsecureCerts(true);
        
        WebDriver driver = new FirefoxDriver(ffOpt);
        driver.get(baseUrl);
        
        System.out.println(driver.getTitle());
        driver.close();
      
        

	}

}
