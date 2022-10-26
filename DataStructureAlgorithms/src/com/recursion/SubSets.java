package com.recursion;

public class SubSets {

	public static void main(String[] args) {
		subSets("hetvi", "", 0);
	}

	public static void subSets(String s, String curr, int i) {

		if (i == s.length()) {
			System.out.println(curr);
			return;
		}

		subSets(s, curr, i + 1);
		subSets(s, curr + s.charAt(i), i + 1);

	}

}
