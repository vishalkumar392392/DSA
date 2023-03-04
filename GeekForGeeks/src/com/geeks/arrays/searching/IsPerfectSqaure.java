package com.geeks.arrays.searching;

public class IsPerfectSqaure {

	public static void main(String[] args) {

		System.out.println(squareRoot(36));
		System.out.println(nearSquareRoot(14));

	}

	static boolean squareRoot(int num) {

		int low = 1;
		int high = num;

		while (low <= high) {

			int mid = (low + high) / 2;

			if ((mid * mid) == num)
				return true;

			if ((mid * mid) > num) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return false;
	}
	
	static int nearSquareRoot(int num) {

		int low = 1;
		int high = num;
		int res = -1;

		while (low <= high) {

			int mid = (low + high) / 2;

			if ((mid * mid) == num)
				return mid;

			if ((mid * mid) > num) {
				high = mid - 1;
			} else {
				low = mid + 1;
				res = mid;
			}
			
		}

		return res;
	}


}
