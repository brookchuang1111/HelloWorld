
/******************************************************************************
 *  Name:
 *
 *  Description: Creates an array of n bouncing balls and animates them.
 *
 *  Execution:    java BouncingBalls n
 *
 *
 *  % java BouncingBalls 10
 *
 ******************************************************************************/

public class BouncingBalls { 

    public static void main(String[] args) {

        // number of bouncing balls
        int n = Integer.parseInt(args[0]);

        // set boundary to box with coordinates between -1 and +1
        StdDraw.setXscale(-1.0, +1.0);
        StdDraw.setYscale(-1.0, +1.0);

        // TODO: create an array of n random balls

        // do the animation loop
        StdDraw.enableDoubleBuffering();
        while (true) {

            // TODO: move the n balls

            // draw the n balls
            StdDraw.clear(StdDraw.GRAY);
            StdDraw.setPenColor(StdDraw.BLACK);

            // TODO: draw the n balls

            }
            StdDraw.show();
            StdDraw.pause(20);
        }
    }
}
