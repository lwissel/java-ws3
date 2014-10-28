import static org.junit.Assert.*;
import org.junit.Test;

/** NON RECURSIVE
 * 
 */

public class Ex2MyTest {
  
  /**
   * Test powerIter for i=0 
   */
  @Test
    public void ex2Test1() {
      assertEquals(1.0, Ex2a.powerIter(10.0,0), 0.0001);
    }

  /**
   * Test powerIter for i=1
   */
  @Test
    public void ex2Test2() {
      assertEquals(10.0, Ex2a.powerIter(10.0,1), 0.0001);
    }

  /**
   * Test powerIter for i=2
   */
  @Test
    public void ex2Test3() {
      assertEquals(100.0, Ex2a.powerIter(10.0,2), 0.0001);
    }

  /**
   * Test powerIter for random numbers
   */
  @Test
    public void ex2Test4() {
      assertEquals(64.0, Ex2a.powerIter(4.0,3), 0.0001);
    }


  /**
   * Test factorialIter for 4
   */
  @Test
    public void ex2Test5() {
      assertEquals(24, Ex2a.factorialIter(4));
    }


  /**
   * Test factorialIter for 0
   */
  @Test
    public void ex2Test6() {
      assertEquals(1, Ex2a.factorialIter(0));
    }

  /**
   * Test factorialIter for 1
   */
  @Test
    public void ex2Test7() {
      assertEquals(1, Ex2a.factorialIter(1));
    }

  /**
   * test exp(0)
   */
  @Test
    public void ex2Test8() {
      assertEquals(1.0, Ex2a.expIter(0,0.01),0.0001);
    }

  /**
   * test exp(1)
   */
  @Test
    public void ex2Test9() {
      assertEquals(2.718, Ex2a.expIter(1.0, 0.0001),0.001);
    }


  /**
   * test exp(2.0)
   */
  @Test
    public void ex2Test10() {
      assertEquals(7.389, Ex2a.expIter(2.0, 0.0001),0.001);
    }

  /**
   * test exp(3.0)
   */
  @Test
    public void ex2Test11() {
      assertEquals(20.08, Ex2a.expIter(3.0, 0.001),0.01);
    }

  /**
   * test exp(4.0)
   */
  @Test
    public void ex2Test12() {
      assertEquals(54., Ex2a.expIter(4.0, 0.1),0.1);
    }


  /** RECURSIVE TESTS
   * 
   */

  /**
   * Test powerRec for i=0 
   */
  @Test
    public void ex2bTest1() {
      assertEquals(1.0, Ex2b.powerRec(10.0,0), 0.0001);
    }

  /**
   * Test powerRec for i=1
   */
  @Test
    public void ex2bTest2() {
      assertEquals(10.0, Ex2b.powerRec(10.0,1), 0.0001);
    }

  /**
   * Test powerRec for i=2
   */
  @Test
    public void ex2bTest3() {
      assertEquals(100.0, Ex2b.powerRec(10.0,2), 0.0001);
    }

  /**
   * Test powerRec for random numbers
   */
  @Test
    public void ex2bTest4() {
      assertEquals(64.0, Ex2b.powerRec(4.0,3), 0.0001);
    }


  /**
   * Test factorialRec for 4
   */
  @Test
    public void ex2bTest5() {
      assertEquals(24, Ex2b.factorialRec(4));
    }


  /**
   * Test factorialRec for 0
   */
  @Test
    public void ex2bTest6() {
      assertEquals(1, Ex2b.factorialRec(0));
    }

  /**
   * Test factorialRec for 1
   */
  @Test
    public void ex2bTest7() {
      assertEquals(1, Ex2b.factorialRec(1));
    }

  /**
   * test exp(0)
   */
  @Test
    public void ex2bTest8() {
      assertEquals(1.0, Ex2b.expRec(0,0.01,0),0.0001);
    }

  /**
   * test exp(1)
   */
  @Test
    public void ex2bTest9() {
      assertEquals(2.718, Ex2b.expRec(1.0, 0.0001),0.001);
    }


  /**
   * test exp(2.0)
   */
  @Test
    public void ex2bTest10() {
      assertEquals(7.389, Ex2b.expRec(2.0, 0.0001),0.001);
    }

  /**
   * test exp(3.0)
   */
  @Test
    public void ex2bTest11() {
      assertEquals(20.08, Ex2b.expRec(3.0, 0.001),0.01);
    }

  /**
   * test exp(4.0)
   */
  @Test
    public void ex2bTest12() {
      assertEquals(54., Ex2b.expRec(4.0, 0.1),0.1);
    }
}
