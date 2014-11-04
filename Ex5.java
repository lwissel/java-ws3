/** Excercise 5 ws3
 *
 * Simulation of the Tower of Hanoi puzzle
 *
 * using a recursive strategy as written in the given wikipedia link
 * (without proof)
 *
 * @author  Lennart Wissel
 * @version 04.11.2014
 */

public class Ex5 {
  public static void main(String[] args) {
  }


  /** main method to move n disks from peg i to peg j
   * calling it with moveAll(hanoi,1,3,n) solves the whole puzzle
   * @param hanoi array representing the disks (0-n-1) = n disks, smallest
   * disk at position 0
   * @param i starting position
   * @param j position to move the disks to
   * @param k number of disks to move to j
   */
  public static void moveAll(int[] hanoi, int i, int j, int k) {
    // stop the recursion if k reaches 0
    if (k > 0) {
      
      // move k-1 disks to from i to j
      moveAll(hanoi,i,extraPeg,k-1);
      // move the topmost first disk from i to j
      move(hanoi,i,j);
      // move k-1 disks from extraPeg to i
      moveAll(hanoi,extraPeg,j,k-1);
    }
  }


  /** initialize the hanoi array with all disks on peg 1
   * @param n number of disks
   * @return initialized hanoi array
   */
  public static int[] init(int n) {
    int[] hanoi = new int[n];
    for (int i = 0; i < n; i++) {
      hanoi[i] = 1;
    }
    return hanoi;
  }

  /** trace method to keep track of the movements
   * @param n creates hanoi puzzle with n disks
   * @return a string representing each move to solve the hanoi puzzle
   */
  public static String trace(int n) {
    int[] hanoi = init(n);
    moveAll(hanoi,1,3,n);
    return trace;
  }

}
