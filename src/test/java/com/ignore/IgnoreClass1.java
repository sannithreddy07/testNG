
package com.ignore;

import org.testng.annotations.Test;

import org.testng.annotations.Ignore;

@Ignore				//ignore at class level
public class IgnoreClass1 {
	//@Ignore 		//ignore at method level
	@Test(enabled=true, priority=1, groups= {""}) //eventhough you specify enabled =true/false the first preference is @Ignore only
	  public void test1() {
		System.out.println("test1");
	  }
	//@Ignore
	  @Test
	  public void test2() {
		  System.out.println("test2");
	  }
	//@Ignore
	  @Test
	  public void test3() {
		  System.out.println("test3");
}
}
