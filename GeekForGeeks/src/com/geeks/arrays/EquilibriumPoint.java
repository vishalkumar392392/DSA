package com.geeks.arrays;

public class EquilibriumPoint {

	public static void main(String[] args) {

//		bruteForce();

		int arr[] = { 3, 4, 8, -9, 20, 6 };
		System.out.println(usingPrefix(arr));
	}

	private static void bruteForce() {
		int arr[] = { 4, 2, 2 };
		int check = 0;

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			int tempSum = 0;
			for (int j = i + 1; j < arr.length; j++) {
				tempSum = tempSum + arr[j];
			}

			if (tempSum == sum) {
				check = 1;
				break;
			}

			sum = sum + arr[i];
		}
		if (check == 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	static boolean usingPrefix(int arr[]) {
		int n = arr.length;
		int ls = 0;
		int rs = 0;
		for (int i = 0; i < n; i++) {
			rs = rs + arr[i];
		}
		
		for(int i=0; i<n ; i++) {
			rs = rs - arr[i];
			
			if(rs == ls) {
				return true;
			}
			ls = ls + arr[i];
			
		}

		return false;
	}

}
