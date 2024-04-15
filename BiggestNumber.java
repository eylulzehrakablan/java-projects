//a Java program that prints the biggest one of ten integers (entered by the user).

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Please enter the " + (i + 1) + ". number: ");
            while (true) {
                if (scanner.hasNextInt()) {
                    numbers[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("ERROR: You've entered an invalid value. Please enter again.");
                    scanner.next();
                }
            }
        }

        int biggest = numbers[0];
        for (int i = 1; i < 10; i++) {
            if (numbers[i] > biggest) {
                biggest = numbers[i];
            }
        }

        System.out.println("The biggest number is: " + biggest);

        scanner.close();
    }
}