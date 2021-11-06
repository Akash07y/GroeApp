package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class NewTest extends Base{

	private WebDriver driver;
	
	
	@BeforeTest
	@Parameters ("browser")
	public void beforeTest(String browser) {
		
		System.out.println(browser);
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = openChromeBrowser();
			
			
		}
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver = openFirefoxBrowser();
		}
		
		if(browser.equalsIgnoreCase("ie"))
		{
			driver = openFirefoxBrowser();
		}		
	}
	
	@BeforeClass
	public void beforeClass() {
		object of all POM Classes 
	}
	@BeforeMethod
	public void beforeMethod(){
		 
		driver.get("https://www.w3schools.com/js/js_popup.asp") ;
	}
	
	@Test 
	public void toVerifyHomePage(){
		 System.out.println("executing Test toVerifyHomePage");
	 String url = driver.getCurrentUrl();
	 System.out.println(url);
	 
	 String Keyword = exeshScheer();
	 
	 
	 if(keyword.equals("Fail"))
	 {
		 //error msg
	 }
	 if(keyword.equals("Pass")) {
		 // haome page
	 }
	 
	 
	 
	 SoftAssert soft = new SoftAssert();
	 
	 Assert.assertEquals(url, "https://www.w3schools.com/js/js_popup.asp");
	 String tital = driver.getTitle();
	 System.out.println(tital);
	 
	 soft.assertEquals(tital, "Jipt Popup Boxes");
	 soft.assertEquals(tital, "Jipt Popup Boxes");
	
	 soft.assertEquals(tital, "Jipt Popup Boxes");
	 
	 boolean result = url.equals("expected url");
	 soft.assertTrue(result); //  result = true   ==>  Test Case = Pass
	 soft.assertFalse(result); //  result = false   ==>  Test Case = Pass
	 soft.assertAll();
	
	}
	
	@Test 
	public void testB() {
		System.out.println("TestB ClassC");
	}
	

	
	@AfterMethod
	public void afterMethod(){
		System.out.println("after method ClassC");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class ClassC");
	}
	
}
