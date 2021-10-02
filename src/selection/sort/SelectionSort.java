package selection.sort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = { 10, 2, 5, 7, 8, 9, 3, 4 };
		System.out.println(Arrays.toString(selectionSort(a)));
	}

	static int[] selectionSort(int[] a) {
		int temp;
		int lastIndex=0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					
				}
			}
			System.out.println("lastIndex="+lastIndex);
			//lastIndex++;
		}

		return a;
	}
}
