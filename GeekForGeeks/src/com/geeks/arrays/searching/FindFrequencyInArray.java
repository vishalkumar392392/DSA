package com.geeks.arrays.searching;

public class FindFrequencyInArray {

	public static void main(String[] args) {

		int arr[] = { 8, 10, 10, 4, 2, 2, 6, 2, 2, 10, 8, 3, 2, 10, 2, 4 };
		System.out.println(bruteForce(arr, 10));
		System.out.println(usingRangeTechnique(arr, 10));

	}
	
	static int bruteForce(int arr[], int k) {
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == k) {
				count++;
			}
		}
		
		return count;
	}
	
	static int usingRangeTechnique(int arr[], int k) {
		
		int count[] = new int[arr.length];
		
		for(int i =0;i<arr.length; i++) {
			
			count[arr[i]]++;
		}
		
		return count[k];
	}

}
