package com.geeks.stack;

import java.util.Stack;

class GetMinInStack {

	Stack<Integer> ms = new Stack<>();
	Stack<Integer> as = new Stack<>();

	int mainStack[];
	int auxilaryStack[];
	int top = -1;
	int auxtop = -1;

	GetMinInStack(int n) {
		mainStack = new int[n];
		auxilaryStack = new int[n];
	}

	void push(int n) {

		if (top == -1) {
			top++;
			auxtop++;
			mainStack[top] = n;
			auxilaryStack[auxtop] = n;
		} else {
			if (auxilaryStack[auxtop] > n) {
				auxtop++;
				auxilaryStack[auxtop] = n;
			}
			top++;
			mainStack[top] = n;
		}
	}

	int pop() {

		if (mainStack[top] == auxilaryStack[auxtop]) {
			auxtop--;
		}
		int a = mainStack[top];
		top--;
		return a;
	}

	int getMin() {
		return auxilaryStack[auxtop];
	}

}

public class S9GetMinInStack {

	public static void main(String[] args) {

		GetMinInStack obj = new GetMinInStack(8);

		obj.push(20);
		obj.push(10);
		System.out.print(obj.getMin() + " ");
		obj.push(5);
		System.out.print(obj.getMin() + " ");
		obj.pop();
		System.out.print(obj.getMin() + " ");
		obj.pop();
		System.out.print(obj.getMin() + " ");

	}

}
