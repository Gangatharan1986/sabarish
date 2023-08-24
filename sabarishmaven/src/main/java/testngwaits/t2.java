package testngwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class t2 {
	
	@Test
	public void hdy()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		WebDriverWait w= new WebDriverWait(ob,5);
		//title
		//w.until(ExpectedConditions.titleIs("Google"));
		//w.until(ExpectedConditions.titleContains("oo"));
		
		//alert is present
		//w.until(ExpectedConditions.alertIsPresent());
		
		//element: visibility
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		
		// more elements
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
		
		//element is clickable
		w.until(ExpectedConditions.elementToBeClickable(By.linkText("Images")));
		ob.close();
	}

}
