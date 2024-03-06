package com.parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parametersample1 {
	
	WebDriver driver;
	
	@Parameters("browsername")
	@BeforeTest
	public void launchbrow(@Optional("chrome") String Browsername) {
		switch(Browsername) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
			default:
				System.out.println("entered browser is not available");
				break;
		}
		driver.manage().window().maximize();
	}
	
	
	@Parameters("url")
	@Test
	public  void m1(String urls) {
		driver.get(urls);
		driver.close();
	}

}
