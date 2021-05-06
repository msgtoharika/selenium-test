package com.test.scripts;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetDownloadDirectory {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haa\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		Map<String, Object> prefs = new HashMap();
		prefs.put("download.default_directory", "C:\\Users\\haa\\eclipse-workspace\\Selenium\\testdownloads");
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("safebrowsing.enabled", "true");

		ChromeOptions chOpt = new ChromeOptions();
		chOpt.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(chOpt);

		// URL loading
		driver.get("https://www.seleniumhq.org/download/");

		// Click on download selenium server jar file
		driver.findElement(By.xpath("//a[text()='3.141.59']")).click();
		
		Thread.sleep(10000);
		
		System.out.println(isDownloaded("selenium-server-standalone-3.141.59.jar"));
	}

	public static boolean isDownloaded (String fileName) {
		boolean flag = false;
		String dirPath = "C:\\Users\\haa\\eclipse-workspace\\Selenium\\testdownloads";
		File dir = new File(dirPath);
		File[] files = dir.listFiles( );
		if (files.length == 0 || files == null) {
			System.out.println("The directory is empty");
			flag = false;
		} else {
			for (File listFile : files) {
				if (listFile.getName().contains(fileName)) {
					System.out.println(fileName + " is present");
					break;
				}	
			}
			flag = true;
		}
		return flag;
	}
}
