package com.strings;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {

		String st = "smartinterviews";

		int[] countArray = new int[26];

		for (int i = 0; i < st.length(); i++) {
			countArray[(st.charAt(i) - 'a')]++;
			if (countArray[(st.charAt(i) - 'a')] > 1) {
				System.out.println(st.charAt(i) + " : ->" + countArray[(st.charAt(i) - 'a')]);
				break;
			}
		}
	}

}
