package m1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class mav2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Test
	public void hd()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		SoftAssert s= new SoftAssert();
		s.assertEquals(ob.getTitle(), "Googdfsmflkle");//error
		s.assertNotEquals(ob.getTitle(), "Googdfsmflkle");
		WebElement ele = ob.findElementByLinkText("Gmail");
		s.assertTrue(ele.isDisplayed());
		s.assertFalse(ele.isSelected());
		ob.quit();
		//actual result
		s.assertAll();
		
	}

}
