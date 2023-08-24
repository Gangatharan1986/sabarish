package testingdepend;

import org.testng.annotations.Test;

public class d2 {
	
	@Test(priority=0,groups="Y")
	public void l1()
	{
		System.out.println("T1");
	}
	
	@Test(priority=1,groups="Y")
	public void l2()
	{
		System.out.println("T2");
	}
	
	@Test(priority=2,dependsOnGroups="Y")
	public void h1()
	{
		System.out.println("T3");
	}

}
