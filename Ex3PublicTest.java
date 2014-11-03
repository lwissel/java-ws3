import static org.junit.Assert.*;

import org.junit.Test;


public class Ex3PublicTest {

	/**
	 * Iterative Simple case
	 */
	@Test
	public void ex3IterPublicTest1() {
		int input = 12345;
		int expected = 15;
		int result = Ex3.digitTotalIter(input);
		assertEquals(expected, result);
	}
	
	/**
	 * Iterative Simple case 2
	 */
	@Test
	public void ex3IterPublicTest2() {
		int input = 1457521324;
		int expected = 34;
		int result = Ex3.digitTotalIter(input);
		assertEquals(expected, result);
	}
	
	/**
	 * Iterative 0 case 
	 */
	@Test
	public void ex3IterPublicTest3() {
		int input = 0;
		int expected = 0;
		int result = Ex3.digitTotalIter(input);
		assertEquals(expected, result);
	}
	
	

	/**
	 * Recursive Simple case
	 */
	@Test
	public void ex3RecPublicTest1() {
		int input = 12345;
		int expected = 15;
		int result = Ex3.digitTotalIter(input);
		assertEquals(expected, result);
	}
	
	/**
	 * Recursive Simple case 2
	 */
	@Test
	public void ex3RecPublicTest2() {
		int input = 1457521324;
		int expected = 34;
		int result = Ex3.digitTotalIter(input);
		assertEquals(expected, result);
	}
	
	/**
	 * Recursive 0 case 
	 */
	@Test
	public void ex3RecPublicTest3() {
		int input = 0;
		int expected = 0;
		int result = Ex3.digitTotalIter(input);
		assertEquals(expected, result);
	}

}
