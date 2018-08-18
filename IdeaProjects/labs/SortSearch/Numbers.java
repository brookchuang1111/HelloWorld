/*
 * Name:
 *
 * Description: More praactice with Comparators and Sorting.
 *
 * 1. Define a Comparator on Integers which does reverse ordering (i.e.,
 * order numbers in descending order).
 *
 * 2. Define a Comparator on Integers which sorts odds before
 * evens with odd numbers in order within the first section and
 * even numbers in order within the second section.
 *
 */

import java.util.Arrays;
import java.util.Comparator;

public class Numbers {


  // TODO: Write DescendingOrder comparator to the above spec.

  // TODO: Write OddsThenEvens comparator to the above spec.

  public static void main(String args[]){
    Comparator<Integer> dec = new DescendingOrder();
    Integer a[];

    a = new Integer[]{3, 4, 5, 6, 7, 8};
    System.out.println(Arrays.toString(a));
    Arrays.sort(a,dec);
    System.out.printf("%s\n\n",Arrays.toString(a));

    a = new Integer[]{12, 15, -8, 45, 32, 39, 56, 98};
    System.out.println(Arrays.toString(a));
    Arrays.sort(a,dec);
    System.out.printf("%s\n\n",Arrays.toString(a));

    Comparator<Integer> cmp = new OddsThenEvens();
    a = new Integer[]{4, 5, 9, 2, 3, 1, 8};
    System.out.println(Arrays.toString(a));
    Arrays.sort(a,cmp);
    System.out.printf("%s\n\n",Arrays.toString(a));
    // [1, 3, 5, 9, 2, 4, 8]
    a = new Integer[]{2048, 1024, 5096, 128, 9999};
    System.out.println(Arrays.toString(a));
    Arrays.sort(a,cmp);
    System.out.printf("%s\n\n",Arrays.toString(a));
    // [9999, 128, 1024, 2048, 5096]
  }

}
