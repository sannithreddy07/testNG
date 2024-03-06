package com.ignore;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreClass2 {
  @Test
  public void test4() {
	  System.out.println("test4");
  }
  @Ignore
  @Test
  public void test5() {
	  System.out.println("test5");
  }
  @Test
  public void test6() {
	  System.out.println("test6");
  }
  @Test
  public void test7() {
	  System.out.println("test7");
  }
}
