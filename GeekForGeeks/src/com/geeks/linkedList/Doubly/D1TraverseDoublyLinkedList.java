package com.geeks.linkedList.Doubly;

public class D1TraverseDoublyLinkedList {

	public static void main(String[] args) {

		Node head = new Node(10);
		Node temp1 = new Node(20);

		head.next = temp1;
		temp1.prev = head;

		Node temp2 = new Node(30);

		temp1.next = temp2;
		temp2.prev = temp1;

		Node temp3 = new Node(40);
		temp2.next = temp3;
		temp3.prev = temp2;

		Node temp4 = new Node(50);

		temp3.next = temp4;
		temp4.prev = temp3;

		traverseDoublyLinkedList(head);

	}

	public static void traverseDoublyLinkedList(Node head) {

		Node curr = head;
		if (curr == null)
			return;
		while (curr.next != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.print(curr.data+" ");
		System.out.println();
		
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.prev;
		}

	}

}
