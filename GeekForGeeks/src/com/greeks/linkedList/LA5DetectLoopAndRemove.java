package com.greeks.linkedList;

public class LA5DetectLoopAndRemove {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = head.next.next;
		Node node = detectLoopAndRemove(head);
		L1TraverseLinkedList.traverseLinkedList(node);
	}

	private static Node detectLoopAndRemove(Node head) {

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}

		if (slow != fast)
			return null;

		slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;

		return head;
	}
}
