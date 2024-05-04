package com.greeks.linkedList;

import java.util.HashSet;

public class LA3DetectLoopLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = head.next.next;
		boolean isLoop = detectLoop(head);
		System.out.println(isLoop);
	}

	public static boolean detectLoop(Node head) {

		HashSet<Node> s = new HashSet<>();
		Node curr = head;
		while (curr != null) {

			if (s.contains(curr)) {
				return true;
			} else {
				s.add(curr);
			}
			curr = curr.next;
		}
		return false;
	}
}
