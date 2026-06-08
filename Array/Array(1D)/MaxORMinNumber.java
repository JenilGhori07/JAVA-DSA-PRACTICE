// Find the maximum & minimum number in an array of integers. 


import java.util.Scanner;

public class MaxORMinNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Array: ");
        int size = sc.nextInt();

        int[] Numbers = new int[size];

        // Take array elements as input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the Number: ");
            Numbers[i] = sc.nextInt();
        }

        // Assume first element is both maximum and minimum
        int Max = Numbers[0];
        int Min = Numbers[0];

        // Compare remaining elements with current Max and Min
        for (int i = 1; i < Numbers.length; i++) {
            if (Numbers[i] > Max) {
                Max = Numbers[i];
            }

            if (Numbers[i] < Min) {
                Min = Numbers[i];
            }
        }

        System.out.println("Max Value: " + Max);
        System.out.println("Min Value: " + Min);

        sc.close();
    }
}