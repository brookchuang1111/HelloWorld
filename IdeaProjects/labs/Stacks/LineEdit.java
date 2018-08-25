/*************************************************************************
 * Name:
 *
 * Description: This class allows you to do and undo two String
 * operations: append() and replace().
 *
 * Examples:
 * % java LineEdit 
 * COS ROCKS
 * COS ROX
 * COS ROX!!
 * COS ROX
 * COS ROCKS
 *
 * Hint: Think Stack operations.
 *************************************************************************/

public class LineEdit {
   // instance variables


   
   
   // create a new LineEdit with given initial text
   public LineEdit(String text) {


   }
   
   // get the current state of the editor
   public String toString() {


   }
   
   // add the given text at the end of the line
   public void append(String text) {



   }
   
   // replace all occurrences of "from" with "to"
   public void replace(String from, String to) {



   }
   
   // undo the latest append/replace operation that hasn't already been undone
   public void undo() {



   }
   
   // test client
   public static void main(String[] args) {
      LineEdit line = new LineEdit("COS ROCKS");
      System.out.println(line);
   
      line.replace("CKS", "X");
      System.out.println(line);
   
      line.append("!!");
      System.out.println(line);
      
      line.undo();
      System.out.println(line);
   
      line.undo();
      System.out.println(line);
   }
}
