package org.carolineleung.algo;

import java.util.Arrays;

import junit.framework.Assert;

import org.carolineleung.algo.InPlaceSortThreeTypesData.B;
import org.carolineleung.algo.InPlaceSortThreeTypesData.G;
import org.carolineleung.algo.InPlaceSortThreeTypesData.R;
import org.carolineleung.algo.InPlaceSortThreeTypesData.RgbObject;
import org.junit.Test;

public class InPlaceSortThreeTypesDataTest {

	@Test
	public void testInPlaceSortRGB1() {
		RgbObject[] objs = new RgbObject[] { new R(), new G(), new R(), new G(), new B() };
		InPlaceSortThreeTypesData.inPlaceSortRGB(objs);

		String objsAsString = Arrays.toString(objs);
		Assert.assertEquals("[r, r, g, g, b]", objsAsString);
	}

	// @Test //TODO fix this
	public void testInPlaceSortRGB2() {
		RgbObject[] objs = new RgbObject[] { new B(), new G(), new R(), new G(), new R() };
		InPlaceSortThreeTypesData.inPlaceSortRGB(objs);

		String objsAsString = Arrays.toString(objs);
		Assert.assertEquals("[r, r, g, g, b]", objsAsString);
	}

}
