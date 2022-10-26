package com.strings;

public class LongestPalindromicSubString {

	public static void main(String[] args) {

		String st = "axxayyyayyyaaaxyyxaxyyxaay";

		int n = st.length();
		System.out.println(n);
		int ans = 0;

		for (int i = 0; i < n; i++) {
			int p1 = i, p2 = i;

			while (p1 >= 0 && p2 < n && st.charAt(p1) == st.charAt(p2)) {

				ans = Math.max(ans, (p2 - p1 + 1));
				p1--;
				p2++;

			}
		}

		System.out.println(ans);
		ans = 0;

		st = "viissssii";
		System.out.println(st.length());

		for (int i = 0; i < n; i++) {
			int p1 = i, p2 = i + 1;

			while (p1 >= 0 && p2 < n && st.charAt(p1) == st.charAt(p2)) {

				ans = Math.max(ans, (p2 - p1 + 1));
				p1--;
				p2++;

			}
		}

	}

}
