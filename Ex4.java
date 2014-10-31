/** Exercise 4 ws3
 *
 * implementing the quicksort algorithm
 *
 * using two subarrays the elements are presorted by comparing each element with a given 'pivot' element
 * the pivot should be chosen that both subarrays should be of the same length
 *
 * @author  Lennart Wissel
 * @version 29.10.2014
 */

public class Ex4 {
  public static void main(String[] args) {
  }

  /** method to sort a string array according to the string length using the
   * quicksort algorithm
   * @param s string array to sort
   * @return sorted array in increasing order
   */
  public static String[] quickSort(String[] s) {
    return s;
  }

  /** HELPER METHODS */

  /** swaps to elements in string array
   * @param array array to operate on
   * @param n position 1
   * @param m position 2
   * @return array with elements n,m swapped
   */
  public static String[] swap(String[] array, int n, int m) {
    if (n >= array.length || m >= array.length) { return array; }

    String tmp = array[n];
    array[n] = array[m];
    array[m] = tmp;

    return array;
  }

  /** check if given string array is sorted in raising order
   * @param array string array to check
   * @return true if sorted, false if not
   */
  public static boolean isSorted(String[] array) {
    if (array.length == 0 || array.length == 1) { return true; }
    boolean result = false;
    for(int i = 0; i < array.length-1; i++) {
      if (array[i].length() <= array[i+1].length()) {
        result = true;
      }
      else {
        return false;
      }
    }
    return result;
  }

}
