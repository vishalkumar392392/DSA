package com.string;

public class SubSequence {

	public static void main(String[] args) {

		boolean isSubSequence = isSubSequence("ABCDE", "DCA");
		System.out.println(isSubSequence);
	}

	private static boolean isSubSequence(String str1, String str2) {
		int j = 0;
		int count = 0;

		for (int i = 0; i < str2.length(); i++) {

			for (; j < str1.length(); j++) {
				if (Character.compare(str2.charAt(i), str1.charAt(j)) == 0) {
					count++;
					break;
				}
			}
		}
		if (count == str2.length()) {
			return true;
		}
		return false;
	}

}
