package org.carolineleung.algo;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AlphabetizeByWordTest {

	@Test
	public void testAlphabetizeShort1() {
		List<String> inputList = Arrays.asList("ou", "oyu");
		AlphabetizeByWord controller = new AlphabetizeByWord();
		List<String> returnList = controller.alphabetize(inputList, "you");
		List<String> expected = Arrays.asList("oyu", "ou");
		printAndAssert(returnList, expected);

	}

	@Test
	public void testAlphabetizeShort2() {
		List<String> inputList = Arrays.asList("yuo", "you");
		AlphabetizeByWord controller = new AlphabetizeByWord();
		List<String> returnList = controller.alphabetize(inputList, "you");
		List<String> expected = Arrays.asList("you", "yuo");
		printAndAssert(returnList, expected);
	}

	@Test
	public void testAlphabetize() {
		List<String> inputList = Arrays.asList("uoy", "you", "yo", "ouy", "ou", "y", "uyo");
		AlphabetizeByWord controller = new AlphabetizeByWord();
		List<String> returnList = controller.alphabetize(inputList, "you");
		List<String> expected = Arrays.asList("y", "yo", "you", "ou", "ouy", "uyo", "uoy");
		printAndAssert(returnList, expected);

	}

	private void printAndAssert(List<String> returnList, List<String> expected) {
		System.out.println("Sorted List: " + returnList);
		Assert.assertTrue(expected.containsAll(returnList));
		Assert.assertTrue(returnList.containsAll(expected));
	}

}
