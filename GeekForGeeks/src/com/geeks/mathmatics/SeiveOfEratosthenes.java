package com.geeks.mathmatics;

// printing the prime number in a range number.
public class SeiveOfEratosthenes {

	public static void main(String[] args) {

		seive(125);
	}

	// TC -> O(nloglogn)
	public static void seive(int n) {

		int[] arr = new int[n + 1];

		for (int i = 2; i * i <= n; i++) {

			if (isPrime(i)) {

				for (int j = i * i; j <= n; j = j + i) {
					arr[j] = 1;
				}
			}

		}

		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static boolean isPrime(int n) {

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}

		return true;
	}

}
