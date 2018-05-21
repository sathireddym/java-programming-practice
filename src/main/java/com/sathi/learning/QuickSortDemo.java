package com.sathi.learning;

class Quicksort {
	// Set up a call to the actual Quicksort method.
	static void qsort(char items[]) {
		qs(items, 0, items.length - 1);
	}

	// Set up a call to the actual Quicksort method.
	static void qsort(int items[]) {
		qs(items, 0, items.length - 1);
	}

	// A recursive version of Quicksort for characters.
	private static void qs(char items[], int left, int right) {
		int i, j;
		char x, y;
		i = left;
		j = right;
		x = items[(left + right) / 2];
		do {
			while ((items[i] < x) && (i < right))
				i++;
			while ((x < items[j]) && (j > left))
				j--;
			if (i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
			}
		} while (i <= j);

		if (left < j)
			qs(items, left, j);
		if (i < right)
			qs(items, i, right);
	}

	// A recursive version of Quicksort for integers.
	private static void qs(int items[], int left, int right) {
		int i, j;
		int x, y;
		i = left;
		j = right;
		x = items[(left + right) / 2];
		do {
			while ((items[i] < x) && (i < right))
				i++;
			while ((x < items[j]) && (j > left))
				j--;
			if (i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
			}
		} while (i <= j);

		if (left < j)
			qs(items, left, j);
		if (i < right)
			qs(items, i, right);
	}
}

class QuickSortDemo {

	public static void main(String args[]) {
		char a[] = { 'd', 'x', 'a', 'r', 'p', 'j', 'i' };
		int i;
		System.out.print("Original char array: ");
		for (i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		// now, sort the array
		Quicksort.qsort(a);
		System.out.print("Sorted char array: ");
		for (i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		
		System.out.println();
		int b[] = { 50, 30, 80, 40, 300, 15, 2 };
		int j;
		System.out.print("Original int array: ");
		for (j = 0; j < b.length; j++)
			System.out.print(b[j] + " ");
		System.out.println();
		// now, sort the array
		Quicksort.qsort(b);
		System.out.print("Sorted int array: ");
		for (j = 0; j < b.length; j++)
			System.out.print(b[j] + " ");
	}

}