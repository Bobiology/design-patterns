package bubble.sort;

import java.util.Arrays;

public class BubleSortAlgo {
	public static void main(String[] args) {
		int[] a = { 1, 10, 5, 3, 7, 8, 9, 2, 6, 4 };
		System.out.println("Sorted: " + Arrays.toString(sortedArray(a)));
	}

	/**
	 * 
	 * a = {1,10,5,3,7,8,9,2,6,4}
	 * 
	 * 
	 * 
	 * @param a
	 * @return
	 */
	static int[] sortedArray(int[] a) {
		int lastIndex = a.length - 1;
		int i = 0;
		int temp;
		while (i < lastIndex) {
			for (int j = 0; j < lastIndex - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					System.out.println("j="+j);
				}
			}
			System.out.println("i="+i);

			i++;
		}

		return a;
	}
}
