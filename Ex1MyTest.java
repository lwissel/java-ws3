import static org.junit.Assert.*;
import org.junit.Test;


public class Ex1MyTest {
  
  /**
   * Test 1 Value
   */
  @Test
    public void ex1Test1() {
      int[] n = { 5 };
      assertEquals(5.0, Ex1.average(n), 0.0001);
    }

  /**
   * Test 3 values
   */
  @Test
    public void ex1Test2() {
      int[] n = { 1, 2, 3 };
      assertEquals(2.0, Ex1.average(n), 0.0001);
    }

  /**
   * Test with zero values
   */
  @Test
    public void ex1Test3() {
      int[] n = { 0, 0 };
      assertEquals(0.0, Ex1.average(n), 0.0001);
    }

  /**
   * Test with more values
   */
  @Test
    public void ex1Test4() {
      int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
      assertEquals(5.0, Ex1.average(n), 0.0001);
    }

  /**
   * Test with zero values
   */
  @Test
    public void ex1Test5() {
      int[] n = { };
      assertEquals(0.0, Ex1.average(n), 0.0001);
    }
}
