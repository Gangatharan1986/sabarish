package annotation;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class a1{
	 	
	@Test
	public void t1()
	{
		System.out.println("Test case 1");
	}
	
	@Test
	public void t2()
	{
		System.out.println("Test case 2");
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("before test");
		
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("after test");
		 
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("before class");
		
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("after class");
		
	}

	
	@BeforeMethod
	public void bm()
	{
		System.out.println("before Method");
		
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("after Method");
		
	}


}
