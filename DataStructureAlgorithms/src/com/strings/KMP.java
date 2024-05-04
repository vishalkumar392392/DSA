package com.strings;

import java.util.ArrayList;
import java.util.List;

public class KMP {

	public static void main(String[] args) {
		String text = "ABABDABACDABABCABAB";
		String pattern = "ABAB";

		List<Integer> indices = search(text, pattern);

		if (indices.isEmpty()) {
			System.out.println("Pattern not found in the text.");
		} else {
			System.out.println("Pattern found at indices: " + indices);
		}
	}

	private static int[] computeLPSArray(String pattern) {
		int[] lps = new int[pattern.length()];
		int len = 0; // Length of the previous longest prefix suffix

		lps[0] = 0; // lps[0] is always 0

		int i = 1;
		while (i < pattern.length()) {
			if (pattern.charAt(i) == pattern.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else {
				if (len != 0) {
					len = lps[len - 1];
				} else {
					lps[i] = 0;
					i++;
				}
			}
		}

		return lps;
	}

	public static List<Integer> search(String text, String pattern) {
		List<Integer> indices = new ArrayList<>();
		int[] lps = computeLPSArray(pattern);

		int i = 0; // Index for text[]
		int j = 0; // Index for pattern[]

		while (i < text.length()) {
			if (pattern.charAt(j) == text.charAt(i)) {
				i++;
				j++;
			}

			if (j == pattern.length()) {
				// Pattern found, add the starting index to the result
				indices.add(i - j);
				j = lps[j - 1];
			} else if (i < text.length() && pattern.charAt(j) != text.charAt(i)) {
				if (j != 0) {
					j = lps[j - 1];
				} else {
					i++;
				}
			}
		}

		return indices;
	}

}
