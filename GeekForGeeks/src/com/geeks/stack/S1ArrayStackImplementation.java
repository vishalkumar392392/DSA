package com.geeks.stack;

public class S1ArrayStackImplementation {

	int arr[];

	int c;

	int top;

	public S1ArrayStackImplementation(int n) {
		this.c = n;
		arr = new int[n];
		top = -1;
	}

	void push(int item) {
		top++;
		arr[top] = item;
	}

	int pop() {
		int res = arr[top];
		top--;
		return res;
	}

	int size() {
		return top + 1;
	}

	boolean isEmpty() {
		return top == 1;
	}
}
