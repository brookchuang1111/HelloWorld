/*
 * Name:
 *
 * Description: Plots the Mandelbrot set in color.
 *
 *  % java ColorMandelbrot -.5 0 2 < data/datatype/mandel.txt
 *
 *  // increase dwell
 *  % java ColorMandelbrot -0.7615134027775 0.0794865972225 0.0032285925920
 *
 */

import java.awt.Color;

public class ColorMandelbrot {

    // return number of iterations to check if c = a + ib is in Mandelbrot set
    public static int mand(Complex z0, int d) {
    	// TODO: Make a copy of z0 into z

	// TODO: Iterate at most d times, and return early if |z| 
	// diverges: |z| > 2.0 
	// In each iteration, set z = z^2 + z0

        return d;
    }

    public static void main(String[] args)  {
        double xc   = Double.parseDouble(args[0]);
        double yc   = Double.parseDouble(args[1]);
        double size = Double.parseDouble(args[2]);

        int n = 512;

        int ITERS = 256;


        // read in color map
        Color[] colors = new Color[ITERS];
        for (int t = 0; t < ITERS; t++) {
            int r = StdIn.readInt();
            int g = StdIn.readInt();
            int b = StdIn.readInt();
            colors[t] = new Color(r, g, b);
        }


        // compute Mandelbrot set
        Picture grayScalePicture = new Picture(n, n);
        Picture colorPicture = new Picture(n, n);
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                double x = xc - size/2 + size*col/n;
                double y = yc - size/2 + size*row/n;
                Complex z0 = new Complex(x, y);
                int t = mand(z0, ITERS - 1);
                // Use luminance library to set the grayscale
		// TODO: set the picture in grayscale by taking the luminance of colors[t]
		grayScalePicture.set(_____);
                colorPicture.set(col, n-1-row, colors[t]);
            }
        }
        colorPicture.show();
        grayScalePicture.show();
    }

}
