package com.greeks.linkedList;

public class LA7SegregateOddAndEvenInLInkedList {

	public static void main(String[] args) {
		Node head = new Node(17);
		head.next = new Node(2);
		head.next.next = new Node(13);
		head.next.next.next = new Node(9);
		head.next.next.next.next = new Node(5);

		Node node = segregate(head);
		L1TraverseLinkedList.traverseLinkedList(node);
	}

	private static Node segregate(Node head) {

		Node es = null, ee = null, os = null, oe = null;

		Node curr = head;

		while (curr != null) {
			if (curr.data % 2 == 0) {

				if (es == null) {
					es = curr;
					ee = curr;
				} else {
					ee.next = curr;
					ee = curr;
				}

			}else {
				if (os == null) {
					os = curr;
					oe = curr;
				} else {
					oe.next = curr;
					oe = curr;
				}
			}
			curr = curr.next;
		}
		
		ee.next = os;
		oe.next = null;
		return es;
		
	}

}
