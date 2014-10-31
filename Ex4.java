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
    String[] sLeft  = createSubArray(s, "left");
    String[] sRight = createSubArray(s, "right");
    // ADD all subarrays etc to arraylist?
    //
    quickSort(
    return s;
  }

  /** HELPER METHODS */

  /** creates left or right subarray assuming a pivot is half array.length
   * @param array is the array to create the subarray from
   * @param type is "left" or "right"
   * @return new subarray of array containing all items bigger or smaller than the pivot
   */
  public static String[] createSubArray(String[] array, String type) {
    if (array.length == 0) { return array; }
    if (array.length == 1) { return array; }

    int pivot = array.length/2;
    int count = 0; // count how big each subarray will be

    // create either the left or right subarray
    if (type.equals("left")) {
      for (int i = 0; i < array.length; i ++) {
        if ( array[i].length() <= array[pivot].length() ) { 
          count++;
        }
      }
      
      // create the new subarray
      // and copy the elements over
      if (count == 0) {
        return new String[] {};
      } 
      else {
        String[] returnArray = new String[count-1]; //we don't want to include the pivot string
        for (int i = 0; i < array.length; i ++) {
          if ( array[i].length() <= array[pivot].length() && i != pivot ) { 
            returnArray[i] = array[i];
          }
        }
        return returnArray;
      }
    }

    else if (type.equals("right")) {
      for (int i = 0; i < array.length; i ++) {
        if ( array[i].length() > array[pivot].length() ) { 
          count++;
        }
      }
      
      // create the new subarray
      // and copy the elements over
      if (count == 0) {
        return new String[] {};
      } 
      else {
        String[] returnArray = new String[count];
        for (int i = 0; i < array.length; i++) {
          if ( array[i].length() > array[pivot].length() ) { 
            returnArray[i] = array[i];
          }
        }
        return returnArray;
      }
    }
    // if no mathing type is given we just do nothing
    else {
      return array;
    }
  }

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
    // empty arrays or length = 1 arrays are sorted by definition
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
