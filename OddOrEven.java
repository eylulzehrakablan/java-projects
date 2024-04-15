//a Java program that prints if an integer (entered by the user) is odd or even.

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        String status;

        while(true) {
            System.out.print("Enter an integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            } else {
                System.out.println("ERROR: invalid value. Please enter an integer value.");
                scanner.next();
            }
        }

        if (number % 2 == 0) {
            status = "EVEN";
        } else {
            status = "ODD";
        }

        System.out.println("Your integer is: \"" + status + "\".");

        scanner.close();
    }
}