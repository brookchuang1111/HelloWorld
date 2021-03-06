/******************************************************************************
 *
 *  Name:
 *
 *  Execution:    java -Xmx1100m PrimeSieve n
 *
 *  Description: Computes the number of primes less than or equal to n using
 *  the Sieve of Eratosthenes.
 *
 *  % java PrimeSieve 25
 *  The number of primes <= 25 is 9
 *
 *  % java PrimeSieve 100
 *  The number of primes <= 100 is 25
 *
 *  % java -Xmx100m PrimeSieve 100000000
 *  The number of primes <= 100000000 is 5761455
 *
 *  % java PrimeSieve -Xmx1100m 1000000000
 *  The number of primes <= 1000000000 is 50847534
 *
 *
 *  The 110MB and 1100MB is the amount of memory you want to allocate
 *  to the program. If your computer has less, make this number smaller,
 *  but it may prevent you from solving the problem for very large
 *  values of n.
 *
 *
 *                  n     Primes <= n
 *  ---------------------------------
 *                 10               4
 *                100              25
 *              1,000             168
 *             10,000           1,229
 *            100,000           9,592
 *          1,000,000          78,498
 *         10,000,000         664,579
 *        100,000,000       5,761,455
 *      1,000,000,000      50,847,534
 *
 ******************************************************************************/


public class PrimeSieve {


    // FILL ME IN:
    // write countPrimes(), which returns the # of primes.  The function
    // takes in n and isPrime[] as arguments.


    // mark non-primes <= n using Sieve of Eratosthenes
    static void markNonPrimes(int n, boolean[] isPrime) {
        for (int factor = 2; factor*factor <= n; factor++) {

            // if factor is prime, then mark multiples of factor as nonprime
            // suffices to consider multiples factor, factor+1, ...,  n/factor
            if (isPrime[factor]) {
                // FILL ME IN: Iterate over multiples of factor and mark them as "false"

            }
        }

    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        // Allocate memory for isPrime
        boolean[] isPrime = new boolean[n + 1];

        // FILL ME IN: Initialize entries of isPrime to true

        // mark non-primes <= n using Sieve of Eratosthenes
        markNonPrimes(n, isPrime);

        // FILL ME IN: Uncomment the following two lines and write countPrimes function.
        // int primes = countPrimes(n, isPrime);
        // System.out.println("The number of primes <= " + n + " is " + primes);
    }
}
