package com.groups.demo;

import org.testng.annotations.Test;

//@Test (groups={"all"} )
public class Groups {
	
	@Test (groups={"smoke","sanity","windows.regression"}) //here we defining groups for test methods
	public void test1() {
		System.out.println("test1");
	  }

	@Test (groups={"functional","sanity", "windows.smoke"})
	public void test2() {
		System.out.println("test2");
	  }

	@Test
	public void test3() {
		System.out.println("test3");
	  }

}
