package rvt;

import java.util.Scanner;

public class GiftTax {
    public static void main(String [] args) {
        Scanner skeneris = new Scanner(System.in);

        System.out.print("Ievadi atzimi: ");
        double giftValue = scanner.nextDouble();

        double tax = calculateGiftTax(giftValue);
        System.out.printf("Dāvinājuma nodoklis ir: %.2f $\n", tax);
    }

    public static double calculateGiftTax(double value) {
        if (value < 5000) {
            return 0;
        }
    }
}
