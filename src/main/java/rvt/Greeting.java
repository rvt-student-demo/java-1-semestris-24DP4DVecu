package rvt;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ierakstiet savu vardu: ");

        String message = scanner.nextLine();
        System.out.println("Hi " + message + "!");
    } 
}

