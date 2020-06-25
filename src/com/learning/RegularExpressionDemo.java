package com.learning;

import java.util.regex.Pattern;

/*
 * Regular Expression split()
 */
public class RegularExpressionDemo {

	private static final String TARGET_STRING = "www.chinmay.bhat.com";
	private static final String MATCHER_DOT = "[.]";

	public static void main(String[] args) {

		printTestCase("Given string " + TARGET_STRING + " split using space");
		checkPatternInTargetString(MATCHER_DOT, TARGET_STRING);

	}

	private static void printTestCase(String message) {
		System.out.println("***** " + message + " *****");
	}

	private static void checkPatternInTargetString(String regx, String targetString) {

		Pattern pattern = Pattern.compile(regx);
		String[] tokens = pattern.split(targetString);

		for (String token : tokens) {
			System.out.println(token);
		}

		System.out.println();
	}

}
