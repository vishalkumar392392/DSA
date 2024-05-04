package com.greeks.linkedList;

public class LA1NthNodeOfEndLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		Node node = nthNodeFromEnd(head, 1);
		System.out.println(node.data);
//		L1TraverseLinkedList.traverseLinkedList(node);
	}

	private static Node nthNodeFromEnd(Node head, int k) {

		Node curr = head;
		int i = 0;
		while (curr != null) {
			curr = curr.next;
			i++;
		}
		int d = i - k + 1;
		i = 1;
		curr = head;
		while (curr != null) {
			if (i == d) {
				return new Node(curr.data);
			}
			curr= curr.next;
			i++;
		}

		return null;
	}

}
