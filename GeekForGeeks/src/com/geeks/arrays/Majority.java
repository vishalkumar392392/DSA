package com.geeks.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Majority {

	public static void main(String[] args) {

		List<List<Integer>> list = new ArrayList<>();
		list.add(Arrays.asList(8, 3, 4, 8, 8));
		list.add(Arrays.asList(3, 7, 4, 7, 7, 5));
		list.add(Arrays.asList(20, 30, 40, 50, 50, 50, 50));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(bruteForce(list.get(i).stream().toArray(Integer[]::new)));

		}
		System.out.println("================================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(findMajority(list.get(i).stream().toArray(Integer[]::new)));

		}
	}

	public static int bruteForce(Integer arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = 0; j < arr.length; j++) {

				if (i != j) {
					if (arr[i] == arr[j]) {
						count++;
					}
				}
			}

			if (count > (arr.length) / 2) {
				return i;
			}
		}
		return -1;

	}

	// Moor's Alogorithm
	// TC -> O(N)
	public static int findMajority(Integer arr[]) {

		int res = 0;
		int count = 1;
		int n = arr.length;
		for (int i = 1; i < n; i++) {

			if (arr[res] == arr[i]) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				res = i;
				count = 1;
			}
		}

		count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[res] == arr[i]) {
				count++;
			}
		}
		if (count > (n / 2)) {
			return res;
		}
		return -1;
	}

}
