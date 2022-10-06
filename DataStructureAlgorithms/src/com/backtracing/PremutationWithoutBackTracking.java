package com.backtracing;

public class PremutationWithoutBackTracking {

	public static void main(String[] args) {
		String name = "ABC";

		for (int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(i));
			for (int j = i + 1; j < name.length(); j++) {
				System.out.print(name.substring(j, name.length() - 1));
			}
			System.out.println();
		}

	}

}
