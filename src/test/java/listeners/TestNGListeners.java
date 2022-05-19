package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener{
	@Override
	public void onTestStart(ITestResult res)
	{
	System.out.println("************* Started test case is "+ res.getName());
	}
	@Override
	public void onStart(ITestContext res)
	{
	}
	@Override
	public void onFinish(ITestContext res)
	{
		System.out.println("************* Completed "+ res.getName());
	}
	// Run when the test case passed successfully
	@Override
	public void onTestSuccess(ITestResult res)
	{
	System.out.println("*****************Test case passed is "+res.getName());
	}
	// Run when the test case fails
	@Override
	public void onTestFailure(ITestResult res)
	{
	System.out.println("******************Test case failed is "+res.getName());
	}
	// Run when test case pass with some failures
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult res)
	{
	System.out.println("************Test case passed with failure is "+res.getName());
	}
	// Run when the test case is skipped
	@Override
	public void onTestSkipped(ITestResult res)
	{
	System.out.println("**********Test case skipped is :"+res.getName());
	}
}
