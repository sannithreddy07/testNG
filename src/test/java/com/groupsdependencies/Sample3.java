package com.groupsdependencies;

import org.testng.annotations.Test;

//Test Groups --> depends on groups


public class Sample3 {
	
	@Test
	public void m2() {
		//System.out.println(5/0);
		System.out.println("hi");
	}
	@Test(groups = "smokii")
	public void test1() {
		System.out.println("smokii");
	}
	@Test(groups= "saniti")
	public void test3() {
		System.out.println("saniti");
		//System.out.println(5/0); //arithmeticexception fail
	}
	@Test(groups = "regress")
	public void test5() {
		System.out.println("regress");
	}
	@Test(dependsOnGroups = {"smokii","saniti", "regress"}) 
	public void test0() {
		System.out.println("main test");
	}
	@Test(dependsOnMethods = "m2") //use alwaysRun = true if you want execute this even though dependant one is failed
	public void m3() {
		System.out.println("hellow");
	}


}

