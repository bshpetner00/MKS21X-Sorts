
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
				for (int j = 0; j < i; j++) {
					if (ary[j] > ary[i]) {
						swap(ary,j,i);
					}
				}
			}
		}
	}
	public static void insertionSort(int [] ary) {
		if (ary.length != 0) {
			for (int i = 1; i < ary.length; i++) {
				for (int j = i; j > 0; j--) {
					if (ary[j] < ary[j-1]) {
						int oldVal = ary[j];
						ary[j] = ary[j-1];
						ary[j-1] = oldVal;
					}
				}
			}
		}
	}
	public static void main(String[]args) {
		int[]ary = {70,60,50,40,100,30,5000,20,10,70000};
		insertionSort(ary);
		System.out.println(Arrays.toString(ary));
	}
}
