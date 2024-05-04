package com.greeks.linkedList;

public class LB3MergeTwoSortedLinkedLists {

	public static void main(String[] args) {

		Node node = merge(getA(), getB());
		L1TraverseLinkedList.traverseLinkedList(node);

	}

	private static Node merge(Node a, Node b) {

		Node head = null, tail = null;

		if (a.data < b.data) {
			head = tail = a;
			a = a.next;
		} else {
			head = tail = b;
			b = b.next;
		}

		while (a != null && b != null) {
			if (a.data < b.data) {
				tail.next = a;
				tail = a;
				a = a.next;
			} else {
				tail.next = b;
				tail = b;
				b = b.next;
			}
		}

		if (a == null)
			tail.next = b;
		else {
			tail.next = a;
		}

		return head;
	}

	private static Node getA() {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		return head;
	}

	private static Node getB() {
		Node head = new Node(5);
		head.next = new Node(25);
		return head;
	}

}
