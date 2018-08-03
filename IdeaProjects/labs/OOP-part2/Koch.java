/*
 * Name:
 *
 * Description: Plot a Koch curve of order n.
 *
 * Execution:    java Koch n
 */

public class Koch {

    /*
     * Recursive graphics:  Koch.java takes a command-line argument n and draws a Koch curve of order n. 
     *  -- A Koch curve of order order 0 is a line segment. Turtle moves forward by step.
     * To form a Koch curve of order n: 
     *   -- Draw a Koch curve of order n−1 
     *   -- Rotate 60° counterclockwise (aka turn left) 
     *   -- Draw a Koch curve of order n−1 
     *   -- Rotate 120° clockwise (turn left -120) 
     *   -- Draw a Koch curve of order n−1 
     *   -- Rotate 60° counterclockwise 
     *   -- Draw a Koch curve of order n−1
     */

    // plot Koch curve of order n, with given step size
    public static void koch(int n, double step, Turtle turtle) {
    	// See the algorithm above
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double step = 1.0 / Math.pow(3.0, n);
        Turtle turtle = new Turtle(0.0, 0.0, 0.0);
        koch(n, step, turtle);
    }
}
