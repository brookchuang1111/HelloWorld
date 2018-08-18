/*
 * Name:
 *
 * Description: The goal of this lab is to familiarize yourself with Comparable/Comparator
 * interfaces in Java, and then use Arrays.search(), Arrays.sort() to search/sort a list
 * of objects.
 *
 * The input to this program is a file containing the names of NHL teams and their records.
 * The first line of the file has a single number, N, that specifies the # of teams in this file.
 * <N>
 * Each of the next <N> lines are formatted as follows:
 *
 * <team name>,<W-L-D>
 *
 * Use the Scanner class to read in the input and construct an Array of Team object.
 *
 * For team, you can compute the # of points the team has accumulated over the season using
 * the following weighting:
 *  3 points for each win;
 *  1 point for each draw;
 *  0 points for each loss
 *
 */

import java.util.Comparator;

public class NHLTeams {

  // Order teams by their W-L-D record, breaking ties based on team name.
  public class Team implements Comparable<Team> {

    Team(String name, int win, int loss, int draw) {

    }



  }

  //
  // TODO: Compare teams by name.  The comparison is lexicographic.
  // Feel free to use String's compareToIgnoreCase
  //
  public class TeamnameComparator implements Comparator<Team> {

  }

  public static void main(String args[]) {

    // TODO: use a Scanner to read in the file, where args[0] is the filename

    // TODO: Read line and split the string on "," to get two parts:
    // (1) Part 1 is the team name
    // (2) Part 2 is the team record.  Split this on a "-" and extract 3 integers

    // TODO: Sort the array using Arrays.sort()

    // TODO: Print out the result and teams should be ordered by points

    // TODO: Sort the array using Arrays.sort( ..., new TeamnameComparator())
    // and give it the team name comparator, so we can order teams by name.

    // TODO: Print out the result and teams should be lexicographically ordered.

    // TODO: Search for some teams using Arrays.binarySearch(..., new TeamnameComparator())
  }
}
