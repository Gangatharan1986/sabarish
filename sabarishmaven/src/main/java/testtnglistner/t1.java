package testtnglistner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class t1 implements ITestListener{

	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Success");
		
	}

	public void onTestFailure(ITestResult result)
	{
		System.out.println("Failed");
	}

	public void onStart(ITestContext context)
	{
		System.out.println("Started");
	}

	public void onFinish(ITestContext context) 
	{
		System.out.println("Finished");
	}

}
