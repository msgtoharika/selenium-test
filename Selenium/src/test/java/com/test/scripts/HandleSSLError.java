package com.test.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandleSSLError {
	
	public static void main(String[] args) throws InterruptedException {								
        String baseUrl = "https://cacert.org/";					
        System.setProperty("webdriver.chrome.driver","C:\\Users\\haa\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");		
        
        ChromeOptions chOpt = new ChromeOptions();
//        chOpt.addArguments("--ignore-ssl-errors=yes");
//        chOpt.addArguments("--ignore-certificate-errors=yes");
        chOpt.setAcceptInsecureCerts(true);
        
        WebDriver driver = new ChromeDriver(chOpt);					
        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        driver.close();
        
        
	}
        

}
