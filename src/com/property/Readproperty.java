package com.property;


import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Readproperty {
	
	Properties pro;
	WebDriver driver;
	//File source;
	@BeforeMethod
	public void setup() throws Exception
	{
		
				File source=new File("./Property File/Config.property");
				FileInputStream fis=new FileInputStream(source);
				
				pro=new Properties();
				pro.load(fis);
				
				
	}
	
	@Test(priority=1)
	public void lauchbrowser() throws Exception
	{
	System.setProperty("webdriver.chrome.driver",pro.getProperty("path") );
	driver=new ChromeDriver();
	driver.get(pro.getProperty("url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys(pro.getProperty("username"));
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pro.getProperty("password"));
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(500);
	String username=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/span[2]")).getText();
	Assert.assertEquals(username,"shivam17345@gmail.com", "Invalid user");
	
	}
	
	@AfterMethod
	public void teardown()
	{
		
		driver.close();
	}
}
