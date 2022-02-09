package com.ittestinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.utility.Screenshot;

public class Ittestinterface {

	WebDriver driver;
	
	@Test
	public void takescreenshot() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SetUp\\Selenium\\Driver's\\chromedriver94\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//div[@class='text' and text()='Sign I']")).click();;

		
		
	}
	
	@AfterMethod
	public void teardown(ITestResult result) throws Exception
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Screenshot.getscreenshot(driver, result.getName());
			System.out.println("Screenshot Captured");
		}
		driver.close();
	}
	
}
