package com.learning;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

/*
 * Various ways to split a given string
 */
public class RegularExpressionDemo {

	private static final String TARGET_STRING = "25-06-2020";
	private static final String MATCHER_DOT = "-";

	public static void main(String[] args) {

		printTestCase("Given string " + TARGET_STRING + " split by hyphen using Pattern.split()");
		splitByPatternClassSplitMethod(MATCHER_DOT, TARGET_STRING);

		printTestCase("Given string " + TARGET_STRING + " split by hyphen using String.split()");
		splitByStringClassSplitMethod(MATCHER_DOT, TARGET_STRING);

		printTestCase("Given string " + TARGET_STRING + " split by hyphen using StringTokenizer");
		splitByStringTokenizer(MATCHER_DOT, TARGET_STRING);

	}

	private static void printTestCase(String message) {
		System.out.println();
		System.out.println("***** " + message + " *****");
	}

	private static void splitByPatternClassSplitMethod(String regex, String targetString) {

		Pattern pattern = Pattern.compile(regex);
		String[] tokens = pattern.split(targetString);

		for (String token : tokens) {
			System.out.println(token);
		}
	}

	private static void splitByStringClassSplitMethod(String regex, String targetString) {

		String splitString[] = targetString.split(regex);
		for (String token : splitString) {
			System.out.println(token);
		}
	}

	private static void splitByStringTokenizer(String regex, String targetString) {
		// By default the regex for StringTokenizer is \\s
		StringTokenizer tokens = new StringTokenizer(targetString, regex);
		while (tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}
	}

}
