/******************************************************************************
 *  Name:
 *
 *  Description: Read data points from a file and plot it.
 *
 *  Execution:    java PlotFilter < USA.txt
 *  Dependencies: StdDraw.java StdIn.java
 *  
 *
 ******************************************************************************/
public class PlotFilter { 

    public static void main(String[] args) {

        // read in bounding box and rescale
        double x0 = StdIn.readDouble();
	double y0 = ___;
	double x1 = ___;
	double y1 = ___;

        StdDraw.setXscale(x0, x1);
        StdDraw.setYscale(y0, y1);

        // for bigger points
        StdDraw.setPenRadius(0.005);

        // to speed up performance, defer displaying points
        StdDraw.enableDoubleBuffering();

        // plot points, one at a time
        while (!StdIn.isEmpty()) {
	    // read a coordinate 
	    double x = ___;
	    double y = ___;
	    // Draw it!
            StdDraw.___;
        }

        // display all of the points now
        StdDraw.show();

    }

}
