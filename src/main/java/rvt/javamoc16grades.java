package rvt;
import java.util.Scanner;

public class javamoc16grades {
    public static void main(String[] args){
        Scanner atzime = new Scanner(System.in);

        System.out.print("Input a grade: ");
        Integer marking = atzime.nextInt();
        
        if(marking == 100){
            System.out.println("Great you scored 100%");
        }

        else if (marking >= 90) {
            System.out.println("Nice you scored" + marking + "%");

        }

        else if (marking >= 80) {
            System.out.println("Nice you scored " + marking + "%");
        }

        else if (marking >= 70) {
            System.out.println("Nice you scored " + marking + "%");
        }

        else if (marking >= 60) {
            System.out.println("Nice you scored " + marking + "%");
        }

        else if (marking >= 50) {
            System.out.println("Nice you scored " + marking + "%");
        }

        else {
            System.out.println("You Failed! Scored below 50%!");
        }
    }
}
