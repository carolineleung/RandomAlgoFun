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

	public List<Integer> findKLargest(List<Integer> input, int k) {
		if (input.size() <= k) {
			return input;
		}
		int midIndex = input.size() / 2;
		int midValue = input.get(midIndex);
		int midValueCount = 0;
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();

		for (int curr : input) {
			if (curr < midValue) {
				left.add(curr);
			} else if (curr > midValue) {
				right.add(curr);
			} else {
				midValueCount++;
			}
		}

		int i = 0;
		while (right.size() < k && i < midValueCount) {
			right.add(midValue);
			i++;
		}
		if (right.size() < k) {
			right.addAll(findKLargest(left, k - right.size()));
			return right;

		} else if (right.size() > k) {
			return findKLargest(right, k);
		} else {
			return right;
		}
	}

}
