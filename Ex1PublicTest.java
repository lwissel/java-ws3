import static org.junit.Assert.*;

import org.junit.Test;


public class Ex1PublicTest {

	/**
	 * Simple case
	 */
	@Test
	public void ex1Test1() {
		int[] array = {1,2,3,4,5,6};
		double expected = 3.5;
		double result = Ex1.average(array);
		//remember, third value is error bounds
		assertEquals(expected, result, 0.0001);
	}
	
	/**
	 * Second case
	 */
	@Test
	public void ex1Test2() {
		int[] array = {2,2,2,2,2,2,2,2};
		double expected = 2.0;
		double result = Ex1.average(array);
		//remember, third value is error bounds
		assertEquals(expected, result, 0.0001);
	}
	
	/**
	 * With negatives
	 */
	@Test
	public void ex1Test3() {
		int[] array = {-2,-3,0,1,4,7};
		double expected = 1.1666666666666667;
		double result = Ex1.average(array);
		//remember, third value is error bounds
		assertEquals(expected, result, 0.00000001);
	}
	
	

	
	/**
	 * Empty case
	 */
	@Test
	public void ex1Test4() {
		int[] array = {};
		double expected = 0;
		double result = Ex1.average(array);
		//remember, third value is error bounds
		assertEquals(expected, result, 0.0001);
	}
}
