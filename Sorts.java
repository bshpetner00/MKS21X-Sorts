import java.util.Arrays;
public class Sorts {
	public static void swap(int[]ary, int f, int l) {
		int temp = ary[f];
		ary[f] = ary[l];
		ary[l] = temp;
	}
	public static void selectionSort(int [] ary) {
		if (ary.length != 0) {
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
	public static void bubbleSort(int [] ary) {
		if (ary.length != 0) {
			for (int i = ary.length - 1; i > 0; i--) {
				for (int j = 0; j < i - 1; j++) {
					if (ary[j] > ary[i]) {
						swap(ary,j,i);
					}
				}
			}
		}
	}
	public static void main(String[]args) {
		int[]ary = {70,60,50,40,10};
		bubbleSort(ary);
		System.out.println(Arrays.toString(ary));
	}
}
