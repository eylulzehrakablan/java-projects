//a Java program that prints the lesser one of two integers (entered by the user).

import java.util.Scanner;

public class SmallerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1, number2;
        String status;

        while (true) {
            System.out.print("Enter the first integer number, please: ");
            if (scanner.hasNextInt()) {
                number1 = scanner.nextInt();
                break;
            } else {
                System.out.println("ERROR: Please enter an invalid integer value.");
                scanner.next();
            }
        }

        while (true) {
            System.out.print("Enter the second integer number, please: ");
            if (scanner.hasNextInt()) {
                number2 = scanner.nextInt();
                break;
            } else {
                System.out.println("ERROR: Please enter an invalid integer value.");
                scanner.next();
            }
        }

        if (number1 < number2) {
            status = "The smaller number is: " + number1;
        } else if (number2 > number2) {
            status = "The smaller number is: " + number2;
        } else {
            status = "The numbers are equal to each other.";
        }

        System.out.print(status);

        scanner.close();
    }
}