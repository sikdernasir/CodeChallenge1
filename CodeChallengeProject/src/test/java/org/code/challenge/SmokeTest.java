package org.code.challenge;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SmokeTest extends Base {
	String sentence = "This cow jumped over the moon";
	Utility util;
	Logger log = Logger.getLogger(SmokeTest.class);

	@Test
	public void codeChallenge() {
		util = new Utility();
		log.info("utility class instantiated");
		Reporter.log("utility class instantiated");
		String result = util.getHighestWordAndLength(sentence);
		log.info("invoked getHighestWordAndLength method");
		Reporter.log("invoked getHighestWordAndLength method");
		log.info(result);
		Reporter.log(result);

	}

}
