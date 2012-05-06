package org.carolineleung.algo;

import java.util.ArrayList;
import java.util.List;

public class QuickSortAlgo {

	public List<Integer> quickSort(List<Integer> input) {
		int numToSort = input.size();
		if (numToSort == 0) {
			return input;
		}
		List<Integer> left = new ArrayList<Integer>(numToSort);
		List<Integer> right = new ArrayList<Integer>(numToSort);

		int midIndex = numToSort / 2;
		int midValue = input.get(midIndex);
		int midValueCount = 0;

		for (int curr : input) {
			if (curr < midValue) {
				left.add(curr);
			} else if (curr > midValue) {
				right.add(curr);
			} else {
				midValueCount++;
			}
		}
		// Sort the left portion (values < mid)
		left = quickSort(left);

		// Add the mid's
		for (int i = 0; i < midValueCount; i++) {
			left.add(midValue);
		}
		// Sort the right portion (values > mid)
		left.addAll(quickSort(right));
		return left;
	}

}
