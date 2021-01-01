package com.testng.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GmailLogin extends BaseTest{
	
	@Test
	public void login()
	{
	   WebElement email= driver.findElement(By.id("identifierId"));
	   email.sendKeys("testpractice65@gmail.com");
	   driver.findElement(By.id("identifierNext")).click();
	   driver.findElement(By.name("password")).sendKeys("testemail123");
	   driver.findElement(By.id("passwordNext")).click();
	   wait.until(ExpectedConditions.titleContains("Inbox")); 
	   String title=driver.getTitle();
	   Assert.assertEquals(title, "Inbox (2) - testpractice65@gmail.com - Gmail");
	 }
}
