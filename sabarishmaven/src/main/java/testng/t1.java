package testng;

import org.testng.annotations.Test;

public class t1 {
	
	
	@Test(priority=0,description="one",groups="G",invocationCount=5,enabled=false)
	public void m1()
	{
	  System.out.println("Test case 1");	
	}

	@Test(priority=1,description="two",groups="G")
	public void m2()
	{
		System.out.println("Test case 2");
		
	}
	
	@Test(priority=2,description="three",groups="S")
	public void ab()
	{
		System.out.println("Test case 3");
	}
	
	

	}

