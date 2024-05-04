package com.greeks.linkedList;

// C -> Circular Linked List
public class C1TraversalCircularLinkedlist {

	public static void main(String[] args) {
		Node a = new Node(10);
		a.next = new Node(20);
		a.next.next = new Node(30);
		a.next.next.next = new Node(40);
		a.next.next.next.next = new Node(50);
		a.next.next.next.next.next = a;
		traverseLinkedList(a);
	}

	public static void traverseLinkedList(Node head) {

		Node curr = head;
		System.out.print(curr.data + " ");
		curr = curr.next;
		while (curr != head) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}

	}
	
	public static void traverseInfiniteLinkedList(Node head) {

		Node curr = head;
		while (curr != null) {
			if(curr == head) {
				System.out.println();
			}
			System.out.print(curr.data + " ");
			
			curr = curr.next;
		}

	}

}
