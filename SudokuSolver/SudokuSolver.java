// Sudoku Solver:
// Solve a Sudoku puzzle using Backtracking.
// Each number must appear only once in every row,
// column, and 3×3 grid.

public class SudokuSolver {

    // Check whether a number can be placed safely
    public boolean isSafe(char[][] board, int row, int col, int number) {

        // Check column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
        }

        // Check row
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == (char) (number + '0')) {
                return false;
            }
        }

        // Find starting position of the 3×3 grid
        int sr = 3 * (row / 3);
        int sc = 3 * (col / 3);

        // Check 3×3 grid
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }

        return true;
    }

    // Recursive backtracking function
    public boolean helper(char[][] board, int row, int col) {

        // Base case: puzzle solved
        if (row == board.length) {
            return true;
        }

        int nrow = 0;
        int ncol = 0;

        // Move to next cell
        if (col == board.length - 1) {
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = row;
            ncol = col + 1;
        }

        // Skip already filled cells
        if (board[row][col] != '.') {

            if (helper(board, nrow, ncol)) {
                return true;
            }

        } else {

            // Try numbers 1 to 9
            for (int i = 1; i <= 9; i++) {

                if (isSafe(board, row, col, i)) {

                    // Place number
                    board[row][col] = (char) (i + '0');

                    // Recur for next cell
                    if (helper(board, nrow, ncol))
                        return true;
                    else
                        // Backtrack
                        board[row][col] = '.';
                }
            }
        }

        return false;
    }

    // Start solving Sudoku
    public boolean solveSudoku(char[][] board) {
        return helper(board, 0, 0);
    }

    // Print Sudoku board
    public void printBoard(char[][] board) {

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        SudokuSolver solver = new SudokuSolver();

        System.out.println("Original board:");
        solver.printBoard(board);

        // Solve and print the result
        if (solver.solveSudoku(board)) {

            System.out.println("\nSolved board:");
            solver.printBoard(board);

        } else {

            System.out.println("No solution exists!");
        }
    }
}