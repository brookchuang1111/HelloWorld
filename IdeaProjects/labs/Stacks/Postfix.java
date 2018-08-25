/*
 * Name:
 *
 * Description: Implement a Postfix calculator (aka Reverse Polish Notation).
 * In this notation, the operator comes after the operands.
 * 1 2 3 + 4 5 * * +
 *
 * Is equivalent to: ( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )
 *
 * Hint: use Java's LinkedList as your Stack implementation.
 *
 */

public class Postfix {

  public static void main(String args[]) {

    String expression = new String("1 2 3 + 4 5 * * +");

    /*
     * once you get this working, here are other inputs to try
     * 3 4 5 + *
     * 1 2 3 4 5 * + 6 * * +
     * 7 16 16 16 * * * 5 16 16 * * 3 16 * 1 + + +
     * 7 16 * 5 + 16 * 3 + 16 * 1 +
     *
     */



    // TODO: split the expression into an array of tokens with space as the delimiter

    // TODO: Stack of operands
    __________ operands = ______;
    String operators = "+-*/";

    // TODO: Loop over the tokens and solve!

    // Print out the result
    System.out.println("Result: " + ______);
  }
}
