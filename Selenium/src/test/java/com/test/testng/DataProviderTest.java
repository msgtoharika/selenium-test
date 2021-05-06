package com.test.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utils.ReadExcelData;

public class DataProviderTest {
	
	
	@DataProvider(name = "getData")
	public Object[][] getData(){
		Object[][] data = ReadExcelData.getData("usernames");
		return data;
	}
	
	
	@Test(dataProvider="getData")
	public void test1(String slno, String fname, String lname, String dept) {
		System.out.println("slno -->"+slno +" fname-->"+fname+" lname-->"+lname+" dept-->"+dept);
	}

}
