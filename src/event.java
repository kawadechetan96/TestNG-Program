import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class event {

	
	
	@Test
	public void launchbrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SetUp\\Selenium\\Driver's\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5j0bx521tf_e&adgrpid=61665929249&hvpone=&hvptwo=&hvadid=486445347800&hvpos=&hvnetw=g&hvrand=15422281015821030218&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007783&hvtargid=kwd-298441375321&hydadcr=5621_2175698&gclid=CjwKCAiAqIKNBhAIEiwAu_ZLDu2WBGPdEkw-bj4IcmJ4xXSjbe-amJ-tdft-UhAMCQtEPZNAkRC_6hoCmlgQAvD_BwE");
		
		Select sel=new Select(driver.findElement(By.xpath("//select[@title='Search in']")));
		
		sel.selectByVisibleText("Deals");
		
		
		List<WebElement> li=sel.getOptions();
		
		int i=li.size();
		
		System.out.println(i);
		for(int j=0; j<i;j++)
		{
			System.out.println(li.get(j).getText());
			
		}
		
	}
	
}
