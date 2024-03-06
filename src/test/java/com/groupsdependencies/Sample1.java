package com.groupsdependencies;

import org.testng.annotations.Test;

/*This is group dependencies
 * one test method is dependent on other test methods which has group as smokee
 *  * if one the group is failed then dependent test method will be skipped
 * if you want to execute the dependent method eventhough the any group is failed use alwaysrun=true
 */

 public class Sample1 {
	
	@Test(groups = "smokee")
	public void test1() {
		System.out.println("test1");
	}

	@Test(groups = "smokee")
	public void test2() {
		System.out.println("test2");
	}

	@Test(groups = "smokee")
	public void test3() {
	System.out.println("test3");
		//System.out.println(5/0);
	}

	@Test(groups = "smokee")
	public void test4() {
		System.out.println("test4");
	}

	@Test(dependsOnGroups = "smokee")
	public void test0() {
		System.out.println("main test");
	}

}
