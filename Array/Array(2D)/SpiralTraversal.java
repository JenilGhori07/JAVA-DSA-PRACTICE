// Spiral Traversal:
// A technique used to print all elements of a matrix in a spiral pattern,
// starting from the outer layer and moving inward in clockwise order.

import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // Take matrix input from user
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the elements: ");
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Spiral Order Matrix is:");

        // Boundaries of the current layer
        int OP = 0;        // Top row         OP = One Position
        int SP = rows - 1; // Bottom row      SP = Second Position
        int TP = 0;        // Left column     TP = Third Position
        int FP = cols - 1; // Right column    FP = Forth Position

        // Continue until all layers are traversed
        while (OP <= SP && TP <= FP) {

            // Print top row (left → right)
            for (int col = TP; col <= FP; col++) {
                System.out.print(numbers[OP][col] + " ");
            }
            OP++;

            // Print right column (top → bottom)
            for (int row = OP; row <= SP; row++) {
                System.out.print(numbers[row][FP] + " ");
            }
            FP--;

            // Print bottom row (right → left)
            for (int col = FP; col >= TP; col--) {
                System.out.print(numbers[SP][col] + " ");
            }
            SP--;

            // Print left column (bottom → top)
            for (int row = SP; row >= OP; row--) {
                System.out.print(numbers[row][TP] + " ");
            }
            TP++;
        }

        sc.close();
    }
}