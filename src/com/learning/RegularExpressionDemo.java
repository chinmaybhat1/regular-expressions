package com.learning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Quantifiers: Used to specify number of occurrence of a match
 * 
 * a  - Exactly one a
 * a+ - At least one a
 * a* - At least one or multiple occurrence of a
 * a? - Exactly one or multiple occurrence of a 
 */
public class RegularExpressionDemo {

	private static final String TARGET_STRING = "abaabbaaabbb";

	private static final String EXACT_MATCHER = "a";
	private static final String MATCHER_PLUS = "a+";
	private static final String MATCHER_ASTRISK = "a*";
	private static final String MATCHER_QUESTION_MARK = "a?";

	public static void main(String[] args) {

		printTestCase("Exactly one match in given string " + TARGET_STRING);
		checkPatternInTargetString(EXACT_MATCHER, TARGET_STRING);

		printTestCase("At least one match in given string " + TARGET_STRING);
		checkPatternInTargetString(MATCHER_PLUS, TARGET_STRING);

		printTestCase("At least one or multiple occurrence in given string " + TARGET_STRING);
		checkPatternInTargetString(MATCHER_ASTRISK, TARGET_STRING);

		printTestCase("Exactly one or multiple occurrence in given string " + TARGET_STRING);
		checkPatternInTargetString(MATCHER_QUESTION_MARK, TARGET_STRING);

	}

	private static void printTestCase(String message) {
		System.out.println("***** " + message + " *****");
	}

	private static void checkPatternInTargetString(String regx, String targetString) {

		Pattern pattern = Pattern.compile(regx);
		Matcher matcher = pattern.matcher(targetString);

		while (matcher.find()) {
			System.out.println(matcher.group() + " found at " + matcher.start());
		}

		System.out.println();
	}

}
