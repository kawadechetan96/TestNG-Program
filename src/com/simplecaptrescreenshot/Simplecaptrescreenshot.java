package com.simplecaptrescreenshot;

import java.io.File;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Simplecaptrescreenshot {

	
	
	@Test
	public void screenshot() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SetUp\\Selenium\\Driver's\\chromedriver94\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File copy=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(copy, new File("./Simplescreenshot/Google.png"));
		System.out.println("Screenshot captured");
	}
}
