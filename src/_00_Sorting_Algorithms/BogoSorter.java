package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean sort = false;
		while (!sort) {
			sort = true;
			Random rand = new Random();
			int randint1;
			int randint2;
			for (int i = 0; i < array.length - 1; i++) {
				if (!(array[i+1] >= array[i])) {
					sort = false;
				}
			}
			if (!sort) {
				randint1 = rand.nextInt(array.length);
				randint2 = rand.nextInt(array.length);
				int tempHolder = array[randint1];
				array[randint1] = array[randint2];
				array[randint2] = tempHolder;
			}
			display.updateDisplay();
		}
	}
}
