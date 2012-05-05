package org.carolineleung.algo;

import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class SecretSanta {

	public Map<String, String> secretSanta2(String[] names) {
		Map<String, String> santas = new ConcurrentHashMap<String, String>(names.length);
		shuffle(names);
		assignToNext(names, santas);
		return santas;
	}

	private void shuffle(String[] names) {
		Random random = new Random();
		for (int i = names.length - 1; i >= 0; i--) {
			swap(names, i, random.nextInt(i + 1));
			printDebug(names, i);
		}
	}

	private void assignToNext(String[] names, Map<String, String> santas) {
		for (int i = 0; i < names.length; i++) {
			if (i == names.length - 1) { // Last person
				santas.put(names[i], names[0]);
			} else {
				santas.put(names[i], names[i + 1]);
			}
		}
	}

	private void swap(String[] names, int index1, int index2) {
		String temp = names[index1];
		names[index1] = names[index2];
		names[index2] = temp;
	}

	// Bad implementation
	public Map<String, String> secretSanta1(String[] names) {
		Map<String, String> santas = new ConcurrentHashMap<String, String>(names.length);
		String giver = names[0];
		Random random = new Random();
		int i = 0, LIMIT = 1000;
		for (String receiver : names) {
			while (i < LIMIT && (receiver.equals(giver) || santas.containsKey(giver))) {
				int ranIndex = random.nextInt(names.length - 1);
				giver = names[ranIndex];
				printDebug(santas, i++);
			}
			santas.put(giver, receiver);
		}
		if (santas.size() != names.length) {
			System.out.println("======= FAILED!! No Santa for you! ========\n\n");
		}
		return santas;
	}

	private void printDebug(Map<String, String> santas, int i) {
		System.out.println("[map] " + i + " - " + santas);
	}

	private void printDebug(String[] names, int i) {
		System.out.println("[array] " + i + " - " + Arrays.toString(names));
	}

}
