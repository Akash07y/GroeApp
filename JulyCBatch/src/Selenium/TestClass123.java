package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Functions;

public class TestClass123 {
	

	public static void main(String[] args) throws InterruptedException  {


		System.setProperty("webdriver.chrome.driver", "F:\\Automation Class\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
			
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/");


		WebDriverWait wait = new WebDriverWait(driver, 20);  // Seconds
		WebElement d1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='tex']")));
		d1.sendKeys("Java");
		
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))     //  Maxmimun waiting time
				.pollingEvery(Duration.ofSeconds(1))     //  frequency to check condition
				.ignoring(NoSuchElementException.class); // condition 
		
		
		WebElement d = wait.until(new Function<WebDriver, WebElement>() {
			
			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(By.xpath("//input[@type='tex']"));
			}
			
		});
		
		d.click();
		
		
		
		
		
		
		//WebElement f =  driver.findElement(By.xpath(xpathExpression));
		
		
//		List<WebElement>  tData = driver.findElements(By.xpath("//table[@id='customers']//td"));
//
//		String cellValue ;
//		int size = tData.size();
//		System.out.println(size);
//		
//		for(int i = 0 ; i <=size-1 ; i ++)
//		{
//			cellValue = tData.get(i).getText();
//			System.out.println(cellValue);
//		}
		
		
	}	  

}
