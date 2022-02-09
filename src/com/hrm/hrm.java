package com.hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hrm {
	
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SetUp\\Selenium\\Driver's\\chromedriver94\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin13");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM" , "Invalid user ");
		driver.close();
	}
	//input[@name='txtUsername']
	//input[@name='txtPassword']
	//input[@name='Submit']

}
