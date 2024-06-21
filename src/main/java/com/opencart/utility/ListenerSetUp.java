package com.opencart.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.opencart.testbase.Testbase;

public class ListenerSetUp extends Testbase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
	
		logger.info("Test case is started :-"+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test case is completed :-"+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test case is failed :-"+ result.getName());
		Util.CaptureScreeenshot(result.getName());
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test case is skipped :-"+ result.getName());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
