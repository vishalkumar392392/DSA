package com.geeks.arrays;

public class MaximumAppearingElement {

	public static void main(String[] args) {

		int left[] = { 1, 2, 5, 15 };
		int right[] = { 5, 8, 7, 18 };
		System.out.println(maxRepeatingElementInRange(left, right));
		System.out.println(authorsApproach(left, right));

	}

	// Brute Force
	static int maxRepeatingElementInRange(int left[], int right[]) {
		int n = left.length;
		int freq[] = new int[101];

		for (int i = 0; i < n; i++) {
			for (int j = left[i]; j <= right[i]; j++) {
				freq[j] = freq[j] + 1;
			}
		}
		int max = 0;
		for (int i = 1; i < 100; i++) {
			if (freq[i] > freq[max]) {
				max = i;
			}
		}

		return max;
	}

	// Author Solution
	static int authorsApproach(int left[], int right[]) {
		int n = left.length;
		int freq[] = new int[101];
		for (int i = 0; i < n; i++) {
			freq[left[i]]++;
			freq[right[i] + 1]--;
		}
	
		
		for (int i = 1; i < 100; i++) {
			freq[i] = freq[i - 1] + freq[i];
		}
		
		int max = 0;
		for (int i = 1; i < 100; i++) {
			if (freq[i] > freq[max]) {
				max = i;
			}
		}
		return max;
	}

}
