package com.geeks.recursion;

public class PermutationOfString {

	public static void main(String[] args) {
		permutations("ABCD", 0);

	}

	public static void permutations(String s, int i) {

		if (i == s.length()) {
			System.out.println(s);
			return;
		}

		for (int j = i; j < s.length(); j++) {
			s = swap(s, i, j);
			permutations(s, i + 1);
			s = swap(s, i, j);
		}
	}

	public static String swap(String s, int i, int j) {
		char ch[] = s.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;

		return new String(ch);
	}

}
