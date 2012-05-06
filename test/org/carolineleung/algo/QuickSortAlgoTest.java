package org.carolineleung.algo;

import java.util.Collections;
import java.util.List;

import org.carolineleung.util.InputFactory;
import org.junit.Assert;
import org.junit.Test;

public class QuickSortAlgoTest {

	@Test
	public void testQuickSort() {
		List<Integer> intList = InputFactory.createIntegerList(new int[] { 3, 5, 7, 1, -1, 2, 1, 5, 6 });
		QuickSortAlgo algo = new QuickSortAlgo();
		List<Integer> sortedList = algo.quickSort(intList);

		System.out.println("(Quick)Sorted List is: " + sortedList);
		Collections.sort(intList);

		Assert.assertTrue(intList.containsAll(sortedList));
		Assert.assertTrue(sortedList.containsAll(intList));
	}
}
