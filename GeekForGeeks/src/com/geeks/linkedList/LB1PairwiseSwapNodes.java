package com.geeks.linkedList;

public class LB1PairwiseSwapNodes {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		Node node = pairWiseSwap(head);
		L1TraverseLinkedList.traverseLinkedList(node);
	}

	private static Node pairWiseSwap(Node head) {

		Node curr = head;

		while (curr != null && curr.next != null) {

			int temp = curr.data;
			curr.data = curr.next.data;
			curr.next.data = temp;
			curr = curr.next.next;

		}
		return head;
	}

}
