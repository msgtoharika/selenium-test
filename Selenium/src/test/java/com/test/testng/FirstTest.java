package com.test.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.base.TestBase;

public class FirstTest extends TestBase{
	
	
	
	@Test
    public void search() {
       System.out.println("xyz");
    }
    
    
    //Deliberately fail the test case
    @Test
    public void feelingLucky() {
        Assert.fail();
    }
	
	
	

}
