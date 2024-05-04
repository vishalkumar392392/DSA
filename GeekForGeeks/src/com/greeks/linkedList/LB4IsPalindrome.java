package com.greeks.linkedList;

import java.util.ArrayDeque;
import java.util.Deque;

public class LB4IsPalindrome {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(1);

		boolean isPalindrome = isPalindrome(head);
		System.out.println(isPalindrome);

	}

	private static boolean isPalindrome(Node head) {

		Deque<Integer> stack = new ArrayDeque<>();

		Node curr = head;
		while (curr != null) {
			stack.push(curr.data);
			curr = curr.next;
		}
		curr = head;
		while (curr != null) {
			if (stack.pop() != curr.data) {
				return false;
			}
			curr = curr.next;
		}
		return true;
	}

}
