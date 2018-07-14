/*
 * Name:
 *
 * Description: Plots various fractals.  As input, takes a probability distribution
 * and x/y coefficients.  Then, draws a random number based on the probability distribution
 * and updates x/y accordingly.
 *
 * Execution: java Chaos 100 < data/ifs/barnsley.txt
 *
 */

public class Chaos {

    static int getDiscrete(double[] dist) {
        double random = Math.random();
        int entry = 0;

        // Iterate over dist[] array to find the index "i" such that,
        //  dist[i] < random < dist[i + 1].


        return entry;
    }

    public static void main(String args[]) {

        int trials = Integer.parseInt(args[0]);
        double[] dist = ArrayIO.read1D();
        double[][] cx = ArrayIO.read2D();
        double[][] cy = ArrayIO.read2D();

        StdDraw.setXscale(-0.25, 1.25);
        StdDraw.setYscale(-0.25, 1.25);
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
        double x = 0.0, y = 0.0;
        for (int t = 0; t < trials; t++) {
            int r = getDiscrete(dist);

            // do the update
            double x0 = cx[r][0]*x + cx[r][1]*y + cx[r][2];
            double y0 = cy[r][0]*x + cy[r][1]*y + cy[r][2];

            x = x0;
            y = y0;

            StdDraw.point(x, y);

            // Plot once in a while...
            if (t % 100 == 0) {
                StdDraw.show();
                StdDraw.pause(10);
            }
        }

        StdDraw.show();
    }
}
