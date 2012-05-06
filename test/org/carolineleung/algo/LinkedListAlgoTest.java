package org.carolineleung.algo;

import org.carolineleung.data.LinkedListNode;
import org.carolineleung.util.InputFactory;
import org.junit.Test;

public class LinkedListAlgoTest {

	@Test
	public void testReverse() {
		LinkedListAlgo linkedListAlgo = new LinkedListAlgo();

		LinkedListNode testNode = InputFactory.createLinkedList(new int[] { 1, 2, 3, 4, 5, 6 });
		System.out.println(testNode);

		LinkedListNode reverseNode = linkedListAlgo.reverse(testNode);
		System.out.println(reverseNode);
	}
}
