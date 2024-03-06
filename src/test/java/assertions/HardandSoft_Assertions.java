package assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class HardandSoft_Assertions {
	
	static WebDriver driver=new ChromeDriver();
	
	static SoftAssert softassert=new SoftAssert();
	
	@Test
	public static void hardAssertion() throws Exception {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
	//	driver.findElement(By.name("email")).sendKeys("hyd");
		String actualtitle=driver.getTitle();
		String expectedtitle="Facebook – log in or sign up";
		Assert.assertEquals(actualtitle, expectedtitle, "title matched");
		driver.quit();
		
	}
	
	
	@Test
	public static void softAssertiion() throws Exception {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("HYd");
		String actualurl=driver.getCurrentUrl();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		
		//Verify URL
		
		
		String expectedurl= "https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzA3NzIyMDUwLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
		 softassert.assertNotEquals(actualurl, expectedurl, "url mismatched");
		 
		 //verify textbox
		 
		 String actualtextboxcontent=driver.findElement(By.name("email")).getAttribute("value");
		 String expectedtextbox="";
		 softassert.assertEquals(actualtextboxcontent, expectedtextbox, "textbox is matched");
		 
		//verify border
		 
		 String actualborder=driver.findElement(By.name("email")).getCssValue("border");
		 String expectedborder="0.666667px solid rgb(240, 40, 73)";
		 softassert.assertEquals(actualborder, expectedborder, "color is matched");
		
		 
		 //verify error text
		 
		 String actualerro=driver.findElement(By.xpath("//div[@id='email_container']/div[2]")).getText();
		 String expectederror="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		 softassert.assertEquals(actualerro, expectederror, "error is matched");
		 
		 driver.quit();
		 softassert.assertAll();
		 
	
	}
	

}
