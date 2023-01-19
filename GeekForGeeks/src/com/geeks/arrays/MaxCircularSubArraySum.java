package com.geeks.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxCircularSubArraySum {

	public static void main(String[] args) {

		List<List<Integer>> list = new ArrayList<>();
		list.add(Arrays.asList(5, -2, 3, 4));
		list.add(Arrays.asList(2, 3, -4));
		list.add(Arrays.asList(8, -4, 3, -5, 4));
		list.add(Arrays.asList(-3, 4, 6, -2));
		list.add(Arrays.asList(-8, 7, 6));
		list.add(Arrays.asList(3, -4, 5, 6, -8, 7));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(maxCirSubArray(list.get(i).stream().toArray(Integer[]::new)));

		}
		System.out.println("================================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(efficentSolution(list.get(i).stream().toArray(Integer[]::new)));

		}
	}

	// TC -> 0(N^2)
	public static int maxCirSubArray(Integer arr[]) {

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {

			int prev = 0;
			int cycle = 0;
			for (int j = i;; j++) {

				if (cycle == 1 && j == i) {
					break;
				}

				if (j < arr.length) {
					prev = prev + arr[j];
					max = Math.max(max, prev);
				}

				if (j == arr.length) {
					cycle = 1;
					j = -1;
				}
			}
		}

		return max;

	}

	// TC -> 0(3N)
	public static int efficentSolution(Integer arr[]) {

		int max_normal = normalMaxSum(arr);

		if (max_normal < 0) {
			return max_normal;
		}

		int arr_sum = 0;

		for (int i = 0; i < arr.length; i++) {

			arr_sum = arr_sum + arr[i];
			arr[i] = -arr[i];
		}

		int max_circular = arr_sum + normalMaxSum(arr);

		return Math.max(max_normal, max_circular);

	}

	public static int normalMaxSum(Integer arr[]) {

		int max = arr[0];
		int auxArry[] = new int[arr.length];

		auxArry[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			auxArry[i] = Math.max(auxArry[i - 1] + arr[i], arr[i]);
			max = Math.max(max, auxArry[i]);
		}
		return max;
	}
}
