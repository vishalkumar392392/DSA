package com.geeks.stack;

import java.util.Stack;

public class S5StockSpanProblem {

	public static void main(String[] args) {

		int arr[] = { 13, 15, 12, 14, 16, 8, 6, 4, 10, 30 };
		naiveMethod(arr);
		efficient(arr);
	}

	public static void naiveMethod(int a[]) {

		int temp[] = new int[a.length];
		for (int i = a.length - 1; i >= 0; i--) {
			int span = 1;
			for (int j = i - 1; j >= 0; j--) {
				if (a[i] > a[j]) {
					span++;
				} else {
					break;
				}
			}
			temp[i] = span;
		}

		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
	}

	public static void efficient(int a[]) {

		System.out.println();

		Stack<Integer> s = new Stack<>();
		s.push(0);
		System.out.print(1 + " ");

		for (int i = 1; i < a.length; i++) {

			while (!s.isEmpty() && a[s.peek()] < a[i]) {
				s.pop();
			}

			int res = s.isEmpty() ? i + 1 : i - s.peek();
			System.out.print(res + " ");
			s.push(i);
		}

	}

}
