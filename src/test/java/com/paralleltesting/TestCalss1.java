package com.paralleltesting;

import org.testng.annotations.Test;

/*parallel is used in suite level and test level in testng xml
 * if it is used suite level then parallel =tests/classes/methods and thred-count should more than 1
 * if it is test level then use parallel=classes/methods
 * Negative numbers cannot be used in thread-count
 * By default tesng xml will execute sequential execution if paarallel is not specified
 * 
 */

public class TestCalss1 {
	
	@Test 
	public void test1() {
		System.out.println("testclass1 -- test1- >> "+Thread.currentThread().getId());
	}
	@Test 
	public void test2() {
		System.out.println("testclass1 -- test2- >> "+Thread.currentThread().getId());
	}
	@Test 
	public void test3() {
		System.out.println("testclass1 -- test3- >> "+Thread.currentThread().getId());
	}
}
