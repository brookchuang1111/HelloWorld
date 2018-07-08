/************************************************************** 
 * Name:
 *
 * Execution:    java Checkerboard n
 * Dependencies: StdDraw.java
 *
 * Plots an n-by-n red and black checkerboard. 
 * Lower-left square is red.                    
 **************************************************************/

public class Checkerboard { 

    public static void main(String[] args) {
        // declaration and initialization - How big?
        int n = _____________________________________
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);

        // Draw from lower left, up and across.
        // i is the index for the x value; j is the index for y.
        for (int i = 0; i < n; i++) {

            for (int j = 0; __________; _________) {

                if ( ((i + j) % 2) ______________ ) 
                     StdDraw.setPenColor(StdDraw.BLACK);
                else
                    StdDraw.___________________(StdDraw.___________);
                
                // draw filled square centered at ___, ___ with radius .5
                StdDraw.filledSquare(___________, ___________, 0.5);
            }
        }
    }
}
