package com.automation.selenium.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HelloWorldTest {
	
	//WebDriver driver = new FirefoxDriver();
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{	
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sprabhakar\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\2.53.1\\selenium-chrome-driver-2.53.1.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\WorkingFolder\\Automation\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Test()
	{
		System.out.println("Hello World");
	}

	@AfterClass
	public void tearDown()
	{
		//driver.close();
	}
}
