package Dividing;

public class Dividing3 {
    public static void main(String [] args) {
        greet(1);
        System.out.println("");
        greet(3);
    }

    public static void greet(int numOfTimes) {
        int i = 0;
        while (i < numOfTimes) {
            System.out.println("Greetings!");
            i++;
        }
    }
}
