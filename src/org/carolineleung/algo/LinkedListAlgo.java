package org.carolineleung.algo;

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

	public static final class LinkedListNode {
		public int value;
		public LinkedListNode next;

		public LinkedListNode(int value, LinkedListNode next) {
			super();
			this.value = value;
			this.next = next;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			LinkedListNode traverseNode = this;
			while (traverseNode != null) {
				sb.append(traverseNode.value);
				if (traverseNode.next != null) {
					sb.append(" -> ");
				}
				traverseNode = traverseNode.next;
			}
			return sb.toString();
		}
	}

}
