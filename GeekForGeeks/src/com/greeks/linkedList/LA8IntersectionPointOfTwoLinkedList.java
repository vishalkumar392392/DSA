package com.greeks.linkedList;

import java.util.HashSet;

public class LA8IntersectionPointOfTwoLinkedList {

	public static void main(String[] args) {

		Node head1 = getFirstLinkedList();
		Node head2 = getSecondLinkedList();

		int intersectionPoint = getIntersectionPoint(head1, head2);
		System.out.println(intersectionPoint);

	}

	private static int getIntersectionPoint(Node head1, Node head2) {

		HashSet<Node> s = new HashSet<>();
		Node curr1 = head1;
		Node curr2 = head2;
		while (curr1 != null) {
			s.add(curr1);
			curr1 = curr1.next;
		}

		while (curr2 != null) {
			if (s.contains(curr2)) {
				return curr2.data;
			} else {
				curr2 = curr2.next;
			}

		}

		return 0;
	}

	private static Node getFirstLinkedList() {
		Node head = new Node(3);
		head.next = new Node(6);
		head.next.next = new Node(9);
		head.next.next.next = new Node(15);
		head.next.next.next.next = new Node(30);
		return head;
	}

	private static Node getSecondLinkedList() {
		Node head = new Node(10);
		head.next = new Node(15);
		head.next.next = new Node(30);
		return head;

	}

}
