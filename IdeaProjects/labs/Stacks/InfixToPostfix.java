/******************************************************************************
 *  Compilation:  javac InfixToPostfix.java
 *  Execution:    java InfixToPostfix
 *
 *  Reads in an infix expression and outputs an equivalent postfix
 *  expression.
 *
 *  Windows users: replace <Ctrl-d> with <Ctrl-z> so signify end of file.
 * 
 *  % java InfixToPostfix
 *  ( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )
 *  <Ctrl-d>
 *  2 3 4 + 5 6 * * + 
 *
 *
 ******************************************************************************/

public class InfixToPostfix {
    public static void main(String[] args) {
	// TODO: Declare a stack

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();

	    /*
	     * Algorithm:
	     *  -- If you see "(", skip it;
	     *  -- If you see an operator push on the stack.
	     *  -- If you see a ")", pop from the stack and print out operator + " "
	     *  -- anything else, just print it + " "
	     * Try this algorithm on: 
	     *     ( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )
	     */

	     // TODO: Fill in code based on the above algorithm
        }
        StdOut.println();
    }
}
