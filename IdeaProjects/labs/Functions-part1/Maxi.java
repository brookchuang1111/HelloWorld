/*
 * Name:
 *
 * Description: Maxi takes three integer command-line arguments, finds the
 *               maximum value, converts the three integer to quotients,
 *               and finds the maximum of those quotients.
 *
 *               What is the output of this code?
 *
 *  Remarks:  Notice that both functions have the same name.
 *    -- How does Java know which max3() you mean when you call max3(1, 2, 3)?
 *    -- What would happen if you called max3(1, 2, 3.0)?
 *
 */

public class Maxi {

    // Write two functions:
    //  1. max3() which takes 3 integers as argument and returns their max
    //  2. max3() which takes 3 doubles as argument and returns their max

    public static void main(String args[]) {
        // parse three command-line argument
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        // DELETE the following line
        int largest = 1;

        // call the function max3(a, b, c) to find the largest
        // int largest = max3(num1, num2, num3);



        // make three quotients with largest as the denominator
        double q1 = (double) num1 / largest;
        double q2 = (double) num2 / largest;
        double q3 = (double) num3 / largest;

        // print the largest quotient
        // StdOut.println(max3(q1, q2, q3));


    }
}