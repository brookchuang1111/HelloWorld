/*
 * Name:
 *
 * Description: Read in a dictionary of misspellings pairs from the file
 *  misspellings.txt and fix the misspelled words in document.txt.
 *
 *  % more misspellings.txt
 *  aberation (aberration)
 *  abondon (abandon)
 *  abondoned (abandoned)
 *  abondons (abandons)
 *  ...
 *  alot (a lot)
 *  ...
 *
 *
 *  % more document.txt
 *  call me ishmael smoe yersa ago never mind how long precisely
 *  hvaing littel or no moeny in my purse
 *  and nothing pariticular to intrest me
 *
 *  % java SpellCorrector misspellings.txt document.txt
 *  call me ishmael (some) (years) ago never mind how long precisely
 *  (having) (little) or no (money) in my purse
 *  and nothing pariticular to (interest) me
 *
 */

import java.util.Scanner;

public class SpellCorrector {
  public static void main(String[] args) {
    // Declare a TreeMap to store the misspellings -> correction mapping


    // read in dictionary of misspelllings
    Scanner ___;

    // TODO: Read in the dictionary

    // read lines from file and correct misspelled words
    // (replaces sequences of whitespace with single space, but preserves newlines)
    // TODO: fill this in
    Scanner ___;
    while (___) {
      String line = in2.readLine().trim();
      String[] words = line.split("\\s+");
      // Loop over the words and correct misspelling: if a word is misspelled, you
      // will find the correction in the dictionary; otherwise, assume the word is spelled correctly.

      StdOut.println();
    }
  }
}
