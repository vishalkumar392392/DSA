package com.geeks.linkedList;

public class L9SortedInsertLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		Node node = insertInSortedLinkedList(head, 15);

		L1TraverseLinkedList.traverseLinkedList(node);
	}

	private static Node insertInSortedLinkedList(Node head, int k) {
		
		Node curr = head;
		while(curr.next !=null) {
			if(curr.next.data < k) {
				curr = curr.next;
			}else {
				break;
			}
		}
		Node node = new Node(k);
		Node temp = curr.next;
		curr.next = node;
		node.next = temp;
		return head;
	}
}
