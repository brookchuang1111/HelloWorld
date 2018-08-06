/*
 * Name:
 *
 * Description:  Plots the Julia set for the complex point c = a + ib.
 *
 *  % java ColorJulia -0.75 0.1 < data/datatype/mandel.txt
 *
 *  % java ColorJulia -1.25 0 < data/datatype/mandel.txt
 *
 *  % java ColorJulia 0.1 0.7 < data/datatype/mandel.txt
 *
 */

import java.awt.Color;

public class ColorJulia {

    // return number of iterations to check z is in the Julia set of c
    static int julia(Complex c, Complex z, int maximumIterations) {
        // TODO: Iterate at most maximumIterations times, and return early if |z|
        // diverges: |z| > 2.0; return t, where t is the loop variable.
        // In each iteration, set z = z^2 + c

        return maximumIterations - 1;
    }


    public static void main(String[] args) {
        double real = Double.parseDouble(args[0]);      // a
        double imag = Double.parseDouble(args[1]);      // b
        Complex c = new Complex(real, imag);            // c = a + ib
        double xmin   = -2.0;
        double ymin   = -2.0;
        double width  =  4.0;
        double height =  4.0;

        int n = 512;
        int ITERS  = 256;

        // read in color map
        Color[] colors = new Color[ITERS];
        for (int t = 0; t < ITERS; t++) {
            int r = StdIn.readInt();
            int g = StdIn.readInt();
            int b = StdIn.readInt();
            colors[t] = new Color(r, g, b);
        }
        Picture picture = new Picture(n, n);

        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                double x = xmin + col * width / n;
                double y = ymin + row * height / n;
                Complex z = new Complex(x, y);
                int t = julia(c, z, ITERS);
                picture.set(col, row, colors[t]);
            }
        }
        picture.show();
    }

}
