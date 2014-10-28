/** Exercise 2 ws3
 *
 * Approximate calculation of the exponentional function
 *
 * This file contains the recursive versions of the functions
 * @author  Lennart Wissel
 * @version 27.10.2014
 */

public class Ex2b {
  public static void main(String[] args) {
  }

  /** rec method to get the power x to the i
   * must be a mistake on the sheet to return only ints
   * @param x is the base
   * @param i is the exponent
   * @return double representing the result of x^i
   */
  public static double powerRec(double x, int i) {
    // follow usual convention
    if (i == 0) {
      return 1.0;
    }
    else if (i == 1) {
      return x;
    }
    else {
      return x*powerRec(x, i-1);
    }
  }

  /** method to calculate n! recursively
   * @param n is the integer to calculate n*(n-1)*...*1
   * @return is the integer representing n!
   * remember 0! = 1
   *
   * IMPORTANT does only work for very small ints or it causes overflow
   */
  public static int factorialRec(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    else {
      return n*factorialRec(n-1);
    }
  }

  /** method to calculate exp(x) until a given threshold
   * @param x argument of exp(x)
   * @param threshold summand stops if smaller than threshold
   * @param i parameter to control the recursive function
   * @return approximate value of exp(x)
   * to make this method recursive we should introduce the parameter i
   * we assume the series converges
   */
  public static double expRec(double x, double threshold, int i) {
    double summand;

    summand = powerRec(x,i)/factorialRec(i);

    if(summand < threshold) {
      return summand;
    }
    else {
      return summand+expRec(x,threshold,i+1);
    }
  }
}
