package rvt;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner skeneris = new Scanner(System.in);

        System.out.print("Ievadi atzimi: ");
        Integer marking = skeneris.nextInt();

        if (marking == 100){
            System.out.println("Dabuju 100%!");
        }

        else if (marking >= 90) {
            System.out.println("Tu dabuji 5!");
        }

        else if (marking >= 80) {
            System.out.println("Tu dabuji 4!");
        }

        else if (marking >= 70) {
            System.out.println("Tu dabuji 3!");
        }

        else if (marking >= 60) {
            System.out.println("Tu dabuji 2!");
        }

        else if (marking >= 50) {
            System.out.println("Tu dabuji 1!");
        }

        else if (marking <= 49) {
            System.out.println("failed");
        }

        else if (marking == 0) {
            System.out.println("impossible");
        }

    }
}
