package com.datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dataprovider.ExcelConfig;

public class Datadriven {
	
		public static WebDriver driver;
		
		@BeforeMethod
		public void launchbrowser()
		{
			System.setProperty("webdriver.chrome.driver", "E:\\SetUp\\Selenium\\Driver's\\chromedriver94\\chromedriver.exe");
			 driver=new ChromeDriver();
			
			driver.get("https://www.eventbrite.com/signin/?referrer=%2Fonboarding%2F");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}

		@Test(dataProvider="evenpasstdata")
		public void eventdata(String uname, String pass)
		{
		
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys(uname);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			String username=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/span[2]")).getText();
			Assert.assertEquals(username,"shivam17345@gmail.com", "Invalid user");
		}
		
		@DataProvider(name="evenpasstdata")
		public Object[][] passdata()
		{
			Object[][] data=ExcelConfig.config("Event");
			return data;
		}
		
		@AfterMethod
		public void close()
		{
			driver.close();
		}
}
