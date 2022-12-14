package com.geeks.arrays;

public class StockBuyAndSell {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 3, 8, 12 };
		int arr1[] = { 1, 5, 3, 1, 2, 8 };
		int arr2[] = {10,20,30};
		int arr3[] = {30,20,10};

		System.out.println(stockBuySell(arr3));

	}

	static int stockBuySell(int arr[]) {

		int sum = 0;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > arr[i - 1]) {
				sum = sum + (arr[i] - arr[i - 1]);
			}
		}

		return sum;

	}

}
