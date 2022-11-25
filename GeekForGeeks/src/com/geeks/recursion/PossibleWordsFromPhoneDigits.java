package com.geeks.recursion;

import java.util.ArrayList;

public class PossibleWordsFromPhoneDigits {
	
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4 };
		test(arr, 3);
	}
	
	
	public static void test(int a[], int N) {

		ArrayList<String> arr = new ArrayList<>();
		ArrayList<String> res = new ArrayList<>();

		arr.add("");
		arr.add("");
		arr.add("abc");
		arr.add("def");
		arr.add("ghi");
		arr.add("jkl");
		arr.add("mno");
		arr.add("pqrs");
		arr.add("tuv");
		arr.add("wxyz");
		arr.add("");
		

		for (int i = 0; i < arr.get(a[0]).length(); i++) {
			for (int j = 0; j < arr.get(a[1]).length(); j++) {
				for (int k = 0; k < arr.get(a[2]).length(); k++) {
					System.out.println(
							arr.get(a[0]).charAt(i) + "" + arr.get(a[1]).charAt(j) + "" + arr.get(a[2]).charAt(k));
					res.add(
							arr.get(a[0]).charAt(i) + "" + arr.get(a[1]).charAt(j) + "" + arr.get(a[2]).charAt(k));
				}
			}
		}

	}

}
