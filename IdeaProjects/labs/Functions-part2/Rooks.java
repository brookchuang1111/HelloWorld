/*
 * Name:
 *
 * Description: 8-rooks problem.  You are given an 8x8 chess board.  Can you please
 * 8 rooks on the board such that no two rooks attack each other.
 * Two rooks attack each other if they are either in the same row or column.
 *
 */

public class Rooks {
    static boolean board[][];
    static int numSolutions;

    // Print a board with R denoting where the rooks are.
    static void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++)
                if (board[i][j])
                    System.out.print(" R ");
                else
                    System.out.print(" * ");
            System.out.println();
        }
    }

    // Returns true if the board is a valid configuration for the N rooks problem.
    static boolean isValidBoard() {
        // check if there are two rooks in the same row or column
        for (int i = 0; i < board.length; i++) {
            int numRooks = 0;
            for (int j = 0; j < board[i].length; j++)
                if (board[i][j]) {
                    // check if there are two rooks in the same row
                    numRooks++;
                    if (numRooks > 1)
                        return false;
                }
        }

        for (int i = 0; i < board.length; i++) {
            int numRooks = 0;
            for (int j = 0; j < board[i].length; j++)
                if (board[j][i]) {
                    // check if there are two rooks in the same column
                    numRooks++;
                    if (numRooks > 1)
                        return false;
                }
        }

        return true;

    }

    // Write a recursive function that solves the N-rooks problem.
    // Basic idea:
    //   -- we are called with the goal of placing a rook in a column.
    //   -- if the column is board.length, we have a valid config; print it.
    //   -- otherwise, loop over all the rows: start from row 0
    //      -- put the rook in board[i][rookColumn]
    //      -- if it is a valid configuration, recurse by trying to put a rook in rookColumn + 1
    //      -- remove the rook that put in board[i][rookColumn]
    static void solve(int rookColumn) {


    }

    public static void main(String args[]) {
        board = new boolean[8][8];
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                board[i][j] = false;
        solve(0);
        System.out.println("# of solutions: " + numSolutions);
    }
}