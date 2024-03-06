package com.paralleltesting;

import org.testng.annotations.Test;

public class TestCalss4 {
	
	@Test 
	public void test11() {
		System.out.println("testclass4 -- test11- >> "+Thread.currentThread().getId());
	}

}
