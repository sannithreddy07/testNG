package com.listners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(ItestlistnerClass.class) //we can use this annotation to execute the program without testng.xml
					//if you don't want to use we can use ,listners> tags in testng.xml
public class TestClass1 {
	@Test 
	public void test1() {
		System.out.println("i'm inside test method 1 ");
	}
	@Test (timeOut=1000)
	public void test2() throws Exception {
		Thread.sleep(2000);
		System.out.println("i'm inside test method 2");
	}
	@Test (dependsOnMethods = "test2")
	public void test3() {
		System.out.println("i'm inside test method 3");
	}

}
