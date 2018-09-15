/*
 * Name:
 *
 * Description:  Read in a dictionary of words from the file words.txt, and print
 *  out any misspelled words that appear on standard input.
 *
 * Usage: java SpellChecker data/SymbolTables/words.txt
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class SpellChecker {
  public static void main(String[] args) throws FileNotFoundException {
    HashSet<String> dictionary = new HashSet<String>();

    Scanner input = new Scanner(new File(args[0]));
    // read in dictionary of words
    while (input.___) {
      String word = input.___;
      dictionary.___;
    }
    StdOut.println("Done reading dictionary");

    // read strings from standard input and print out if not in dictionary
    StdOut.println("Enter words, and I'll print out the misspelled ones");
    while (!StdIn.isEmpty()) {
      String word = StdIn.readString();
      if (!dictionary.___) StdOut.println(word);
    }
  }
}
