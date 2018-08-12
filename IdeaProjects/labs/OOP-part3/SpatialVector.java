
/******************************************************************************
 *
 *  Name:
 *
 *  Description:  Implementation of a vector of real numbers.
 *
 *  This class is implemented to be immutable: once the client program
 *  initialize a SpatialVector, it cannot change any of its fields
 *  (N or data[i]) either directly or indirectly. Immutability is a
 *  very desirable feature of a data type.
 *
 *  Execution:    java SpatialVector
 *
 *  % java SpatialVector
 *  x        =  (1.0, 2.0, 3.0, 4.0)
 *  y        =  (5.0, 2.0, 4.0, 1.0)
 *  x + y    =  (6.0, 4.0, 7.0, 5.0)
 *  10x      =  (10.0, 20.0, 30.0, 40.0)
 *  |x|      =  5.477225575051661
 *  <x, y>   =  25.0
 *  |x - y|  =  5.0990195135927845
 *
 *
 ******************************************************************************/

public class SpatialVector { 

    private final int n;         // length of the vector
    private double[] data;       // array of vector's components

    // create the zero vector of length n
    public SpatialVector(int n) {
        this.n = n;
        this.data = new double[n];
    }

    // create a vector from an array
    public SpatialVector(double[] data) {
        n = data.length;

        // defensive copy so that client can't alter our copy of data[]
        this.data = new double[n];
        for (int i = 0; i < n; i++)
            this.data[i] = data[i];
    }

    // return the length of the vector
    public int length() {
        return n;
    }

    // return the inner product of this SpatialVector a and b
    public double dot(SpatialVector that) {
        if (this.length() != that.length())
            throw new IllegalArgumentException("dimensions disagree");
        double sum = 0.0;
        for (int i = 0; i < n; i++)
            sum = sum + (this.data[i] * that.data[i]);
        return sum;
    }

    // return the Euclidean norm of this SpatialVector
    public double magnitude() {
        return Math.sqrt(this.dot(this));
    }

    // return the Euclidean distance between this and that
    public double distanceTo(SpatialVector that) {
        if (this.length() != that.length())
            throw new IllegalArgumentException("dimensions disagree");
        return this.minus(that).magnitude();
    }

    // return this + that
    public SpatialVector plus(SpatialVector that) {
        if (this.length() != that.length())
            throw new IllegalArgumentException("dimensions disagree");
        SpatialVector c = new SpatialVector(n);
        for (int i = 0; i < n; i++)
            c.data[i] = this.data[i] + that.data[i];
        return c;
    }

    // return this - that
    public SpatialVector minus(SpatialVector that) {
        if (this.length() != that.length())
            throw new IllegalArgumentException("dimensions disagree");
        SpatialVector c = new SpatialVector(n);
        for (int i = 0; i < n; i++)
            c.data[i] = this.data[i] - that.data[i];
        return c;
    }

    // return the corresponding coordinate
    public double cartesian(int i) {
        return data[i];
    }

    // create and return a new object whose value is (this * factor)
    public SpatialVector scale(double factor) {
        SpatialVector c = new SpatialVector(n);
        for (int i = 0; i < n; i++)
            c.data[i] = factor * data[i];
        return c;
    }


    // return the corresponding unit vector
    public SpatialVector direction() {
        if (this.magnitude() == 0.0)
            throw new ArithmeticException("zero-vector has no direction");
        return this.times(1.0 / this.magnitude());
    }

    // return a string representation of the vector
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append('(');
        for (int i = 0; i < n; i++) {
            s.append(data[i]);
            if (i < n-1) s.append(", ");
        }
        s.append(')');
        return s.toString();
    }


    // test client
    public static void main(String[] args) {
        double[] xdata = { 1.0, 2.0, 3.0, 4.0 };
        double[] ydata = { 5.0, 2.0, 4.0, 1.0 };

        SpatialVector x = new SpatialVector(xdata);
        SpatialVector y = new SpatialVector(ydata);

        StdOut.println("x        =  " + x);
        StdOut.println("y        =  " + y);
        StdOut.println("x + y    =  " + x.plus(y));
        StdOut.println("10x      =  " + x.times(10.0));
        StdOut.println("|x|      =  " + x.magnitude());
        StdOut.println("<x, y>   =  " + x.dot(y));
        StdOut.println("|x - y|  =  " + x.minus(y).magnitude());
    }
}

