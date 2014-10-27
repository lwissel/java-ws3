import static org.junit.Assert.*;
import org.junit.Test;


public class Ex2aMyTest {
  
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
}
