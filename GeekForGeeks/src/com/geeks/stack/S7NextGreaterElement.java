package com.geeks.stack;

import java.util.Stack;

public class S7NextGreaterElement {

	public static void main(String[] args) {

		int a[] = { 5, 15, 10, 8, 6, 12, 9, 18 };

		efficient(a);
	}

	private static void efficient(int[] a) {

		Stack<Integer> s = new Stack<>();
		int temp[] = new int[a.length];
		s.push(a.length - 1);
		temp[a.length - 1] = -1;
		for (int i = a.length-2; i >= 0; i--) {

			while (!s.isEmpty() && a[s.peek()] < a[i]) {
				s.pop();
			}

			if (s.isEmpty()) {
				temp[i] = -1;
			} else {
				temp[i] = a[s.peek()];
			}
			s.push(i);
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(temp[i] +" ");
		}

	}

}
