package Selenium;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestClass {

	public static void  main(String[] args) throws  IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Class\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		
		String value = EX:
			ele.sendKeys(value);
		
		List<WebElement> cells = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		
		for(int i = 0 ; i < cells.size() ; i ++)
		{

			cells.get(0).findElement(By.xpath("//td"));
			
			System.out.println(cells.get(i).getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement elel = driver.findElement(By.xpath("//a[text()='Progressbar']"));
//		//a[text()='Progressbar']
//		
//		JavascriptExecutor j =  ((JavascriptExecutor)driver);
		
//		j.executeScript("arguments[0].scrollIntoView(true);",elel);
		

		
//		Thread.sleep(3000);
//		
//		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
//	
//		
//		Select s = new Select(month);
//		
//		s.selectByIndex(Index);  // Int argument
//		s.selectByValue(Value);  // string argument
//		s.selectByVisibleText(text);  // string argument
//		
//		driver.close();
//		
//		driver.quit();
		
		
		//  implicit wait -> waiting time
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		
		//Thread.sleep(5000);
		
		
		
		//Explicit wait --> waiting + Condition 
//		WebDriverWait wait = new WebDriverWait(driver,20);  // maxmimun wait 20 seconds
//		
//		WebElement createNewAcc = wait.until(ExpectedConditions.
//				  visibilityOfElementLocated(By.xpath("//a[text()='Create New Account']")));
		                                                            //a[text()='Create New Account']
//		createNewAcc.click();
//		
		
		//Fluent Wait
//		Wait<WebDriver> wait =  new FluentWait<WebDriver>(driver)
//				               .withTimeout(Duration.ofSeconds(20))  // maxmimum waiting
//				               .pollingEvery(Duration.ofMillis(100))  // polling frequency
//				               .ignoring(NoSuchElementException.class);  // condition
//		
//		WebElement createNewAcc = wait.until(new Function<WebDriver, WebElement>(){
//			
//			public WebElement apply(WebDriver driver) {
//				return driver.findElement(By.xpath("//a[text()='Create New ']"));
//			}
//		});
//		
//		createNewAcc.click();
		
		
		
		
		
		
		
		
		
		
		
		
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest = new File("F:\\New folder\\Test123.jpeg");
//		FileHandler.copy(source, dest);
		
		
		
		
		
		
		
		
		
		
		
//		WebElement ele = driver.findElement(By.xpath("dfghj"));
//		
//		ele.click();
//		ele.sendKeys("xcghj");
		


		
		
		
		
//		xpath by attribute 
//		
//		syntax 
//		
		//tagname[@ attributeName = 'atributeValue']
		
		
		//input[@type='text']
		
		//xpath by text()
		
		//tagname[text() = 'html Text']
		
		//button[text()='Log In']
		
	//	xpath by contains 
		
		//tagname[contains(@ attributeName, 'atributeValue')]
		
		//tagname[contains(text(), 'html Text')]
		
		
//		eg
		//a[contains(@id,'createAccoun')]
		
		//a[contains(text(),'Creat your')]
		
//		xpath by index
//		
//		(Xpath)[index]
				
				
//		(//input[@type='text'])[2]
		
//		absolute xpath
//		relative xpath
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		
		
		
		
		
		
//		Implicit wait
//		Explicit wait
//		Fluent wait
	//	driver.get("https://en-gb.facebook.com/");
		// = driver.findElement(By.xpath("xpath"));
		
		
//		WebDriverWait wait = new WebDriverWait(driver,20);  // 20 seconds
//		
//		WebElement createNewAcc = wait.until(ExpectedConditions.
//				                             visibilityOfElementLocated(By.xpath("xpath")));
//		
//		
//		createNewAcc.click();
//		
//		WebElement male = driver.findElement(By.xpath("xpath"));
//		WebElement female = driver.findElement(By.xpath("xpath"));
//		WebElement custom = driver.findElement(By.xpath("xpath"));
//		
//		WebElement pronoum = driver.findElement(By.xpath("xpath"));
//
//		boolean result = pronoum.isEnabled();
//		
//		if(result == true)
//		{
//			System.out.println("ele is enabled");
//		}
//		else
//		{
//			System.out.println("ele is disabled");
//		}
		
		
		

//		Dimension d = new Dimension(300,600);  // L * H Pixels
//		driver.manage().window().setSize(d);
//		
//		Thread.sleep(5000);
//		
//		Point p = new Point(600,300); //x,y pixels	topmost left
//		driver.manage().window().setPosition(p);
		
		//WebElement
		
		//or 
		
		//driver.manage().window().setSize(new Dimension(300,600));
		
		
		
		
		
		//WebElement creatAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		
		
		
		
		
		
		
		
		
		

//		creatAcc.click();
//		
//		Thread.sleep(3000);
//		
//		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
//
//		Select s = new Select(day);
//		s.selectByIndex(3);  //0,1,2,3,		
//		s.selectByValue("8");
//		s.selectByVisibleText("12");

	}
	
}

//   webdriver.chrome.driver
//   webdriver.gecko.driver
//   webdriver.ie.driver
//   webdriver.opera.driver

