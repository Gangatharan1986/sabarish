package testingassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class a1 {
	
	public void hd()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		 ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		Assert.assertEquals(ob.getTitle(), "Google");
		//Assert.assertNotEquals(ob.getTitle(), "googler");
		WebElement ele = ob.findElementByLinkText("gmail");
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertFalse(ele.isSelected());
		ob.quit();
	}
}
