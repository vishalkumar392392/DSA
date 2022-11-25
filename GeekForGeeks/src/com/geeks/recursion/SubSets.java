package com.geeks.recursion;

public class SubSets {

	public static void main(String[] args) {
		subSets("hetvi", "", 0);
		System.out.println("==========================================");
		subSetsApproach("hetvi", "", "hetvi".length());
		
	}

	public static void subSets(String s, String curr, int i) {

		if (i == s.length()) {
			System.out.println(curr);
			return;
		}

		subSets(s, curr, i + 1);
		subSets(s, curr + s.charAt(i), i + 1);

	}

	public static void subSetsApproach(String s, String curr, int i) {

		if (i <= 0) {
			System.out.println(curr);
			return;
		}

		subSetsApproach(s, curr, i - 1);
		subSetsApproach(s, s.charAt(i - 1) + curr, i - 1);

	}

	

}
