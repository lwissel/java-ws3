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

		//String [] arr = {"aaaa","b","aa","aaa","abds","abc","ha"};
    //quickSort(arr);
    //for(String s: arr) System.out.print(s + " ");
    //System.out.println();
  }

  /** method to sort a string array according to the string length using the
   * quicksort algorithm
   * @param str string array to be sorted
   * @return recursively the sorted string array
   */
  public static String[] quickSort(String[] str) {
    rearrange(str, 0, str.length-1);
    return str;
  }


  /** method to rearrange a string array according to the string length using
   * the exercise instructions
   * @param s string array to sort
   * @param a lower index
   * @param b upper index
   * @return sorted array in increasing order
   */
  public static void rearrange(String[] s, int a, int b) {

    // we need two more variables to define the subarray of s we work on
    // a represents the lower index, b the upper end (both including)
    if (a > b || b >= s.length) { return; }
    if (s.length == 1 || s.length == 0) { return; }
    if (isSorted(s)) { return; }

    // this is the pivot point we base our comparison on
    int pivot = (b-a+1)/2;

    // to make life easier we just copy the elements to a dummy array ignoring
    // memory restrictions
    // the length is always: o i ii iii
    //                         a     b
    //                         b-a + 1 = 3-1 + 1 = 2+1 = 3
    String[] sCopy = new String[b-a+1];

    // this variable keeps track of the last written position in the sCopy array
    int positionCounter = 0;

    // this integer is the position in the sCopy array after rearranging
    int newPivot;

    // first copy all elements smaller equal to the pivot elements
    for ( int i = 0; i < sCopy.length; i++) {
      if ( s[i].length() <= s[pivot].length() && i != pivot ) {
        // copy elements to the beginning
        sCopy[positionCounter] = s[i]; 
        positionCounter++;
      }
    }
      
    // then copy the pivot element and remember its new position
    // pivot has to be copied to positionCounter which already points to the
    // correct empty array position because it was incremented in the last loop
    sCopy[positionCounter] = s[pivot];
    newPivot = positionCounter;
    positionCounter++;
    
    // then copy the other elements
    for ( int i = 0; i < sCopy.length; i++) {
      if ( s[i].length() > s[pivot].length() ) {
        // copy elements on top of the new pivot position
        sCopy[positionCounter] = s[i]; 
        positionCounter++;
      }
    }

    // now our new sCopy array is the rearranged array and we can copy its
    // contents back into the original array
    for ( int i = 0; i < sCopy.length; i++ ) {
      s[a+i] = sCopy[i];
    }

    // the new lower and upper partitions should not include the newPivot anymore
    rearrange(s,a,newPivot-1);
    rearrange(s,newPivot+1,b);
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
