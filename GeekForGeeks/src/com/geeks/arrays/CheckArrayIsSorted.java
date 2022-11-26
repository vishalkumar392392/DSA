package com.geeks.arrays;

public class CheckArrayIsSorted {

	public static void main(String[] args) {
		int arr[] = { 100, 20, 100 };
//		int arr[] = { 10, 10, 10 };

		System.out.println(isSorted(arr));
//		System.out.println(twoPointer(arr));
		System.out.println(twoPointer2(arr));

		

	}

	// TC -> O(N)
	public static boolean isSorted(int arr[]) {
		int temp = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] >= temp) {
				temp = arr[i];
			}
			if (arr[i] < temp) {
				return false;
			}

		}
		return true;
	}

	// Only work for when there is no duplicate of elements
	public static boolean twoPointer(int arr[]) {
		int p1 = 0;
		int p2 = arr.length - 1;
		while (p1 < p2) {

			if (arr[p1] < arr[p2]) {
				p1++;
				p2--;
			} else {
				return false;
			}
		}
		return true;
	}
	
	// TC -> 0(N)
		public static boolean twoPointer2(int arr[]) {

			
			int p1 = 0;
			int p2 = 1;
			while (p2 <= arr.length-1) {

				if (arr[p1] <= arr[p2]) {
					p1++;
					p2++;
				} else {
					return false;
				}
			}
			return true;
		}

}
