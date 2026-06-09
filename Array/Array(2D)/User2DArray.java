// 2D Array: A 2D array is a collection of elements arranged in rows and columns.

import java.util.Scanner;

public class User2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int row = sc.nextInt();

        System.out.print("Enter columns: ");
        int col = sc.nextInt();

        int[][] numbers = new int[row][col];

        // Take input for all elements of the 2D array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter Numbers: ");
                numbers[i][j] = sc.nextInt();
            }
        }

        // Print the 2D array in matrix form
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}