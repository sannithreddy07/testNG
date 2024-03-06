package com.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Dataprovideclass {
	
	/*
	 * Created separate class for data provider 
	 * We can n number of data providers here and pass it to Test method
	 */
	@DataProvider(name="logindatas")
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
