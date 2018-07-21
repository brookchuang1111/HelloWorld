/*
 * Name:
 *
 * Description: Reads two commandline parameters p and q and computes the greatest
 *  common divisor of p and q using the binary gcd algorithm.
 *  The algorithm: gcd(p, q) =
 *     p if q = 0
 *     q if p = 0
 *     2 * gcd(p/2, q/2) if p and q are even
 *     gcd(p/2, q) if p is even and q is odd
 *     gcd(p, q/2) if p is odd and q is even
 *     gcd((p-q)/2, q) if p and q are odd and p >= q
 *     gcd(p, (q-p)/2) if p and q are odd and p < q
 *
 *  Execution:    java BinaryGCD p q
 *
 * Hints:
 *  - p / 2 is same as p >> 1
 *  - p * 2 is same as p << 1
 *  - p & 1 == 0 is true if p is even (look at the least significant bit)
 *  - p & 1 == 1 is true if p is odd
 */

public class BinaryGCD {
    public static void main(String args[]) {

    }
}