
/*
 * Name:
 *
 * Description: Helper library for doing ArrayIO.
 */

public class ArrayIO {
    // Read in a 1D array of doubles and return the result.
    // Input format:
    //   an integer: n which specifies array length
    //   n double values
    static double[] read1D() {
        int n = StdIn.readInt();
        double[] result = new double[n];

        // FILL ME IN: a for loop that reads in the input
        return result;
    }

    // Read in a 1D array of doubles and return the result.
    // Input format:
    //   two integers: m, n which specify array dimensions
    //   m * n double values
    static double[][] read2D() {
        int m = StdIn.readInt();
        int n = StdIn.readInt();
        double [][] result;

        result = new double[m][];
        for (int i = 0; i < n; i++)
            result[i] = new double[n];

        // FILL ME IN: write a nested for loop that reads in the input

        return result;
    }

    // Similarly, define and implement:
    // static int[] read1D
    // static int[] read2D

    public static void main(String[] args) {
        // Add a unit test that invokes read1D, read2D and prints out results.
    }
}
