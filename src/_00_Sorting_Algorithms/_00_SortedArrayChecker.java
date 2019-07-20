package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	static boolean intArraySorted(int[] ints) {
		boolean sort = true;
		for (int i = 0; i < ints.length - 1; i++) {
			if (!(ints[i+1] >= ints[i])) {
				sort = false;
			}
		}
		return sort;
	}
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise

	
	//2. Write a static method called doubleArraySorted. 
	static boolean doubleArraySorted(double[] dbs) {
		boolean sort = true;
		for (int i = 0; i < dbs.length - 1; i++) {
			if (!(dbs[i+1] >= dbs[i])) {
				sort = false;
			}
		}
		return sort;
	}
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise

	
	//3. Write a static method called charArraySorted. 
	static boolean charArraySorted(char[] chrs) {
		boolean sort = true;
		for (int i = 0; i < chrs.length - 1; i++) {
			if (!(chrs[i+1] >= chrs[i])) {
				sort = false;
			}
		}
		return sort;
	}
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)

	
	//4. Write a static method called stringArraySorted. 
	static boolean stringArraySorted(String[] strs) {
		boolean sort = true;
		for (int i = 0; i < strs.length - 1; i++) {
			if (strs[i+1].compareTo(strs[i]) < 0) {
				sort = false;
			}
		}
		return sort;
	}
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)

}
