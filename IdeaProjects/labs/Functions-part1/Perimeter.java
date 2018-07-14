/*
 * Name:
 *
 * Description: Calculates the perimeter of a triangle whose coordinates
 * are (0, 0), (xA, yA), and (xB, yB), where xA1, yA, xB, and yB
 * are integer commmand-line arguments.
 *
 * Example:
 * % java Perimeter 0 3 4 0
 * 12.0
 *
 */

public class Perimeter {
    // computes the square function (x^2)
    public static int square(int x) {
        return x * x;
    }

    // FILL ME IN: Write a method distance() which takes 4 values
    // (x1, y1) and (x2, y2) and returns a double which is the distance
    // between the two points.


    public static void main(String args[]) {
        int xA = Integer.parseInt(args[0]);
        int yA = Integer.parseInt(args[1]);
        int xB = Integer.parseInt(args[2]);
        int yB = Integer.parseInt(args[3]);

        double perimeter = 0;
        // Compute perimeter by taking the distance between sides
        // perimeter is the sum of side lengths.  Note that the input to the
        // program is the coordinates of two vertices; the third vertex is (0, 0).
        // perimeter = distance(xA, yA) + distance(xB, yB) + distance(xA - xB, yA - yB)


        StdOut.println(perimeter);
    }
}
