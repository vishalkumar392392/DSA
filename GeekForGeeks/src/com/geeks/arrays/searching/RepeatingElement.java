package com.geeks.arrays.searching;

public class RepeatingElement {
	public static void main(String[] args) {

		int arr[] = { 5, 2, 1, 3, 2, 2 };
//		System.out.println(repeatingElement(arr));
		System.out.println(efficent(arr));


	}

//	TC -> 0(N), SC -> 0(N)
	public static int repeatingElement(int arr[]) {
		boolean tempArr[] = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (tempArr[arr[i]])
				return arr[i];
			else {
				tempArr[arr[i]] = true;
			}
		}

		return 0;

	}

	public static int efficent(int arr[]) {
		int slow=arr[0],fast=arr[0];
		do {
			slow = arr[slow];
			fast = arr[arr[fast]];
		}while(slow!=fast);
		
		slow = arr[0];
		
		while(slow!=fast) {
			slow=arr[slow];
			fast=arr[fast];
		}
		return slow;
			
	}

}
