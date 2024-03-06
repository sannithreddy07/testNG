package com.paralleltesting;

import org.testng.annotations.Test;

public class TestCalss3 {
	
	@Test 
	public void test8() {
		System.out.println("testclass3 -- test8- >> "+Thread.currentThread().getId());
	}
	@Test 
	public void test9() {
		System.out.println("testclass3 -- test9- >> "+Thread.currentThread().getId());
	}
	@Test 
	public void test10() {
		System.out.println("testclass3 -- test10- >> "+Thread.currentThread().getId());
	}

}
