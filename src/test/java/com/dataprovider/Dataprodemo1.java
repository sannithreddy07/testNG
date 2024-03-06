package com.dataprovider;

import java.util.Arrays;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprodemo1 {
	
	@BeforeTest
	public void launch() {
		System.out.println("open browser");
	}
	@AfterTest
	public void teardown() {
		System.out.println("close browser");
	}
	@Test(dataProvider = "sampledataprovider")
	public void m1(String username, String password) {
		


	System.out.println(username+" "+password); //or

//	public void m1(Object[] s) {
//		System.out.println(s[0]+" "+s[1]);
	
		
//	public void m1(Object[] s) {
//		System.out.println(Arrays.toString(s));
		
//public void m1(String username, String password, String expres) {
//		if(expres.equals("valid")) {
//			System.out.println("test case passed");
//		}if(expres.equals("invalid")) {
//			System.out.println("test case passed but invalid credentials");
//		}
		
	}
	
	@DataProvider(name="sampledataprovider")
		public Object[][] testdata() {
		Object[][] data= {{"sai","ram"},{"jai","shyam"}};
		
		//Object[][] data= {{"sai","ram","valid"},{"jai","shyam","invalid"}};
		return data;
	}

}
