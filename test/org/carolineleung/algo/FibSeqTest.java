package org.carolineleung.algo;

import org.junit.Assert;
import org.junit.Test;

public class FibSeqTest {

	@Test
	public void testFibR() {
		FibSeq fib = new FibSeq();
		Assert.assertEquals(0, fib.fibR(0));
		Assert.assertEquals(1, fib.fibR(1));
		Assert.assertEquals(1, fib.fibR(2));
		Assert.assertEquals(5, fib.fibR(5));
		Assert.assertEquals(144, fib.fibR(12));
		Assert.assertEquals(6765, fib.fibR(20));

		long start = System.nanoTime();
		int fib40 = fib.fibR(40);
		printDuration(start, "recursive");
		Assert.assertEquals(102334155, fib40);
	}

	@Test
	public void testFibIter() {
		FibSeq fib = new FibSeq();
		Assert.assertEquals(0, fib.fibIter(0));
		Assert.assertEquals(1, fib.fibIter(1));
		Assert.assertEquals(1, fib.fibIter(2));
		Assert.assertEquals(5, fib.fibIter(5));
		Assert.assertEquals(144, fib.fibIter(12));
		Assert.assertEquals(6765, fib.fibIter(20));

		long start = System.nanoTime();
		int fib40 = fib.fibIter(40);
		printDuration(start, "iterative");
		Assert.assertEquals(102334155, fib40);

	}

	private void printDuration(long start, String type) {
		System.out.println("Fib " + type + " computation for 40th Fib takes: " + (System.nanoTime() - start));
	}
}
