package org.carolineleung.algo;

import org.carolineleung.data.LinkedListNode;

public class LinkedListAlgo {

	public LinkedListNode reverse(LinkedListNode head) {
		LinkedListNode newHead = null;
		LinkedListNode current = head;

		while (current != null) {
			LinkedListNode newEntry = current;
			current = current.next;
			newEntry.next = newHead;
			newHead = newEntry;
		}
		return newHead;
	}

}
