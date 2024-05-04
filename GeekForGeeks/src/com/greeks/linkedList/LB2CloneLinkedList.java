package com.greeks.linkedList;

public class LB2CloneLinkedList {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		Node node = cloneLinkedList(head); 
		L1TraverseLinkedList.traverseLinkedList(node);
	}

	private static Node cloneLinkedList(Node head) {

		Node cloneHead = new Node(head.data);
		Node curr = head.next;
		Node currClone = cloneHead;

		while (curr != null) {
			currClone.next = new Node(curr.data);
			curr = curr.next;
			currClone = currClone.next;
		}
		return cloneHead;
	}

}
