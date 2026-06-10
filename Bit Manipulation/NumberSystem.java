// Number System Conversion:
// Decimal to Binary converts a base-10 number into base-2.
// Binary to Decimal converts a base-2 number into base-10.

import java.util.Scanner;

public class NumberSystem {

    // Convert Decimal Number to Binary Number
    public static void decimalToBinary(int n) {

        int binary = 0;
        int place = 1;

        while (n > 0) {

            int rem = n % 2;

            binary = binary + (rem * place);

            place = place * 10;

            n = n / 2;
        }

        System.out.println("Binary Number: " + binary);
    }

    // Convert Binary Number to Decimal Number
    public static void binaryToDecimal(int n) {

        int decimal = 0;
        int power = 0;

        while (n > 0) {

            int lastDigit = n % 10;

            decimal = decimal + (lastDigit * (int) Math.pow(2, power));

            power++;

            n = n / 10;
        }

        System.out.println("Decimal Number: " + decimal);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number: ");
        int decimal = sc.nextInt();

        decimalToBinary(decimal);

        System.out.print("Enter Binary Number: ");
        int binary = sc.nextInt();

        binaryToDecimal(binary);

        sc.close();
    }
}