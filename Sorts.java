import java.util.Arrays;
public class Sorts {
	public static void swap(int[]ary, int f, int l) {
		int temp = ary[f];
		ary[f] = ary[l];
		ary[l] = temp;
	}
	public static void selectionSort(int [] ary) {
		for (int i = 0; i < ary.length; i++) {
			int lowIndex = i;
			for (int j = i; j < ary.length; j++) {
				if (ary[j] < ary[lowIndex]) {
					lowIndex = j;
				}
			}
			swap(ary,lowIndex,i);
		}
	}
}
