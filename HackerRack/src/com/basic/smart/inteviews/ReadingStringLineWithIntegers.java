package com.basic.smart.inteviews;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// reading a string via buffered reader
public class ReadingStringLineWithIntegers {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(bi.readLine());
		String arr[];
		long sum = 0;
		for (int i = 0; i < size; i++) {
			int arraySize = sc.nextInt();
			arr = new String[arraySize];
			sum = 0;
			arr = bi.readLine().split(" ");
			for (int j = 0; j < arraySize; j++) {
				sum = sum + Long.parseLong(arr[j]);
			}
			System.out.println(sum);
		}
		sc.close();

	}

}
