import org.testng.annotations.Test;

public class time {
	
	public class t1 {
		
		
		@Test(timeOut=3000)
		public void m1() throws InterruptedException
		{
	      Thread.sleep(2000);
		  System.out.println("Test case 1");	
		}

}
}