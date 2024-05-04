package com.geeks.hashing;

import java.util.HashMap;
import java.util.Map;

public class H1FrequencyOfElements {

	public static void main(String[] args) {

		int arr[] = { 50, 50, 10, 40, 10 };
//		naiveMethod(arr);
		frequencyOfElements(arr);

	}

	public static void naiveMethod(int arr[]) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;

				}
			}

			if (count >= 2) {
				System.out.println(arr[i] + ", " + count);
			}
		}

	}

	public static void frequencyOfElements(int arr[]) {

		int n = arr.length;

		Map<Integer, Integer> m = new HashMap<>();

		for (int i = 0; i < n; i++) {
			m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entrySet : m.entrySet()) {
			int value = entrySet.getValue();
			if (value > 1) {
				System.out.println(entrySet.getKey() + ", " + value);
			}
		}
	}

}
