package com.geeks.linkedList.Doubly;

public class D5DeleteLastNode {
	
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

		Node node = deleteLastNode(head);
		D1TraverseDoublyLinkedList.traverseDoublyLinkedList(node);

	}

	private static Node deleteLastNode(Node head) {
		
		Node curr = head;
		if(head == null) return head;
		if(head.next == null) return head;
		
		while(curr.next.next !=null) {
			curr = curr.next;
		}
		curr.next = null;
		return head;
	}

}
