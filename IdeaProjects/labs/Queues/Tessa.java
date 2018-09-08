/*
 *
 * Name:
 *
 * Description: Adaptation of a problem from Online Math Open (OMO Fall 2017).
 *
 * Problem: Tessa the hyper-ant is at the origin of the three-dimensional Euclidean space R-3. For
 * each step she moves to another lattice point that is 2 units away from the point she is currently on.
 * How many ways can she return to the origin for the first time after exactly 6 steps?
 *
 * Lattice point is one with integer coordinates such as (1, 2, 3), (4, 5, 6) etc.
 *
 * See the algorithms below.
 *
 * Use Java's LinkedList class for the queue implementation.
 *
 */

import java.util.LinkedList;

public class Tessa {
  static class Point {
    byte a1;
    byte a2;
    byte a3;
    byte numSteps;

    Point(byte x, byte y, byte z, byte numberOfSteps) {
      a1 = x;
      a2 = y;
      a3 = z;
      numSteps = numberOfSteps;
    }

    Point(Point o) {
      this(o.a1, o.a2, o.a3, o.numSteps);
    }

    void set(byte x, byte y, byte z, byte numberOfSteps) {
      a1 = x;
      a2 = y;
      a3 = z;
      numSteps = numberOfSteps;
    }

    boolean isTwoUnitsAway(Point other) {
      int d = (other.a1 - a1) * (other.a1 - a1) + (other.a2 - a2) * (other.a2 - a2) +
          (other.a3 - a3) * (other.a3 - a3);
      return d == 4;

    }

    int distanceSquareToOrigin(Point other) {
      int d = (other.a1 - a1) * (other.a1 - a1) + (other.a2 - a2) * (other.a2 - a2) +
          (other.a3 - a3) * (other.a3 - a3);
      return d;

    }

    boolean equalsZero() {
      if (a1 != 0 || a2 != 0 || a3 != 0)
        return false;
      return true;
    }
  }

  static int totalPaths;
  static LinkedList<Point> neighbors;
  static Point origin = new Point((byte) 0, (byte) 0,  (byte) 0, (byte) 0);

  // TODO: fill in
  static void bfs(Point start) {
    /*
     * Algorithm:
     *    1. Use a queue, and put the starting the point into the queue.
     *    2. While the queue is non-empty
     *          --  Remove head of queue
     *          --  If the distance from the current point to origin is more than 6 and we have taken
     *              more than 4 steps to get to the current location, we will not be able to get back
     *              to the origin in time.  So, continue.
     *          --  If we have taken 6 steps,
     *                    -- if we are at the origin  we increment a counter.
     *                 continue
     *          --  If we are back at the origin and we have taken at least 1 step, this path doesn't work; continue
     *          --  From the current point, generate the neighboring points that are 2 units away,
     *              and add them to the queue.
     *
     */

  }

  // TODO: fill in
  static void genNeighbors(Point p) {
    /*
     *     Generating neighbors(): Use a triple for loop to find all neighbors of (x, y, z)
     *       -- That is, try (x + (-2, 2), y + (-2, 2), z + (-2, 2))
     *       --  ALl points (x - 2, ..., x + 2) are within 2 units of x.
     *       -- Use the point ADT above.
     */

  }

  public static void main(String[] args) {

    bfs (new Point(origin));
    System.out.println(totalPaths);
  }
}
