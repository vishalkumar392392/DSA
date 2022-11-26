package com.geeks.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = { 10, 40, 50, 60, 70, 90 };
//		int arr[] = { 30,20,5};

		int[] reverseArray = reverseArray(arr);

		for (int i = 0; i < reverseArray.length; i++) {
			System.out.print(reverseArray[i] + " ");
		}
	}

	//TC -> O(N/2)
	public static int[] reverseArray(int arr[]) {

		int p1 = 0;
		int p2 = arr.length - 1;

		while (p1 < p2) {
			int temp = arr[p2];
			arr[p2] = arr[p1];
			arr[p1] = temp;
			p1++;
			p2--;
		}
		return arr;
	}
}
