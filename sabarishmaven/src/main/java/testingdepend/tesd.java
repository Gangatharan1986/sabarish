package testingdepend;

import org.testng.annotations.Test;

public class tesd{

	@Test(priority=0)
	public void visiting()
	{
		System.out.println("visiting");
	}
	
	@Test(priority=1,dependsOnMethods="visiting")
	public void lg()
	{
		System.out.println("login");
	}
}
