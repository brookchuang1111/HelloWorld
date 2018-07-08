/******************************************************************************
 *  Name:
 *
 *  Execution:    java Markov trials
 *
 *  Description: This program reads a transition matrix from standard input and
 *  computes the probabilities that a random surfer lands on each page
 *  (page ranks) after the specified number of matrix-vector multiplies.
 *
 *  % java Transition < tiny.txt | java Markov 40
 *   0.27303 0.26573 0.14618 0.24723 0.06783
 *
 ******************************************************************************/

public class Markov {

    public static void main(String[] args) { 
        int trials = Integer.parseInt(args[0]);  // number of iterations
        int n = StdIn.readInt();                 // number of pages
        StdIn.readInt();                         // ignore integer required by input format


        // Read p[][] from StdIn. 
        double[][] p = new double[n][n];         // p[i][j] = prob. surfer moves from page i to page j
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                p[i][j] = StdIn.readDouble();

        double YMAX = 1.1;

        StdDraw.setXscale(-1, n);
        StdDraw.setYscale(-0.5, YMAX);

        StdDraw.enableDoubleBuffering();

        // Use the power method to compute page ranks. 
        double[] rank = new double[n]; 
        rank[0] = 1.0; 
        for (int t = 0; t < trials; t++) {

            // Compute effect of next move on page ranks. 
            double[] newRank = new double[n]; 
            for (int j = 0; j < n; j++) {
                // New rank of page j is dot product of old ranks and column j of p[][]. 
                for (int k = 0; k < n; k++) {
                   // FILL ME IN

                }
            } 

            // Update page ranks.
            rank = newRank;

            StdDraw.clear();

            for (int k = 0; k < n; k++) {
                StdDraw.filledRectangle(k, rank[k] / 2.0, 0.25, rank[k] / 2.0);
            }
            StdDraw.show();
            StdDraw.pause(20);

        } 

        // print page ranks
        for (int i = 0; i < n; i++) {
            StdOut.printf("%8.5f", rank[i]);  
        }
        StdOut.println();

        StdOut.println(); 
        // print page ranks
        for (int i = 0; i < n; i++) {
            StdOut.printf("%2d  %5.3f\n", i, rank[i]);  
        }
    } 
} 

