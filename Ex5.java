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
   * @param hanoi array representing the disks (0-n-1) = n disks, smallest
   * disk at position 0
   * @param i starting position
   * @param j position to move the disks to
   * @param k number of disks to move to j
   */
  public static void moveAll(int[] hanoi, int i, int j, int k) {
  }

  /** initialize the hanoi array with all disks on peg 1
   * @param n number of disks
   * @return initialized hanoi array
   */
  public static int[] init(int n) {
    int[] hanoi = new int[n];
    for (int i: hanoi) {
      i = 1;
    }
    return hanoi;
  }
}
