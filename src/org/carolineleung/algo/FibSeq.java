package org.carolineleung.algo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FibSeq {
	Map<Integer, Integer> saved = new ConcurrentHashMap<Integer, Integer>();

	public int fibR(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		if (saved.containsKey(n)) {
			return saved.get(n);
		}
		int value = fibR(n - 1) + fibR(n - 2);
		saved.put(n, value);
		return value;
	}

	public int fibIter(int n) {
		int prev = 0, curr = 1; // Base cases
		if (n == 0)
			return 0;
		while (n > 1) {
			int fib = prev + curr;
			prev = curr;
			curr = fib;
			n--;
		}
		return curr;
	}
}
