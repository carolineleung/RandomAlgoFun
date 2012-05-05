package org.carolineleung.algo;

import java.util.Arrays;

import junit.framework.Assert;

import org.carolineleung.algo.SortAlgo.B;
import org.carolineleung.algo.SortAlgo.G;
import org.carolineleung.algo.SortAlgo.R;
import org.carolineleung.algo.SortAlgo.RgbObject;
import org.junit.Test;

public class SortAlgoTest {

	@Test
	public void testInPlaceSortRGB1() {
		RgbObject[] objs = new RgbObject[] { new R(), new G(), new R(), new G(), new B() };
		SortAlgo.inPlaceSortRGB(objs);

		String objsAsString = Arrays.toString(objs);
		Assert.assertEquals("[r, r, g, g, b]", objsAsString);
	}

	@Test
	public void testInPlaceSortRGB2() {
		RgbObject[] objs = new RgbObject[] { new B(), new G(), new R(), new G(), new R() };
		SortAlgo.inPlaceSortRGB(objs);

		String objsAsString = Arrays.toString(objs);
		Assert.assertEquals("[r, r, g, g, b]", objsAsString);
	}

}
