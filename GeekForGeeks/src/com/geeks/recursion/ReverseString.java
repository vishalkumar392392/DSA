package com.geeks.recursion;

public class ReverseString {

	public static void main(String[] args) {
		reverse("GAYATHRI");

	}

	public static void reverse(String name) {

		if (name.length() == 0) {
			return;
		}
		System.out.print(name.charAt(name.length() - 1));

		reverse(name.substring(0, name.length() - 1));
	}

}
