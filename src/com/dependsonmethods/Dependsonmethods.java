package com.dependsonmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class Dependsonmethods {

	WebDriver driver;
	
	@Test
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver",	"E:\\SetUp\\Selenium\\Driver's\\chromedriver94\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test(dependsOnMethods="launchbrowser")
	public void verifytitle()
	{
		String title=driver.getTitle();
		System.out.println("Title is:-"+title);
		
		Assert.assertEquals("Google", title);
	}
	
	@Test(dependsOnMethods="verifytitle")
	public void close()
	{
		driver.close();
	}
}
