package prm;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class helloworld {
	WebDriver driver;
	
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
	public void testAllLinks() throws InterruptedException
	{
		System.out.println("inside test method");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Girish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		driver = new ChromeDriver(options);
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	System.out.println(driver.getCurrentUrl());
		
	}
}

	
	

