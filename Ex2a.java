/** Exercise 2 ws3
 *
 * Approximate calculation of the exponentional function
 *
 * @author  Lennart Wissel
 * @version 27.10.2014
 */

public class Ex2a {
  public static void main(String[] args) {
  }

  /** Method to get the power x to the i
   * must be a mistake on the sheet to return only ints
   * @param x is the base
   * @param i is the exponent
   * @return double representing the result of x^i
   */
  public static double powerIter(double x, int i) {
    // follow usual convention
    if (i == 0) {
      return 1.0;
    }

    double res = 1.0;
    for(int j = 1; j <= i; j++) {
      res = res*x;
    }
    return res;
  }

  /** method to calculate n! with for loops
   * @param n is the integer to calculate n*(n-1)*...*1
   * @return is the integer representing n!
   * remember 0! = 1
   */
  public static int factorialIter(int n) {
    if(n == 0) {
      return 1;
    }

    int res = 1;
    for(int i = 1; i <= n; i++) {
      res = i*res;
    }
    return res;
  }

  /** method to calculate exp(x) until a given threshold
   * @param x argument of exp(x)
   * @param threshold summand stops if smaller than threshold
   * @return approximate value of exp(x)
   */
  public static double expIter(double x, double threshold) {
    double summand;
    double res;

    summand = 1.0; // first summand is always 1
    // this case does not make much sense given the condition on the sheet if
    // summand is smaller than the threshold break:
    // if threshold > 1 then the summand is already smaller for the first expansion
    // and should therefore return 1.0
    if (threshold > 1.0) {
      return 1.0;
    }

    // here we create a while loop that only evaluates as long as summand is
    // not smaller than the threshold
    long i = 0;
    while(summand >= threshold){
      // for i = 0 we get summand = 1, for i = 1 we get summand = x
      summand = powerIter(x,i)/factorialIter(i);
      res += summand;
      i++;
    }
    return res;
  }
}
