import static org.junit.Assert.*;
import org.junit.Test;

public class Ex4MyTest {

  /** TEST HELPER METHODS
   */

  // swap method
  @Test
    public void ex4test1() {
      String[] a = {"1", "2"};
      String[] b = {"2", "1"};
      assertArrayEquals(a, Ex4.swap(b,0,1));
    }

  @Test
    public void ex4test2() {
      String[] a = {};
      String[] b = {};
      assertArrayEquals(a, Ex4.swap(b,0,1));
    }

  // isSorted
  @Test
    public void ex4test3() {
      String[] a = {};
      assertTrue(Ex4.isSorted(a));
    }

  @Test
    public void ex4test4() {
      String[] a = {"1"};
      assertTrue(Ex4.isSorted(a));
    }

  @Test
    public void ex4test5() {
      String[] a = {"1", "11", "111"};
      assertTrue(Ex4.isSorted(a));
    }

  @Test
    public void ex4test6() {
      String[] a = {"11", "11", "11"};
      assertTrue(Ex4.isSorted(a));
    }

  @Test
    public void ex4test7() {
      String[] a = {"111", "11", "111"};
      assertFalse(Ex4.isSorted(a));
    }
}
