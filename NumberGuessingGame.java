import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomInt = new Random();

        int tryCounter = 0;
        int javaBotPick = numberGenerator(randomInt);

        System.out.println("Hello! I'm JavaBot. I'll pick a number between 1 - 100, and you'll guess it. Let's get started.");

        while (true) {
            System.out.print("Your guess: ");
            int userGuess = scanner.nextInt();
            tryCounter++;
        
            if (userGuess < javaBotPick) {
                System.out.println("Your guess is too low, go for a higher number.");
            } else if (userGuess > javaBotPick) {
                System.out.println("Your guess is too high, go for a lower number.");
            } else {
                System.out.println("Congrats! You've guessed the correct number!");
                break;
            }
        }

        System.out.println("Nicely done!\nYou've guessed correctly in " + tryCounter + " attemps.");

        scanner.close();
    }
    public static int numberGenerator(Random randomInt) {
        return randomInt.nextInt(100) + 1;
    }
}