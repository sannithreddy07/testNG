package com.dataprovider;

import org.testng.annotations.Test;

public class DataproviderclasstestNg {
	/*
	 * Access the data provider from different class 
	 */
	
	@Test(dataProvider = "logindatas", dataProviderClass = Dataprovideclass.class)
	public void accessDataclass(Object[] s) {
		System.out.println(s[0]+" "+s[1]);
		
	}

}
