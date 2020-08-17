package testNG;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerExample implements ITestListener
{

	public void onTestStart(ITestResult result) {
		
		System.out.println("New Test Started");
		
	}
	
	
	
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test Successfully Finished");
		
	}
 
	
	
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test Failed");
		
	}
	
	
	
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test Skipped");
		
	}
 
	
	
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("Test Failed but within success percentage");
		
	}
 
	
	
	
	public void onStart(ITestContext context) {
		
		
		System.out.println("This is onStart method");
		
	}
	
	
	
	
	public void onFinish(ITestContext context) {
		
		System.out.println("This is onFinish method");
		System.out.println("This is onFinish method");
	}
}
