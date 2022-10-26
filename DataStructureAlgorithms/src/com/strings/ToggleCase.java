package com.strings;

public class ToggleCase {

	public static void main(String[] args) {

		String input = "sMaRt";
		String output = "";

		for (int i = 0; i < input.length(); i++) {
			if (Character.isLowerCase(input.charAt(i))) {
				output = output + Character.toUpperCase(input.charAt(i));
			} else {
				output = output + Character.toLowerCase(input.charAt(i));
			}
		}

		System.out.println(output);

	}

}
