package com.testng.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;


public class BaseTest {
	
	public static WebDriver driver=null;
	public static WebDriverWait wait=null;
	
	
	@BeforeTest
	public void launchApp()
	{ 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venky\\Edurekha\\Selenium\\Testing\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait=new WebDriverWait(driver,10);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
	}
	
	@AfterTest
	public void closeApp()
	{
	  driver.quit();	
	}
	
	

}
