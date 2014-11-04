import static org.junit.Assert.*;
import org.junit.Test;

public class Ex5MyTest {

  /** TEST HELPER METHODS
   */

  @Test
    public void ex5test1() {
      int[] a = {1,1,1,1,1};
      int[] b = Ex5.init(5);
      assertArrayEquals(a,b);
    }

  @Test
    public void ex5test2() {
      int[] a = {};
      int[] b = Ex5.init(0);
      assertArrayEquals(a,b);
    }

  @Test
    public void ex5test3() {
      int[] a = {1};
      int[] b = Ex5.init(1);
      assertArrayEquals(a,b);
    }

  // Test to move disks
  @Test
    public void ex5test4() {
      int[] a = {1,1,1};
      Ex5.move(a,1,3);
      int[] r = {3,1,1};
      assertArrayEquals(a,r);
    }

  @Test
    public void ex5test5() {
      int[] a = {3,1,1};
      Ex5.move(a,1,3);
      int[] r = {3,3,1};
      assertArrayEquals(a,r);
    }

  @Test
    public void ex5test6() {
      int[] a = {1,1,1,3};
      Ex5.move(a,3,1);
      int[] r = {1,1,1,1};
      assertArrayEquals(a,r);
    }
}

