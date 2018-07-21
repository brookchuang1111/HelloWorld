/*
 * Name:
 *
 * Description:   A derangement is a permutation p[] of the integers from 0 to N-1
 * such that p[i] doesn't equal i for any i.
 * For example there are 9 derangements when N = 4: 1032, 1230, 1302, 2031, 2301, 2310, 3012, 3201, 3210.
 *
 * Write a program to count the number of derangements of size N using the following recurrence:
 *   d[N] = (N-1) (d[N-1] + d[N-2]), where
 *    d[1] = 0, d[2] = 1.
 * The first few terms are 0, 1, 2, 9, 44, 265, 1854, 14833, 133496, and 1334961.
 *
 */

public class Derangements {
    // TODO: Solve this problem using dynamic programming
    // write a recursive derangements function

    public static void main(String args[]) {

        // TODO: Read in n, allocate an array to hold the values
        // initialize the array with -1, so that when examine the array contents
        // in the recursive function you can check d[i] == -1 means you haven't yet
        // computed that value.
    }
}