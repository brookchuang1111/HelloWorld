/******************************************************************************
 *
 *  Name:
 *
 *  Description: Coupon collector simulation written using functions.
 *
 *  Execution:    java Coupon n
 *
 *  % java Coupon 1000
 *  6522
 *
 *  % java Coupon 1000
 *  6481
 *
 *  % java Coupon 1000000
 *  12783771
 *
 ******************************************************************************/

public class Coupon {

    // return a random coupon between 0 and n-1
    public static int getCoupon(int n) {
        // FILL ME IN.  Delete the following line and fix.
        return -1;
    }

    // return number of cards you collect before obtaining one of each of the n types
    public static int collect(int n) {
        boolean[] isCollected = new boolean[n];  // isCollected[i] = true if card type i already collected
        int count = 0;                           // number of cards collected
        int distinct  = 0;                       // number of distinct card types collected

        // FILL ME IN:
        // repeat until you've collected all n card types
        //  -- select a card by calling getCoupon()
        //  -- if the card has been collected, update count
        //  -- if you are seeing the card for the first time, update isCollected,
        //      distinct, and count.

        return count;
    }

    // test client
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int count = collect(n);
        StdOut.println(count);
    }
}