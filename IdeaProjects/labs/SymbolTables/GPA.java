/*
 * Name:
 *
 * Description: Compute GPA by reading letter grades from standard input.
 * Illustrates get/put APIs of a Symbol table.
 *
 * % java GPA
 *  A A A A A
 *  ctl-d            (ctl-z for windows)
 *  4.0
 */


import java.util.HashMap;

public class GPA {
  public static void main(String[] args) {
    String[] letters = { "A+", "A",  "A-", "B+", "B",  "B-", "C+", "C",  "C-", "D",  "F"  };
    double[] grades =  { 4.33, 4.00, 3.67, 3.33, 3.00, 2.67, 2.33, 2.00, 1.67, 1.00, 0.00 };

    // build the symbol table: mapping from letters to grades
    HashMap<String, Double> letterGrades = new HashMap<String, Double>();
    for (int i = 0; i < letters.length; i++) {
      letterGrades.___;
    }

    // Read list of letter grades and compute GPA
    double sum = 0.0;
    int count = 0;
    while (!StdIn.isEmpty()) {
      String grade = StdIn.readString();
      double num = letterGrades.___;
      sum += num;
      count++;
    }
    // average out the grades
    double gpa = ___;
    StdOut.println(gpa);
  }
}
