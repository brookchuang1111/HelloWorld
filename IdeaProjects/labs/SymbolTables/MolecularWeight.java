/*
 * Name:
 *
 * Description: Reads in a list of elements and their molecular weights.
 *  Prompts the user for the molecular description of a chemical
 *  formula and prints out its molecular weight.
 *
 *  % java MolecularWeight data/SymbolTables/elements.csv
 *  H2.O
 *  Molecular weight of H2.O = 18.020000
 *  N.H4.N.O3
 *  Molecular weight of N.H4.N.O3 = 80.060000
 *
 */

import java.io.File;
import java.util.Scanner;

public class MolecularWeight {
  public static void main(String[] args) {

    // symbol table whose key = element symbol and value = molecular weight
    ___ st = ___;

    // read in elements symbols and their atomic weights
    Scanner input = new Scanner(new File(args[0]));
    while (___) {
      String line = ___;
      String[] fields = line.split(",");
      String symbol = fields[2];
      double weight = Double.parseDouble(fields[3]);
      // add this to the ST
    }

    // read in chemical formulas from stdin, and print out molecular weight
    while (StdIn.hasNextLine()) {
      double total = 0.0;
      String line = StdIn.readLine();
      // TODO: Split the firelds on the "."
      String[] fields = line.split(___);
      for (int i = 0; i < fields.length; i++) {

        // TODO: parse Si5 into element and number of atoms
        int j;
        for (j = 0; j < fields[i].length(); j++) {
          if (Character.isDigit(fields[i].charAt(j))) break;
        }

        // 0..j is the symbol; whatever is after is atoms; so, use substring to get the two
        String symbol = ___;

        // TODO: look in the ST for the symbol's weight

        // add weight to running total
        String atoms = ___;

        // TODO: If the atom string is empty, we add weight to the total; otherwise, multiply weight by # of atoms

      }


      StdOut.printf("Molecular weight of %s = %f\n", line, total);
    }


  }
}