package org.code.challenge;

import org.apache.log4j.Logger;
import org.testng.Reporter;

public class Utility {
	Logger log = Logger.getLogger(Utility.class);

	public String getHighestWordAndLength(String sentence) {
		log.info("getHighestWordAndLength method started executing");
		String[] words = sentence.split(" ");
		log.info("sentence is splitted properly by word");
		Reporter.log("sentence is splitted properly by word");
		// assigned first index value as longest word
		String longestWord = words[0];
		for (int i = 1; i < words.length; i++) {
			if (words[i].length() > longestWord.length()) {
				longestWord = words[i];
			}
		}
		return "The longest word of the sentence is : " + longestWord + "  --And the length of the word is : "
				+ longestWord.length();
	}

}
