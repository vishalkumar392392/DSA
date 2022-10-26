package com.strings;

public class ShortestSubStringInA {

	static int ans = Integer.MAX_VALUE;

	public static void main(String[] args) {

		String a = "axyybxyaabyyxayyybb";
		String b = "yxbbx";

		int countB[] = new int[26];

		for (int i = 0; i < b.length(); i++) {
			countB[b.charAt(i) - 'a']++;
		}

		for (int i = 0; i < a.length(); i++) {
			String c = "" + a.charAt(i);
			for (int j = i + 1; j < a.length(); j++) {
				c = c + a.charAt(j);
				isValid(countB, c);
			}
		}

		System.out.println(ans);
	}

	public static boolean isValid(int countB[], String c) {

		int countA[] = new int[26];
		for (int i = 0; i < c.length(); i++) {
			countA[c.charAt(i) - 'a']++;
		}
		for (int i = 0; i < 26; i++) {
			if (!(countA[i] >= countB[i])) {
				return false;
			}
		}
		ans = Math.min(ans, c.length());

		return false;
	}

}
