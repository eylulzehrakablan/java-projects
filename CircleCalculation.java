import java.util.Scanner;

public class CircleCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // double area, perimeter;
        double r; // 'r' stands for radius;

        while (true) {
            System.out.print("Please the radius value of the circle: ");
            if (scanner.hasNextDouble()) {
                r = scanner.nextDouble();
                break;
            } else {
                System.out.println("ERROR: you've entered an invalid value. Please enter a valid value.");
                scanner.next();
            }
        }

        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;

        System.out.println("Circle area: " + area + "\nCircle perimeter: " + perimeter);

        scanner.close();
    }
}
