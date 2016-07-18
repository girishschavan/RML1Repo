package prm;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

public class helloworld {
	WebDriver driver;
//	HtmlUnitDriver driver;
	/*@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Girish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		driver = new ChromeDriver(options);
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}*/
		
	
	@Test
	public void testAllLinks() throws InterruptedException, IOException
	{
		System.out.println("inside test method");
		
		ChromeDriverService service = new ChromeDriverService.Builder()
				  .usingDriverExecutable(new File("C:\\Users\\Girish\\Downloads\\chromedriver_win32\\chromedriver.exe"))
				  .usingAnyFreePort()
				  .withEnvironment(ImmutableMap.of("DISPLAY",":10"))
				  .build();
				  service.start();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Girish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		driver = new ChromeDriver(options);
		//driver = new HtmlUnitDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	System.out.println(driver.getCurrentUrl());
	
	driver.quit();
	service.stop();
	}
}

	
	

