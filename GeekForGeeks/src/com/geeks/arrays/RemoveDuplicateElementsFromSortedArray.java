package com.geeks.arrays;

public class RemoveDuplicateElementsFromSortedArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 20, 20, 30, 30, 30, 30, 30, 30, 30, 30 };
//		int arr[] = { 10, 10,10};

		removeDuplicates(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int arr1[] = { 10, 20, 20, 20, 20, 30, 30, 30, 30 };
		removeDupTempArrayMethod(arr1);
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		int arr2[] = { 10, 20, 20, 20, 20, 30, 30, 30, 30 };
		arr2 = removeDupMethod3(arr2);
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}

	public static int[] removeDuplicates(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != 0 && arr[i - 1] == arr[i]) {
				delete(arr, i);
				i = i - 2;
			}
		}

		return arr;
	}

	// TC -> O(N)
	// SC -> O(N)
	public static int[] removeDupTempArrayMethod(int arr[]) {
		int temp[] = new int[arr.length];
		int res = 1;
		temp[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (temp[res - 1] != arr[i]) {
				temp[res] = arr[i];
				res++;

			}
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = temp[i];
		}

		return arr;
	}
	// TC -> O(N)
	// SC -> O(1)
	public static int[] removeDupMethod3(int arr[]) {
		int res = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[res - 1]) {
				arr[res] = arr[i];
				res++;
			}
		}
		for(int i = res; i<arr.length; i++) {
			arr[i] = 0;
		}
		return arr;
	}

	static void delete(int arr[], int indexDup) {
		int i = 0;
		for (i = indexDup; i < arr.length && i + 1 < arr.length; i++) {
			arr[i] = arr[i + 1];
		}
		for (int j = i; j < arr.length; j++) {
			arr[j] = 0;
		}

	}

}
