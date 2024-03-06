package com.groups.demo;

import org.testng.annotations.Test;

public class Groups1 {
	@Test (groups={"smoke"}) //here we defining groups for test methods
	public void test4() {
		System.out.println("test4");
	  }

	@Test (groups={"regression","functional","sanity","windows.smoke"})
	public void test5() {
		System.out.println("test5");
	  }

	@Test (groups = {"regression","smoke", "windows.regression"})
	public void test6() {
		System.out.println("test6");
	  }
	@Test				//no group test method
	public void test7() {
		System.out.println("test7");
		
	  }

}


