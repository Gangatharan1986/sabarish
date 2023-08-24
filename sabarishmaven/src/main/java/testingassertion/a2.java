package testingassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(testtnglistner.t1.class)
public class a2 {
	
	@Test
	public void hd()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
	 ChromeDriver ob= new ChromeDriver();
	ob.get("http://www.google.com");
	SoftAssert s=new SoftAssert();
	s.assertEquals(ob.getTitle(), "Google");
	s.assertNotEquals(ob.getTitle(), "googler");
	WebElement ele = ob.findElementByLinkText("gmail");
	s.assertTrue(ele.isDisplayed());
     s.assertFalse(ele.isSelected());
	ob.quit();
	s.assertAll();
}
	
}