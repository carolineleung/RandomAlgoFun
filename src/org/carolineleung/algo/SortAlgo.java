package org.carolineleung.algo;

public class SortAlgo {

	public static void inPlaceSortRGB(RgbObject a[]) {
		int rIndex = 0;
		int bIndex = a.length - 1;

		for (int i = 0; i < a.length; i++) {
			if (a[i].isR()) {
				swap(a, i, rIndex);
				i++;
				rIndex++;
			} else if (a[i].isB()) {
				swap(a, i, bIndex);
				bIndex--;
			} else {
				// Current element is G, no need to swap
				i++;
			}
		}
	}

	public static void swap(RgbObject[] a, int index1, int index2) {
		RgbObject temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}

	public interface RgbObject {
		boolean isR();

		boolean isG();

		boolean isB();
	}

	public static class R implements RgbObject {

		@Override
		public boolean isR() {
			return true;
		}

		@Override
		public boolean isG() {
			return false;
		}

		@Override
		public boolean isB() {
			return false;
		}

		@Override
		public String toString() {
			return "r";
		}

	}

	public static class G implements RgbObject {

		@Override
		public boolean isR() {
			return false;
		}

		@Override
		public boolean isG() {
			return true;
		}

		@Override
		public boolean isB() {
			return false;
		}

		@Override
		public String toString() {
			return "g";
		}

	}

	public static class B implements RgbObject {

		@Override
		public boolean isR() {
			return false;
		}

		@Override
		public boolean isG() {
			return false;
		}

		@Override
		public boolean isB() {
			return true;
		}

		@Override
		public String toString() {
			return "b";
		}

	}

}
