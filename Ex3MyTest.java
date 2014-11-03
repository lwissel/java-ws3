import static org.junit.Assert.*;
import org.junit.Test;

public class Ex3MyTest {

  /** NON RECURSIVE TESTS
   */


  /*
   * given example test
   */
  @Test
    public void ex3test1() {
      assertEquals(15, Ex3.digitTotalIter(12345));
    }

  /*
   * test for 0
   */
  @Test
    public void ex3test2() {
      assertEquals(0, Ex3.digitTotalIter(0));
    }

  /*
   * test for 1
   */
  @Test
    public void ex3test3() {
      assertEquals(1, Ex3.digitTotalIter(1));
    }

  /*
   * test for 100
   */
  @Test
    public void ex3test4() {
      assertEquals(1, Ex3.digitTotalIter(100));
    }

  /*
   * test for negative values (even though not expected)
   */
  @Test
    public void ex3test5() {
      assertEquals(4, Ex3.digitTotalIter(-13));
    }


 
  /** RECURSIVE TESTS
   */

  /*
   * given example test
   */
  @Test
    public void ex3test6() {
      assertEquals(15, Ex3.digitTotalRec(12345));
    }

  /*
   * test for 0
   */
  @Test
    public void ex3test7() {
      assertEquals(0, Ex3.digitTotalRec(0));
    }

  /*
   * test for 1
   */
  @Test
    public void ex3test8() {
      assertEquals(1, Ex3.digitTotalRec(1));
    }

  /*
   * test for 100
   */
  @Test
    public void ex3test9() {
      assertEquals(1, Ex3.digitTotalRec(100));
    }

  /*
   * test for negative values (even though not expected)
   */
  @Test
    public void ex3test10() {
      assertEquals(4, Ex3.digitTotalRec(-13));
    }
}
