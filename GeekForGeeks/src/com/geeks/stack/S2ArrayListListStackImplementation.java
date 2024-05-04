package com.geeks.stack;

import java.util.ArrayList;

public class S2ArrayListListStackImplementation {

	ArrayList<Integer> a = new ArrayList<>();

	void push(int n) {
		a.add(n);
	}
	
	int pop() {
		return a.remove(a.size() - 1);
	}

	int peek() {
		return a.get(a.size() - 1);
	}

	boolean isEmpty() {
		return a.isEmpty();
	}

	int size() {
		return a.size();
	}

}
