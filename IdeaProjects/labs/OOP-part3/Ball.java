
/******************************************************************************
 *  Name:
 *
 *  Description:  Implementation of a 2-d Ball moving in square with coordinates
 *  between -1 and 1. Bounces off the walls upon collision.
 *
 *  Compilation:  javac Ball.java
 *  Execution:    java Ball
 *
 ******************************************************************************/

public class Ball {

    // instance variables
    private double rx, ry;        // position
    private double vx, vy;        // velocity
    private final double radius;  // radius

    // TODO: fill in constructor
    public Ball() {

    }

    // TODO: bounce of vertical wall by reflecting x-velocity
    private void bounceOffVerticalWall() {

    }

    // TODO: bounce of horizontal wall by reflecting y-velocity
    private void bounceOffHorizontalWall() {

    }

    // move the ball one step
    public void move() {
        if (Math.abs(rx + vx) + radius > 1.0) bounceOffVerticalWall();
        if (Math.abs(ry + vy) + radius > 1.0) bounceOffHorizontalWall();

	// TODO: move the ball based on velocity

    }


    // test client
    public static void main(String[] args) {

        // create and initialize two balls
        Ball b1 = new Ball();
        Ball b2 = new Ball();

        // animate them
        StdDraw.setXscale(-1.0, +1.0);
        StdDraw.setYscale(-1.0, +1.0);
        StdDraw.enableDoubleBuffering();

        while (true) {
            StdDraw.clear(StdDraw.GRAY);
            StdDraw.setPenColor(StdDraw.BLACK);
            b1.move();
            b2.move();
            b1.draw();
            b2.draw();
            StdDraw.show();
            StdDraw.pause(20);
        }
    }
}

