package org.carolineleung.util;

import java.util.List;

import org.carolineleung.algo.LinkedListAlgo;
import org.carolineleung.algo.LinkedListAlgo.LinkedListNode;

import com.google.common.primitives.Ints;

public class InputFactory {

	public static LinkedListNode createLinkedList(int[] intValues) {
		LinkedListNode nextNode = null, head = null;

		for (int currVal : intValues) {
			LinkedListNode newNode = new LinkedListNode(currVal, null);
			if (nextNode == null) {
				nextNode = newNode;
				head = nextNode;
			} else {
				nextNode.next = newNode;
				nextNode = nextNode.next;
			}
		}
		return head;
	}

	public static List<Integer> createIntegerList(int[] intValues) {
		return Ints.asList(intValues);
	}
}
