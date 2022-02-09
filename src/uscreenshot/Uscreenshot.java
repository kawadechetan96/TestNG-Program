package uscreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.utility.Screenshot;

public class Uscreenshot {
	
	WebDriver driver=new ChromeDriver();
	@Test
	public void takescreenshot() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SetUp\\Selenium\\Driver's\\chromedriver94\\chromedriver.exe");
		
		driver.get("https://www.yahoo.com");
		
		Screenshot.getscreenshot(driver, "yahoo");
		System.out.println("Screenshot Captured");
		driver.close();
	}
}
