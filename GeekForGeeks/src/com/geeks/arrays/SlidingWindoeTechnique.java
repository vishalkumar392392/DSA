package com.geeks.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindoeTechnique {

	public static void main(String[] args) {

		List<List<Integer>> list = new ArrayList<>();
//		list.add(Arrays.asList(1, 8, 30, -5, 20, 7));
		list.add(Arrays.asList(5, -10, 6, 90, 3));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(bruteForce(list.get(i).stream().toArray(Integer[]::new), 2));
			System.out.println("----------------------------------");
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(approach(list.get(i).stream().toArray(Integer[]::new), 2));
		}
	}

	// TC -> 0(N*K)
	private static int bruteForce(Integer[] array, int k) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {

			int sum = 0;
			for (int j = i; j < i + k && (i + k) < array.length; j++) {
				sum = sum + array[j];
			}
			max = Math.max(max, sum);

		}
		return max;
	}

	// My approach
	// TC -> O(N)
	private static int approach(Integer[] array, int k) {
		int res = 0;
		int curr = 0;
		int n = array.length;
		for (int i = 0; i < n; i++) {
			curr = curr + array[i];
			if (i >= k - 1) {
				res = Math.max(curr, res);
				curr = curr - array[i - (k - 1)];
			}
		}
		return res;
	}

	// Author approach
	// TC -> O(N)
	static int maxSum(int arr[], int n, int k) {
		int curr_sum = 0;

		for (int i = 0; i < k; i++)
			curr_sum += arr[i];

		int max_sum = curr_sum;

		for (int i = k; i < n; i++) {
			curr_sum = curr_sum + (arr[i] - arr[i - k]);

			max_sum = Math.max(max_sum, curr_sum);
		}

		return max_sum;
	}

}
