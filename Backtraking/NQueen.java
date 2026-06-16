// N-Queens Problem:
// Place N queens on an N × N chessboard such that no two queens
// attack each other. Queens cannot be in the same row, column,
// or diagonal.

import java.util.ArrayList;
import java.util.List;

public class NQueen {

    // Check whether a queen can be placed safely
    public boolean isSafe(int row, int col, char[][] board) {

        // Check row
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        r = row;
        for (int c = col; c < board.length && r >= 0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Check lower-left diagonal
        r = row;
        for (int c = col; c >= 0 && r < board.length; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Check lower-right diagonal
        r = row;
        for (int c = col; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    // Save a valid board configuration
    public void saveBoard(char[][] board, List<List<String>> allBoards) {

        String row = "";
        List<String> newBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {

            row = "";

            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }

            newBoard.add(row);
        }

        allBoards.add(newBoard);
    }

    // Try placing queens column by column
    public void helper(char[][] board, List<List<String>> allBoards, int col) {

        // All queens have been placed
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {

            if (isSafe(row, col, board)) {

                // Place queen
                board[row][col] = 'Q';

                // Recur for next column
                helper(board, allBoards, col + 1);

                // Backtrack
                board[row][col] = '.';
            }
        }
    }

    // Solve the N-Queens problem
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> allBoards = new ArrayList<>();

        char[][] board = new char[n][n];

        helper(board, allBoards, 0);

        return allBoards;
    }

    public static void main(String[] args) {

        NQueen obj = new NQueen();

        // Find all solutions for 4 queens
        List<List<String>> result = obj.solveNQueens(4);

        System.out.println(result);
    }
}