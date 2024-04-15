import java.util.Scanner;

public class SwapValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number, please: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number, please: ");
        int number2 = scanner.nextInt();

        System.out.println("The first values: ");
        System.out.println("number1: " + number1 + "\nnumber2: " + number2);

        int temporary = number1; // we're moving the value in the varible named 'number1' to the variable named 'temporary' (similar to backup)
        number1 = number2; // we've already moved the value in the variablr 'number1' to another variable so we can use 'number1' to store another value. Now we're setting number2's value as 'number1'.
        number2 = temporary; // lastly, we're moving the value in 'temporary' (which came from number1) to the variable name 'number2' to complete the swapping.

        System.out.println("\nThe swapped values: ");
        System.out.print("number1: " + number1 + "\nnumber2: " + number2);

        scanner.close();
    }
}