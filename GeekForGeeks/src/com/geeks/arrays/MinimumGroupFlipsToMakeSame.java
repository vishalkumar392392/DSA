package com.geeks.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumGroupFlipsToMakeSame {

	public static void main(String[] args) {

		List<List<Integer>> list = new ArrayList<>();
		list.add(Arrays.asList(1, 1, 0, 0, 0, 1));
		list.add(Arrays.asList(1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1));
		list.add(Arrays.asList(1, 1));
		list.add(Arrays.asList(0, 1));
		list.add(Arrays.asList(0, 0, 1, 1));
		list.add(Arrays.asList(1, 1, 0, 0));
		list.add(Arrays.asList(1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1));
		list.add(Arrays.asList(0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0));

		for (int i = 0; i < list.size(); i++) {
			bruteForce(list.get(i).stream().toArray(Integer[]::new));
			System.out.println("----------------------------------");
		}

	}

	private static void bruteForce(Integer[] arr) {
		int n = arr.length;
		int countOfZeros = 0;
		int countOfOnes = 0;
		int prev = arr[0];

		// in the for loop we are counting the no. groups of 0's and 1
		for (int i = 1; i < n; i++) {

			if (prev == 1 && prev != arr[i]) {
				countOfOnes++;
			}
			if (prev == 0 && prev != arr[i]) {
				countOfZeros++;
			}
			prev = arr[i];

		}
		if (arr[n - 1] == 1) {
			countOfOnes++;
		} else {
			countOfZeros++;
		}
		// counting is ended..

		// if given all elements in array are either 0's or 1's we return simply
		if ((countOfZeros == 0 && countOfOnes == 1) || (countOfZeros == 1 && countOfOnes == 0)) {
			return;
		}
		// Below we decide which group (0's or 1's) is minimum
		int num = countOfZeros > countOfOnes ? 1 : 0;

		for (int i = 0; i < n; i++) {

			// below if block is to handle cases like
			// {0,1},{0,0,1,1},{0,0,0,1,1,1}{1,1,0,0},
			if (countOfZeros == countOfOnes) {
				if (i == 0) {
					System.out.print("From " + i);
				}
				if (i + 1 < n && arr[i + 1] != arr[i]) {
					System.out.println(" to " + i);
					return;

				}
			} else if (arr[i] == num) {
				if ((i - 1) >= 0 && arr[i - 1] != num) {
					System.out.print("From " + i);
				}
				if ((i + 1) < n && arr[i + 1] != num) {
					System.out.println(" to " + i);
				}
			}
		}

	}

}
