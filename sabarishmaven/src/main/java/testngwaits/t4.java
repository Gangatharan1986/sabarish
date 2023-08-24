package testngwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class t4 {
	
	@Test
	public void hdy()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		WebDriverWait w=new WebDriverWait(ob,5);
		//w.until(ExpectedConditions.titleIs("Goofgfdgle"));
		//w.until(ExpectedConditions.titleContains("oo"));
		//w.until(ExpectedConditions.alertIsPresent());
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("Img")));
		w.until(ExpectedConditions.elementToBeClickable(By.linkText("Images")));
		ob.close();
	}
}
