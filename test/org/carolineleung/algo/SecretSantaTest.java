package org.carolineleung.algo;

import org.junit.Test;

public class SecretSantaTest {

	public void testSecretSanta1() {
		SecretSanta santa = new SecretSanta();
		System.out.println(santa.secretSanta1(new String[] { "a", "b", "c", "d", "e" }));
	}

	@Test
	public void testSecretSanta2() {
		SecretSanta santa = new SecretSanta();
		System.out.println(santa.secretSanta2(new String[] { "a", "b", "c", "d", "e" }));
	}

	@Test
	public void testSecretSanta2ThreeElements() {
		SecretSanta santa = new SecretSanta();
		System.out.println(santa.secretSanta2(new String[] { "a", "b", "c" }));
	}

}
