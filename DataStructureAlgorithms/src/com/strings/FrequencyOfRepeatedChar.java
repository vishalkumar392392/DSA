package com.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOfRepeatedChar {

	public static void main(String[] args) {

		String input = "smartinterviews";
		bruteForce(input);
		System.out.println("=======================");
		map("smartinterviews");
		System.out.println("=======================");
		countArray("smartinterviews");

	}

	public static void bruteForce(String input) {

		for (int i = 0; i < input.length(); i++) {
			int count = 0;
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(i) == input.charAt(j)) {
					count++;

				}
			}
			System.out.println(input.charAt(i) + ": -> " + count);
		}

	}

	public static void map(String input) {

		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < input.length(); i++) {
			map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0) + 1);
		}

		for (Entry<Character, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + ": -> " + m.getValue());
		}
	}

	public static void countArray(String st) {

		int countArray[] = new int[26];

		for (int i = 0; i < st.length(); i++) {
			countArray[st.charAt(i) - 97]++;
		}

		for (int i = 0; i < st.length(); i++) {
			System.out.println(st.charAt(i) + ": -> " + countArray[st.charAt(i) - 97]);
		}
	}

}
