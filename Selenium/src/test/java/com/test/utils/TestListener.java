package com.test.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class TestListener extends com.test.base.TestBase implements ITestListener {
	
	
   
	@Override
    public void onTestFailure(ITestResult result) {
    	System.out.println("Test failed: "+result.getName());
    	captureScreenshot(result.getName());
		
    }
    
	
}  
