import java.util.ArrayList;
import java.util.Scanner;

public class Chapter40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Camry");
        cars.add("Camaro");
        cars.add("Benz");
        cars.add("Caprice");
        cars.add("Sonata");

        ArrayList<String> info = new ArrayList<String>();
        info.add("Gads: 1999\nMake: Camry\nModel: Camry one");
        info.add("Gads: 1981\nMake: Camaro\nModel: Camaro sinkos");
        info.add("Gads: 1971\nMake: Benz\nModel: Benz uno");
        info.add("Gads: 1922\nMake: Caprice\nModel: Caprice dwas");
        info.add("Gads: 1945\nMake: Sonata\nModel: Sonata tres");

        System.out.print("Ievadi masinas marku: ");
        String ievade = scanner.nextLine();

        if (ievade == "Camry") {
            System.out.println(info.get(0));
        }

        else if (ievade == "Camaro") {
            System.out.println(info.get(1));
        }

        else if (ievade == "Benz") {
            System.out.println(info.get(2));
        }

        else if (ievade == "Caprice") {
            System.out.println(info.get(3));
        }

        else if (ievade == "Sonata") {
            System.out.println(info.get(4));
        }
    }
}
