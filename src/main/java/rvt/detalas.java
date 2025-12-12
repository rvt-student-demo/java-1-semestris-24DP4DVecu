package rvt;
import java.util.Scanner;

public class detalas {
    
    private static final int BOLT_PRICE = 5;      
    private static final int NUT_PRICE = 3;      
    private static final int WASHER_PRICE = 1;    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Skruvju skaits: ");
        int skruves = sc.nextInt();

        System.out.print("Uzgrieznu skaits: ");
        int uzgriezni = sc.nextInt();

        System.out.print("Paplaksnu skaits: ");
        int paplaksnes = sc.nextInt();

        
        boolean irKluda = false;

        if (uzgriezni < skruves) {
            System.out.println("Parbaudi pasutijumu: par maz uzgrieznu");
            irKluda = true;
        }

        if (paplaksnes < 2 * skruves) {
            System.out.println("Parbaudi pasutijumu: par maz paplaksnu");
            irKluda = true;
        }

        if (!irKluda) {
            System.out.println("Pasutijums ir kartiba.");
        }

        int kopejaCena = skruves * BOLT_PRICE
                       + uzgriezni * NUT_PRICE
                       + paplaksnes * WASHER_PRICE;

        System.out.println("Kopeja cena: " + kopejaCena);
        sc.close();
    }
}