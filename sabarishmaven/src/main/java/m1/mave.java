package m1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class mave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
		@Test
		public void hd()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
			ChromeDriver ob= new ChromeDriver();
			ob.get("http://www.google.com");
			Assert.assertNotEquals(ob.getTitle(), "Googdfsmflkle");
			WebElement ele = ob.findElementByLinkText("Gmail");
			Assert.assertTrue(ele.isDisplayed());
			Assert.assertFalse(ele.isSelected());
			ob.quit();
		
		
	}

}
