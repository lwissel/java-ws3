
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * Quicksort is not stable in that strings of the same length are not guaranteed to be in the same order (as is the case with bubblesort)
 * Utility method sorted ensures that the result array is in length order, allowing for instability
 * 
 */
public class Ex4PublicTest {
	
	/**
	 * Simple input
	 */
	@Test
	public void ex4PublicTest1() {
		
		String [] arr = {"aaaa","b","aa"};
		
		String [] result = Ex4.quickSort(arr);
	//	String [] expected  = {"b","aa","aaaa"};
		assertTrue(Ex4PublicTest.sorted(result));
		
		
	
	}
 
	/**Testing the empty array
	 * 
	 */
	@Test
	public void ex4PublicTest2() {
		
		String [] arr = {};
		
		String [] expected = {};
		String [] result = Ex4.quickSort(arr);
		assertArrayEquals(expected, result);
		
	}
	
	
	/**
	 * Longer list 
	 */
	@Test
	public void ex4PublicTest3() {
		
		String [] arr = {"aaaa","b","aa","aaa","abds","abc","ha"};
		
	//	String [] expected = {"b","aa","ha","aaa","abc","aaaa","abds"};
		String [] result = Ex4.quickSort(arr);
		
		assertTrue(Ex4PublicTest.sorted(result));
	}
	
	
	/**
	 * Checks that an array of string is of increasing length order
	 * Allows for both "a","ab","bc","ccc" and "a","ba","bc","ccc
	 * (both can be returned by quicksort, and both are correctly sorted
	 * @param array
	 * @return
	 */
	public static boolean sorted(String[] array){
		for (int i = 0; i < array.length-1; i++) {
			if(array[i].length()>array[i+1].length())
				return false;
		}
		return true;
	}
	
}
