/** Exercise 1 ws 3
 *
 * Calculates the average of a given int array in double precision
 * equals the sum over all elements divided by the number of integers given
 *
 * @author  Lennart Wissel
 * @version 27.10.2014
 */

public class Ex1 {
  public static void main(String[] args) {
  }

  /**
   * method to calculate the average of a integer array
   * @param a input array of integers length bigger 0
   * @return double representing the average of a
   */
  public static double average(int[] a) {
    if (a.length < 1) {
      return 0.0;
    }

    double res = 0.0;
    for (int a: n) {
      res += (double)(a);
    }

    // the explicit cast is not needed here
    res = res/((double)(a.length));

    return res;
  }
}
