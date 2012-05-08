package org.carolineleung.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AlphabetizeByWord {

	public List<String> alphabetize(List<String> strings, String word) {
		List<String> copyOfStrings = new ArrayList<String>(strings);

		final Map<Character, Integer> newAlphabetOrder = new ConcurrentHashMap<Character, Integer>(word.length());
		int i = 0;
		for (Character c : word.toCharArray()) {
			newAlphabetOrder.put(c, i++);
		}

		Collections.sort(copyOfStrings, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				char[] string1Chars = o1.toCharArray();
				char[] string2Chars = o2.toCharArray();
				int i = 0;
				for (; i < o1.length() && i < o2.length(); i++) {
					Integer value1 = newAlphabetOrder.get(string1Chars[i]);
					Integer value2 = newAlphabetOrder.get(string2Chars[i]);
					if (value1 == value2) {
						continue;
					} else {
						return value1.compareTo(value2);
					}
				}
				if (o1.length() < o2.length()) {
					return -1;
				} else if (o1.length() > o2.length()) {
					return 1;
				}
				return 0;
			}

		});
		return copyOfStrings;
	}
}
