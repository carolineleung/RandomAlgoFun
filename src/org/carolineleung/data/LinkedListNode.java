package org.carolineleung.data;


public class LinkedListNode {
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
