package com.learning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Regular expressions
 * 
 */
public class RegularExpressionDemo {

	private static final String TARGET_STRING = "a7b k@Z9";

	private static final String SPACE = "\\s";
	private static final String EXCEPT_SPACE = "\\S";
	private static final String DIGIT = "\\d";
	private static final String EXCEPT_DIGIT = "\\D";
	private static final String ALPHA_NUMERIC = "\\w";
	private static final String EXCEPT_ALPHA_NUMERIC = "\\W";
	private static final String ANY_CHARACTER = ".";

	public static void main(String[] args) {

		printTestCase("Space in given string " + TARGET_STRING);
		checkPatternInTargetString(SPACE, TARGET_STRING);

		printTestCase("Characters other than space in given string " + TARGET_STRING);
		checkPatternInTargetString(EXCEPT_SPACE, TARGET_STRING);

		printTestCase("Digits in given string " + TARGET_STRING);
		checkPatternInTargetString(DIGIT, TARGET_STRING);

		printTestCase("Characters other than digits in given string " + TARGET_STRING);
		checkPatternInTargetString(EXCEPT_DIGIT, TARGET_STRING);

		printTestCase("Alpha numeric character in given string " + TARGET_STRING);
		checkPatternInTargetString(ALPHA_NUMERIC, TARGET_STRING);

		printTestCase("Characters other than alpha numeric in given string " + TARGET_STRING);
		checkPatternInTargetString(EXCEPT_ALPHA_NUMERIC, TARGET_STRING);

		printTestCase("Any character given string " + TARGET_STRING);
		checkPatternInTargetString(ANY_CHARACTER, TARGET_STRING);
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
