package com.geeks.stack;

import com.geeks.linkedList.Node;

public class S3LinkedListImplementation {

	Node head;

	int size;

	void push(int n) {
		Node temp = new Node(n);
		temp.next = head;
		head = temp;
		size++;
	}

	int peek() {
		return head.data;
	}

	int pop() {
		int res = head.data;
		head = head.next;
		size--;
		return res;
	}

	int isEmpty() {
		return size;
	}

}
