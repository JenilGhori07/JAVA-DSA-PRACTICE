// 2D Array Searching: It is the process of finding a specific element
// in a matrix and displaying its row and column position.

import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int row = sc.nextInt();

        System.out.print("Enter columns: ");
        int col = sc.nextInt();

        int[][] numbers = new int[row][col];

        // Take matrix input from user
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter Numbers: ");
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        // Search for x in the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (numbers[i][j] == x) {
                    System.out.print("Found at: (" + i + "," + j + ")");
                }
            }
        }

        sc.close();
    }
}