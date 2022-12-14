package com.array.problem;

import java.util.Arrays;
import java.util.Scanner;

public class CountTheFrequecnyOfRepeatedElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		int qSize = sc.nextInt();

		for (int i = 0; i < qSize; i++) {
			int q = sc.nextInt();
			int bs1 = bs1(arr, q);
			int bs2 = bs2(arr, q);
			if (bs1 == -1 || bs2 == -1) {
				System.out.println(0);
			} else {
				System.out.println(bs1 - bs2 + 1);
			}
		}

		sc.close();

	}

	public static int bs1(int arr[], int q) {

		int ans = -1;
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == q) {
				ans = mid;
				low = mid + 1;
			} else if (arr[mid] < q) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return ans;
	}

	public static int bs2(int arr[], int q) {

		int ans = -1;
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == q) {
				ans = mid;
				high = mid - 1;
			} else if (arr[mid] < q) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return ans;
	}

}
