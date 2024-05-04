package com.geeks.linkedList;

public class L5InsertAtGivenPosition {
	
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		Node insertAtGivenPosition = insertAtGivenPosition(head, 4, 15);
		L1TraverseLinkedList.traverseLinkedList(insertAtGivenPosition);

	}

	public static Node insertAtGivenPosition(Node head, int position, int k) {
		
		if(head ==null) return head;
		if(position == 1) {
			Node node = new Node(k);
			node.next = head;
			return node;
		}
		int i = 1;
		Node curr = null;	
		for(curr = head; curr.next!=null && i <position-1; curr = curr.next) {
			
			i++;
		}
		Node node = new Node(k);
		Node temp = curr.next;
		curr.next = node;
		node.next = temp;
		return head;
		
	}

}
