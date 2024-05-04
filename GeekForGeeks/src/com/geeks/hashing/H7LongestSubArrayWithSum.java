package com.geeks.hashing;

import java.util.HashMap;
import java.util.Map;

public class H7LongestSubArrayWithSum {

	public static void main(String[] args) {

		int arr[] = { 8, 3, 1, 5, -6, 6, 2, 2 };

		int length = efficient(arr, 4);
		System.out.println(length);
	}

	public static int efficient(int[] arr, int sum) {

		Map<Integer, Integer> m = new HashMap<>();
		int prefixSum = 0;
		int maxLength = 0;
		for (int i = 0; i < arr.length; i++) {

			prefixSum = prefixSum + arr[i];

			if (prefixSum == sum) {
				maxLength = i +1;
			}
			if(!m.containsKey(prefixSum)) {
				m.put(prefixSum, i);
			}
			if (m.containsKey(prefixSum - sum)) {
				int length = i - m.get(prefixSum - sum);
				maxLength = Math.max(maxLength, length);
			}


		}

		return maxLength;
	}

}
