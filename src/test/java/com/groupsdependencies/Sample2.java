package com.groupsdependencies;

import org.testng.annotations.Test;

/*This group dependency
 * Here on test method is dependent on multiple groups which has smokei, sanity 
 * Frist two are executed then only the dependent one is executed
 * if one the group is failed then dependent test method will be skipped
 * if you want to execute the dependent method eventhough the any group is failed use alwaysrun=true
 */ 

//Test Method --> depends -->groups 

public class Sample2 {
	@Test(groups = "smokei")
	public void test1() {
		System.out.println("smokei");
	}

	@Test(groups = "smokei")
	public void test2() {
		System.out.println("smokei");
	}

	@Test(groups = "sanitye")
	public void test3() {
		System.out.println("sanitye");
		//System.out.println(5/0); //arithmeticexception fail
	}

	@Test(groups = "sanitye")
	public void test4() {
		System.out.println("sanitye");
	}

	@Test(dependsOnGroups = {"smokei","sanitye"}, alwaysRun = true) //run if group has failed
	public void test0() {
		System.out.println("main test");
	

}
}
