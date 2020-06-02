package com.learning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Common regular patterns and their meaning
 * [abc] : Either a or b or c
 * [^abc] : Except a or b or c
 * [a-z] : Any lower case alphabets
 * [A-Z] : Any upper case alphabets
 * [0-9] : Any number
 * [a-zA-Z] : Any alphabet
 * [a-zA-Z0-9] : Any alpha numeric characters
 * [^a-zA-Z0-9] : Only special characters
 */
public class RegularExpressionDemo {

	private static final String TARGET_STRING = "a7b@Z#9";

	private static final String SPECIFIC_ALPHABETS = "[abc]";
	private static final String EXCEPT_SPECIFIC_ALPHABETS = "[^abc]";
	private static final String LOWERCASE_ALPHABETS = "[a-z]";
	private static final String UPPERCASE_ALPHABETS = "[A-Z]";
	private static final String ALPHABETS = "[a-zA-Z]";
	private static final String NUMBERS = "[0-9]";
	private static final String ALPHA_NUMERIC = "[a-zA-Z0-9]";
	private static final String SPECIAL_CHARACTERS = "[^a-zA-Z0-9]";

	public static void main(String[] args) {
		
		printTestCase("Check for either a or b or c in given string " + TARGET_STRING);
		checkPatternInTargetString(SPECIFIC_ALPHABETS, TARGET_STRING);

		printTestCase("Check for characters other than a or b or c in given string " + TARGET_STRING);
		checkPatternInTargetString(EXCEPT_SPECIFIC_ALPHABETS, TARGET_STRING);

		printTestCase("Check for lower case alphabets in given string " + TARGET_STRING);
		checkPatternInTargetString(LOWERCASE_ALPHABETS, TARGET_STRING);

		printTestCase("Check for upper case alphabets in given string " + TARGET_STRING);
		checkPatternInTargetString(UPPERCASE_ALPHABETS, TARGET_STRING);

		printTestCase("Check for alphabets in given string " + TARGET_STRING);
		checkPatternInTargetString(ALPHABETS, TARGET_STRING);

		printTestCase("Check for numbers in given string " + TARGET_STRING);
		checkPatternInTargetString(NUMBERS, TARGET_STRING);

		printTestCase("Check for alpha numeric characters in given string " + TARGET_STRING);
		checkPatternInTargetString(ALPHA_NUMERIC, TARGET_STRING);

		printTestCase("Check for special characters in given string " + TARGET_STRING);
		checkPatternInTargetString(SPECIAL_CHARACTERS, TARGET_STRING);
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
