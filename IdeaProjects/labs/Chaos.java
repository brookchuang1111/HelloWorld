/*
 * Name:
 *
 * Description:
 *
 */

public class Chaos {
    public static void main(String args[]) {

        int trials = Integer.parseInt(args[0]);
        double c = Math.sqrt(3.0) / 2.0;
	// Declare arrays to hold X and Y values.
	// FILL ME IN

        StdDraw.setXscale(-0.25, 1.25);
        StdDraw.setYscale(-0.25, 1.25);
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
        double x = 0.0, y = 0.0;
        for (int t = 0; t < trials; t++) {
            int r = (int) (Math.random() * 3);
	    // Plot a point halfway between (x, y) and (cx[r], cy[r]).
	    // FILL ME IN

            StdDraw.point(x, y);
        }
    }
}
