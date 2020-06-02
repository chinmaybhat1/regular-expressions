package com.learning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) {
		// Character sequence in which a pattern needs to be searched
		final String targetString = "ababbaba";
		// Pattern that needs to be searched
		final String PATTERN = "ab";
		// Number of occurrences of a pattern in target string 
		int matchCount = 0;

		// Converts a pattern into a Java object representation
		Pattern pattern = Pattern.compile(PATTERN);
		// Converts a target string into a Java object representation
		Matcher matcher = pattern.matcher(targetString);

		// Checks whether a pattern is present in a target string
		while (matcher.find()) {
			matchCount++;
			System.out.println("Match found at start index " + matcher.start() // Returns the start index of a target string matching given pattern
				+ ", end index " + matcher.end() // Returns the end index + 1 of a target string matching given pattern
					+ " for pattern " + matcher.group() // Returns the matched sequence captured by the previous match as the string.
			);
		}

		System.out.println(PATTERN + " found " + matchCount + " times in " + targetString);
	}

}
