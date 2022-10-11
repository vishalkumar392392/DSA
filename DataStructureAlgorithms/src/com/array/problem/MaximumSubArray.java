package com.array.problem;

import java.util.Scanner;

public class MaximumSubArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = { 8, 12, 20, -4, -6, 3 };
		int ans = 0;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum = sum + arr[i];
				ans = Math.max(ans, sum);
			}
		}

		System.out.println(ans);
		sc.close();
	}

}
