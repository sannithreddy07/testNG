package com.basicannotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("test case 1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("login");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("logout");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("add url");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("url added");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("open browser");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("close browser");
  }
  

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Test started");
	  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("test completed");
  }

}
