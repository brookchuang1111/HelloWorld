/*
 * Name:
 *
 * Description:
 *
 */


/******************************************************************************
 *  Compilation:  javac Complex.java
 *  Execution:    java Complex
 *
 *  Data type for complex numbers.
 *
 *  The data type is "immutable" so once you create and initialize
 *  a Complex object, you cannot change it. The "final" keyword
 *  when declaring re and im enforces this rule, making it a
 *  compile-time error to change the .re or .im instance variables after
 *  they've been initialized.
 *
 *  % java Complex
 *  a            = 5.0 + 6.0i
 *  b            = -3.0 + 4.0i
 *  Re(a)        = 5.0
 *  Im(a)        = 6.0
 *  b + a        = 2.0 + 10.0i
 *  a - b        = 8.0 + 2.0i
 *  a * b        = -39.0 + 2.0i
 *  b * a        = -39.0 + 2.0i
 *  a / b        = 0.36 - 1.52i
 *  (a / b) * b  = 5.0 + 6.0i
 *  conj(a)      = 5.0 - 6.0i
 *  |a|          = 7.810249675906654
 *  tan(a)       = -6.685231390246571E-6 + 1.0000103108981198i
 *
 ******************************************************************************/

import java.util.Objects;

public class Complex {
    // TODO: Fill in the ADT.

    // sample client for testing
    public static void main(String[] args) {
        Complex a = new Complex(5.0, 6.0);
        Complex b = new Complex(-3.0, 4.0);

        StdOut.println("a            = " + a);
        StdOut.println("b            = " + b);
        StdOut.println("Re(a)        = " + a.re());
        StdOut.println("Im(a)        = " + a.im());
        StdOut.println("b + a        = " + b.plus(a));
        StdOut.println("a + b        = " + a.plus(b));
        StdOut.println("a * b        = " + a.times(b));
        StdOut.println("b * a        = " + b.times(a));
        StdOut.println("|a|          = " + a.abs());
    }

}
