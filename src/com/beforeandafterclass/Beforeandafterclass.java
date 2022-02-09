package com.beforeandafterclass;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Beforeandafterclass {

WebDriver driver;
	
	@BeforeClass
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SetUp\\Selenium\\Driver's\\chromedriver94\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void verifytitle() throws Exception
	{
		String title=driver.getTitle();
		System.out.println("Title is:-"+title);
		Thread.sleep(2000);
	}
	
	@Test
	public void verifyurl()
	{
		String url=driver.getCurrentUrl();
		System.out.println("URL is;-"+url);
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	

}
