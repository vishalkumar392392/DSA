package com.geeks.recursion;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverse("VEMA"));
	}

	public static String reverse(String name) {

		if (name.length() == 0) {
			return "";
		}
		System.out.print(name.charAt(name.length() - 1));

		return reverse(name.substring(0, name.length() - 1));
	}

}
