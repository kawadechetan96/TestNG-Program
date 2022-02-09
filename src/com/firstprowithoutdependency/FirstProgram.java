package com.firstprowithoutdependency;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstProgram {
	
	WebDriver driver;
	
	@Test
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SetUp\\Selenium\\Driver's\\chromedriver94\\chromedriver.exe");
        driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
	}
	
	@Test
	public void verifytitle()
	{
		String title=driver.getTitle();
		System.out.println("Title:-"+title);
	}

	@Test
	public void verifyurl()
	{
		String ul=driver.getCurrentUrl();
		System.out.println("URL is:-"+ul);
	}
	
	@Test
	public void close()
	{
		driver.close();
	}
}
