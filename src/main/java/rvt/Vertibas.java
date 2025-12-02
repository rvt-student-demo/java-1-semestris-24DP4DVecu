import java.util.Scanner;

public class Vertibas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi produktu skaitu: ");
        int value = Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadi produktu nosaukumu: ");
        String nosaukums = scanner.nextLine();
        
        System.out.println("Produkta cena: ");
        double pieejams = Double.valueOf(scanner.nextLine());

    

        System.out.println("Produktu skaits: " + value);
        System.out.println("Produkta nosaukums: " + nosaukums);
        System.out.println("Produktu cena: " + pieejams);
        

        System.out.println("Kopejais: " + (value * pieejams));
    }
}
