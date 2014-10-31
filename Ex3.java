/** Exercise 3 ws3
 *
 * Calculates the total digits of an integer
 *
 * first non-recursively, then recursive
 *
 * @author  Lennart Wissel
 * @version 29.10.2014
 */

public class Ex3 {
  public static void main(String[] args) {

  }

  /** method to calculate the digitTotal of a given integer
   * using a string object to avoid the use of % operations
   * @param n integer to calculate the digitTotal of
   * @return integer representing the digitTotal of n
   */
  public static int digitTotalIter(int n) {
    // convert the int to string for easier operations, only allow positives
    String s = Integer.toString(Math.abs(n));

    int res = 0;
    
    int i = 0;
    while(i < s.length()) {
      res += Integer.parseInt(s.charAt(i)+""); // note that +"" is needed to convert char to string
      i++;
    }
    return res;
  }


  /** RECURSIVE  method to calculate the digitTotal of a given integer
   * using a string object to avoid the use of % operations
   * @param n integer to calculate the digitTotal of
   * @return integer representing the digitTotal of n
   */
  public static int digitTotalRec(int n) {
    return digitTotalRec(n,0);
  }


  /** RECURSIVE helper method to calculate the digitTotal of a given integer
   * using a string object to avoid the use of % operations
   * @param n integer to calculate the digitTotal of
   * @param pos is the recursion control parameter
   * @return integer representing the digitTotal of n
   */
  public static int digitTotalRec(int n, int pos) {
    // convert the int to string for easier operations, only allow positives
    String s = Integer.toString(Math.abs(n));

    // our break condition is when are out of bounds
    if (pos == s.length()) {
      return 0;
    }
    else {
      return Integer.parseInt(s.charAt(pos)+"") + digitTotalRec(n,pos+1);
    }
  }

}
