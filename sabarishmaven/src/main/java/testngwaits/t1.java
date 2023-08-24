package testngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class t1 {
	
	@Test
	public void hd()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		ob.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		System.out.println(ob.getTitle());
		System.out.println(ob.getCurrentUrl());
		ob.navigate().refresh();
		//ob.findElementByLinkText("png");
		ob.close();
		}

}
