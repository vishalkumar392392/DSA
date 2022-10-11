package com.array.problem;

import java.util.Scanner;
import java.util.TreeSet;

public class DistinctElementsInWindow {

	public static void main1(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		for (int s = 0; s < size; s++) {

			int arrSize = sc.nextInt();
			int windowSize = sc.nextInt();
			int arr[] = new int[arrSize];

			for (int i = 0; (i < arrSize); i++) {
				arr[i] = sc.nextInt();
			}

			TreeSet<Integer> set = null;

			for (int i = 0; i < arrSize; i++) {

				set = new TreeSet<>();

				for (int j = i; (j < (windowSize + i) && (windowSize + i) <= arrSize); j++) {
					set.add(arr[j]);

				}
				if (set.size() > 0) {
					System.out.print(set.size()+" ");
				}
			}
			System.out.println();


		}

		sc.close();

	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		for (int s = 0; s < size; s++) {

			int arrSize = sc.nextInt();
			int windowSize = sc.nextInt();
			int arr[] = new int[arrSize];

			for (int i = 0; (i < arrSize); i++) {
				arr[i] = sc.nextInt();
			}

			TreeSet<Integer> set = null;

			for (int i = 0; i < arrSize; i++) {

				set = new TreeSet<>();
				
				

				for (int j = i; (j < (windowSize + i) && (windowSize + i) <= arrSize); j++) {
					set.add(arr[j]);

				}
				if (set.size() > 0) {
					System.out.print(set.size()+" ");
				}
			}
			System.out.println();


		}

		sc.close();

	}

}
