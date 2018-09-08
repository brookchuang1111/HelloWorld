/*
 * Name:
 *
 * Description: Josephus problem.
 * In the Josephus problem from antiquity, n people are in dire straits and agree to the following strategy
 * to reduce the population. They arrange themselves in a circle (at positions numbered from 0 to n−1)
 * and proceed around the circle, eliminating every mth person until only one person is left.
 * Legend has it that Josephus figured out where to sit to avoid being eliminated.
 * Write a program that takes two integer command-line arguments m and n and
 * prints the order in which people are eliminated (and thus would show Josephus where to sit in the circle).
 *
 * Algorithm: Use a queue to model the circle.
 *  -- Take out the first m - 1 entries and add to back of the queue
 *      -- then mth entry is eliminated.
 *  -- Repeat until the queue has one entry
 */

import java.util.LinkedList;

public class Josephus {
  public static void main(String args[]) {

    int m = Integer.parseInt(args[0]);
    int n = Integer.parseInt(args[1]);

    // initialize the queue
    LinkedList<Integer> queue = new LinkedList<>();

    // Add i to the end of the queue
    for (int i = 1; i <= n; i++)
      queue._____;

    while (!queue.isEmpty()) {
      // remove from the head of the queue and add to the end of queue
      for (int i = 0; i < m-1; i++) {
	int t = queue._____;
        queue._____(t);
      }

      // Remove the head of queue and print it
      StdOut.print(queue._____ + " ");
    }
    StdOut.println();
  }
}
