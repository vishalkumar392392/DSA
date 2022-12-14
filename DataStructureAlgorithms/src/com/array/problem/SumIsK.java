package com.array.problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class SumIsK {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = { 8, 12, 20, -4, -6, 3 };
		int k = 20;
		withMap(arr, k);
		withTreeSet(arr, k);
		Arrays.sort(arr);
		int p1 = 0;
		int p2 = arr.length - 1;
		while (p1 <= p2) {
			if ((arr[p1] + arr[p2]) == k) {
				System.out.println(true);
				return;
			}
			if ((arr[p1] + arr[p2]) < k) {
				p1++;
			} else if ((arr[p1] + arr[p2]) > k) {
				p2--;
			}

		}

		sc.close();
	}

	public static void withMap(int arr[], int k) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(1, 0) + 1);
		}
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(k - arr[i])) {

				if ((k - arr[i] == arr[i])) {
					if (map.get(arr[i]) > 1) {
						System.out.println(true);
						return;
					}
				}
				System.out.println(true);
				return;
			}

		}

	}

	public static void withTreeSet(int arr[], int k) {
		TreeSet<Integer> set = new TreeSet<>();

		for (int i = 0; i < arr.length; i++) {

			if (set.contains(k - arr[i])) {
				System.out.println(true);
				return;
			}

			set.add(arr[i]);

		}
	}

}
