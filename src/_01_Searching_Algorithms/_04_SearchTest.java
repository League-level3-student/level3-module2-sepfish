package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	String[] symphonia = {"Lloyd", "Colette", "Genis", "Raine", "Sheena", "Zelos", "Regal", "Presea"};
	String[] abyss = {"Luke", "Guy", "Jade", "Anise", "Natalia", "Tear"};
	String[] vesperia = {"Yuri", "Repede", "Estelle", "Rita", "Raven", "Judith", "Flynn", "Karol"};
	int[] array1 = {0, 2, 4, 6, 8, 10};
	int[] array2 = {0, 3, 6, 9, 12, 15, 18};
	int[] array3 = {200, 400, 600, 800, 1000, 1200, 1400, 1600, 1800};
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		assertEquals(5, _00_LinearSearch.linearSearch(symphonia, "Zelos"));
		assertEquals(2, _00_LinearSearch.linearSearch(abyss, "Jade"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
