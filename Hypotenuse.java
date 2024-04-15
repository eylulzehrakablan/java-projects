import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter the first side's length: ");
        double side1 = scanner.nextDouble();

        System.out.println("Please, enter the second side's length: ");
        double side2 = scanner.nextDouble();

        double hypotenuseSquared = (side1 * side1) + (side2 * side2);
        double hypotenuse = Math.sqrt(hypotenuseSquared);

        System.out.println("The hypotenuse's length is: " + hypotenuse);

        scanner.close();
    }
}
