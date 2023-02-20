package Listener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import driverFactory.driverfactory;
import util.screenshotutils;

public class testngListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestStart");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSuccess");
	}

	public void onTestFailure(ITestResult result) {
		
	//	try {
		//	screenshotutils.takescreenshot(driverfactory.getdriver(),result.getMethod().getMethodName());
//		} catch (IOException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
	//	}
		System.out.println("onTestFailure");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSkipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedWithTimeout");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onStart");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onFinish");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

	
	
	
}
