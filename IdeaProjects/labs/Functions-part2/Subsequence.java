/*
 * Name:
 *
 * Description:
 *
 */

/******************************************************************************
 *  Name:
 *
 *  Description: Print out all subsequences of the string s of length k.
 *
 *  Execution:    java Subsequence s k
 *
 *
 *  % java Subsequence abcd 3
 *  abc
 *  abd
 *  acd
 *  bcd
 *
 *  % java Subsequence abcc 3
 *  abc
 *  abc
 *  acc
 *  bcc
 *
 ******************************************************************************/

public class Subsequence {

    public static void subseq(String indent, String prefix, String remaining, int k) {
        StdOut.println(indent + " prefix: " + prefix + " remaining: " + remaining + " k: " + k);
        if (k == 0) {
            StdOut.println(indent + " -> Found subsequence: " + prefix);
            return;
        }
        if (remaining.length() == 0) return;

        // Grow prefix by peeling off one from remaining and adding to prefix
        subseq(indent + "\t", prefix + remaining.charAt(0), remaining.substring(1), k-1);
        // Keep same prefix, but peel off one from remaining
        subseq(indent + "\t", prefix, remaining.substring(1), k);
    }


    public static void main(String[] args) {
        String s = args[0];
        int k = Integer.parseInt(args[1]);
        subseq("", "", s, k);
    }

}
