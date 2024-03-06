package com.dataprovider;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderwithExcel {
	
	/*
	 * Access the data from excel using poi dependency which contains workbook,sheet classes and method
	 * write all the logic to access data from excel in the dataprovider
	 * access the dataprovider data in test method defined within same class we can do this process in different class as well
	 */
	
	@BeforeTest
	public void launch() {
		System.out.println("open browser");
	}
	@AfterTest
	public void teardown() {
		System.out.println("close browser");
	}
	@Test(dataProvider = "logindata")
	public void method1(String username, String password) {
		
		System.out.println(username+" "+password);
	}
	
	@DataProvider(name="logindata")
		public Object[][] logdataFromExcel() throws IOException{
		
		File f=new File("src/test/resources/datadriven.xlsx");
		FileInputStream f12=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(f12);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int norows=sh.getPhysicalNumberOfRows();
		int cols=sh.getRow(0).getLastCellNum();
		Object[][] td=new Object[norows-1][cols];
		for(int i=0;i<norows-1;i++) {
			for(int j=0;j<cols;j++) {
				DataFormatter df=new DataFormatter();
			td[i][j]=	df.formatCellValue(sh.getRow(i+1).getCell(j));
			}
			System.out.println();
		}
		wb.close();
		f12.close();
		return td;
			
		}

	}


