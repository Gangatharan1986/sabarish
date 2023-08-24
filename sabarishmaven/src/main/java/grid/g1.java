package grid;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TokenizedGenericType.Malformed;
public class g1 {
	
	
		WebDriver ob;
		@Test(priority=0)
		public void setup()throws Malformed URL Exception
		{
			
			String nodeurl="http://192.168.29.63:14100/wd/hub";
			DesiredCapabilities c= DesiredCapabilities.chrome();
					c.setBrowserName("chrome");
			c.setPlatform(Platform.WINDOWS);
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
			ob= newRemoteWebDriver(new URL(nodeurl),c);
			ob.get("http://www.mycontactform.com");
		}
		
		@Test(priority=1)
		public void login() throws InterruptedException
		{
	ob.findElement(By.id("user")).sendKeys("Dhivyakarthi123");
	ob.findElement(By.id("pass")).sendKeys("12345");
		ob.findElement(By.className("btn_log")).click();
		Thread.sleep(3000);
	}}

	
