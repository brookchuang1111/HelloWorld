/*
 * Name:
 *
 * Description: Consider the following recursive function.
 *    f(n) = f(f(n-1)) + f(n-f(n-1)) for n > 2 and f(1) = f(2) = 1. Compute f(3).
 * The sequence you get is known as Conway's sequence
 * Write a Java program to compute the first 50 values of f(n) in the sequence. Use dynamic programming.
 * Conway's sequence has many interesting properties and connects with
 * Pascal's triangle, the Gaussian distribution, Fibonacci numbers, and Catalan numbers.
 *
 */

public class ConwaySequence {
    // TODO: write the recursive conwaySeq() method

    public static void main(String args[]) {
        // TODO: read in n; allocate an array to hold the values of the sequence
        // Initialize f[1], f[2]; for all other values, f[i] = Integer.MIN_INT
        // and whenever f[i] has the MIN_INT you know it has not been calculated.

    }
}