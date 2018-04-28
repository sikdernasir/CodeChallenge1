package org.code.challenge;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	Logger log = Logger.getLogger(Base.class);

	@BeforeMethod
	public void initialize() {
		DOMConfigurator.configure("log4j.xml");
		log.info("log file initialized");
		Reporter.log("log file initialized");
	}

	@AfterMethod
	public void close(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			log.info(result.getName() + " is passed");
			Reporter.log(result.getName() + " is passed");
		} else if (result.getStatus() == ITestResult.FAILURE) {
			log.info(result.getName() + " is failed");
			Reporter.log(result.getName() + " is failed");

		} else if (result.getStatus() == ITestResult.SKIP) {
			log.info(result.getName() + " is skipped");
			Reporter.log(result.getName() + " is skipped");
		}
		log.info("Method execution ended");
		Reporter.log("Method execution ended");
	}

}
