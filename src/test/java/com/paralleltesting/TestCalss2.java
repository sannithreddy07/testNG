package com.paralleltesting;

import org.testng.annotations.Test;

public class TestCalss2 {
	
	@Test 
	public void test4() {
		System.out.println("testclass2 -- test4- >> "+Thread.currentThread().getId());
	}
	@Test 
	public void test5() {
		System.out.println("testclass2 -- test5- >> "+Thread.currentThread().getId());
	}
	@Test 
	public void test6() {
		System.out.println("testclass2 -- test6- >> "+Thread.currentThread().getId());
	}
	@Test 
	public void test7() {
		System.out.println("testclass2 -- test7- >> "+Thread.currentThread().getId());
	}

}
