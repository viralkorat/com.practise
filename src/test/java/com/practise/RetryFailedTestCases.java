package com.practise;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCases implements IRetryAnalyzer {

	 int retryCount = 0;
	 int maxretryCount = 3;

	public boolean retry(ITestResult result) {
		if (retryCount < maxretryCount) {
			System.out.println("Retrying" + result.getName() + "again and the count is " + (retryCount + 1));
			retryCount++;
			return true;
		}
		return false;
	}

}
