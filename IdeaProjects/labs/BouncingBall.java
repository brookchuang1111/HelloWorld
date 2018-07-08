/******************************************************************************
 *  Name:
 *
 *
 *  Description: Implementation of a 2-d bouncing ball in the box from (-1, -1) to (1, 1).
 *
 *  % java BouncingBall
 *
 *  Execution:    java BouncingBall
 *  Dependencies: StdDraw.java
 *
 *
 ******************************************************************************/

public class BouncingBall { 
    public static void main(String[] args) {

        // set the scale of the coordinate system from (-1, -1) to (1, 1)
	StdDraw.setXscale(-1.0, ___);
	StdDraw.setYscale(____, ___);

	// enable double buffering
        StdDraw._____;

        // initial values
        double rx = 0.480, ry = 0.860;     // position
        double vx = 0.015, vy = 0.023;     // velocity
        double radius = 0.05;              // radius

        // main animation loop
        while (_____)  { 

            // bounce off wall according to law of elastic collision
	    // if the ball hits the ball, change direction.
            if (Math.abs(rx + vx) > 1.0 - radius) vx = -vx;
            if (Math.abs(ry + vy) > 1.0 - radius) vy = ____;

            // update position
            rx = rx + vx; 
            ry = _______;

            // clear the background
            StdDraw.clear(StdDraw.LIGHT_GRAY);

            // draw ball on the screen
	    StdDraw.setPenColor(_____);
	    // Draw a filled circle of radius "radius" at (rx, ry)
	    StdDraw._______;

            // copy offscreen buffer to onscreen
            StdDraw.___;

            // pause for 20 ms
            StdDraw.____;

        } 
    } 
} 
