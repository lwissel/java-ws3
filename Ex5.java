/** Excercise 5 ws3
 *
 * Simulation of the Tower of Hanoi puzzle
 *
 * using a recursive strategy described in the given wikipedia link
 * (without proof)
 *
 * @author  Lennart Wissel
 * @version 04.11.2014
 */

public class Ex5 {
  // this is our global trace String
  public static String trace = "";

  public static void main(String[] args) {

  // tests
  //
  // producing the same output as in Ex5.txt
  
  //System.out.print(trace(0));
  //System.out.print(trace(1));
  trace = "";
  System.out.println("Trace(2):");
  System.out.print(trace(2));
  System.out.println();
  
  trace = "";
  System.out.println("Trace(3):");
  System.out.print(trace(3));
  System.out.println();

  trace = "";
  System.out.println("Trace(4):");
  System.out.print(trace(4));
  System.out.println();
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
    if (hanoi.length == 1 || hanoi.length == 0) {
      addTrace(hanoi);
      return;
    }

    // stop the recursion if k reaches 0
    if (k > 0) {

      // we need to get the number of the extraPeg (not i AND not j)
      // for the recursion to work
      int extraPeg = 1;
      while(true) {
        if (extraPeg == i) {
          extraPeg++;
        }
        else if (extraPeg == j){
          extraPeg++;
        }
        else {
          break;
        }
      }

      // move k-1 disks to from i to j
      moveAll(hanoi,i,extraPeg,k-1);

      // move the topmost first disk from i to j
      // and add the operation to our trace
      move(hanoi,i,j);
      addTrace(hanoi);

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
    addTrace(hanoi);
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

  /** quickreference to add stings to trace
   * @param hanoi add the content of hanoi to the global trace string
   */
  public static void addTrace(int[] hanoi) {
    for (int a: hanoi) {
      trace += String.valueOf(a) + " ";
    }
    trace = trace.trim();
    trace += "\n";
  }

  /** move the highest (smallest) disk from peg i to peg j
   * @param hanoi array to operate on
   * @param i peg we take a disk from
   * @param j peg we put the disk on
   */
  public static void move(int[] hanoi, int i, int j) {
    if (hanoi.length == 0 || hanoi.length == 1) {
      return;
    }
    for(int s = 0; s < hanoi.length; s++) {
      // a simple increment is enough because the first matching disk is the
      // smallest by definition and according to the hanoi rules it must be the
      // topmost!
      if (hanoi[s] == i) {
        hanoi[s] = j;
        return;
      }
    }
  }

}
