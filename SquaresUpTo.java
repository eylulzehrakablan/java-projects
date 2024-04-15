import java.util.Scanner;

public class SquaresUpTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int squaresUpTo = scanner.nextInt();

        System.out.println("Squares of number up to " + squaresUpTo + ": ");
        for (int i = 1; i <= squaresUpTo; i++) {
            int square = i * i;
            System.out.println(i + " * " + i + " = " + square);
        }

        scanner.close();
    }
}