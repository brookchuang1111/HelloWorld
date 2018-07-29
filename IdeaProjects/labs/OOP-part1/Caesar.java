/*
 * Name:
 *
 * Description: Simple program that uses Caesar shift of 1 to encode/
 * decode strings.  With Caesar shift of 1, we have:
 *   Encode: A maps to B, B maps to C, ..., Z maps to A
 *   Decode; Z maps to A, ..., C maps to B, B maps to A, A maps to Z.
 *
 */

public class Caesar {
  // TODO: Iterate character by character and encode by Caesar shift of 1.
  static String encode(String message) {}

  // TODO: Iterate character by character and decode by Caesar shift of 1.
  static String decode(String message) {}

  public static void main(String args[]) {

    System.out.println("Encoded message: " + encode(args[0]));
    System.out.println("Decoded message: " + decode(encode(args[0])));
  }
}
