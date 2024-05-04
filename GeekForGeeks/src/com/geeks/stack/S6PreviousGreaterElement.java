package com.geeks.stack;

import java.util.Stack;

public class S6PreviousGreaterElement {

	public static void main(String[] args) {
		int a[] = { 15, 10, 18, 12, 4, 6, 2, 8 };
		efficient(a);

	}

	public static void efficient(int a[]) {

		int n = a.length;

		Stack<Integer> s = new Stack<>();
		s.push(0);
		System.out.print(-1 + " ");

		for (int i = 1; i < n; i++) {

			while (!s.isEmpty() && a[s.peek()] <= a[i]) {
				s.pop();
			}
			int res = s.isEmpty() ? -1 : a[s.peek()];
			System.out.print(res + " ");
			s.push(i);
		}
	}

}
