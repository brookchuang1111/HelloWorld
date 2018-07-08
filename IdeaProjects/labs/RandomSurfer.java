/******************************************************************************
 *  Name: 
 * 
 *  Description: Implement Monte Carlo simulation for a random surfer.
 *
 *  Execution:    java RandomSurfer trials
 *
 *  % java Transition < tiny.txt | java RandomSurfer 1000000
 *   0.27297 0.26583 0.14598 0.24729 0.06793
 *
 ******************************************************************************/

public class RandomSurfer {
    public static void main(String[] args) {
        int trials = Integer.parseInt(args[0]);   // number of moves
        int m = StdIn.readInt();                  // number of pages  - ignore since m = n
        int n = StdIn.readInt();                  // number of pages
        if (m != n) {
            StdOut.println("m does not equal n");
            return;
        }

        // Declare transition matrix: p
	// FILL ME IN

	// Read in transition matrix from StdIn and store into p
	// p[i][j] = prob. that surfer moves from page i to page j
	// FILL ME IN


        int[] freq = new int[n];                  // freq[i] = # times surfer hits page i
 
        // Start at page 0. 
        int page = 0;

	/*
        double YMAX = 1.1;

        StdDraw.setXscale(-1, n);
        StdDraw.setYscale(-0.5, YMAX);
	StdDraw.enableDoubleBuffering();
	*/

        for (int t = 0; t < trials; t++) {

            // Make one random move. 
            double r = Math.random(); 
            double sum = 0.0; 
            for (int j = 0; j < n; j++) {
                // Find interval containing r. 
                sum += p[page][j]; 
                if (r < sum) {
		    // found it
	    	    // FILL ME IN

                } 
            }

	    // Update freq of page
	    // FILL ME IN

	    /*
            StdDraw.clear();

            for (int k = 0; k < n; k++) {
                double yPos = (freq[k] / (double) trials) / 2.0;
                StdDraw.filledRectangle(k, yPos, 0.25, yPos);
            }
            StdDraw.show();
            StdDraw.pause(20);
	    */

        } 


        // Print page ranks. 
        for (int i = 0; i < n; i++) {
            StdOut.printf("%8.5f", (double) freq[i] / trials); 
        }
        StdOut.println(); 
    }  
} 
