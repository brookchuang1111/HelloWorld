/*
 * Name:
 *
 * Description:
 *
 */

public class Binary {
        public static String convert(int n, String space) {
            if (n == 0) return "0";
            if (n == 1) return "1";
            System.out.println(space + "Recursion (n = " + n + "): Calling convert on: " + n / 2 + " and last bit of " + n + " is: " + (n % 2));
            String s = convert(n / 2, space + "\t") + (n % 2);
            System.out.println(space + "Recursion (n = " + n + "): returned: " + s);
            return s;
        }

        public static void main(String args[]) {
            int n = Integer.parseInt(args[0]);
            System.out.println("Calling convert of: " + n);
            System.out.println("----");
            System.out.println(convert(n, ""));

    }
}