import java.util.Scanner;

public class RectangleCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // double length, width, area, perimeter;

        System.out.print("Please enter rectangle's length: ");
        double length = scanner.nextDouble();

        System.out.print("Please enter rectangle's width: ");
        double width = scanner.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Rectangle's area: " + area);
        System.out.print("Rectangle's perimeter: " + perimeter);

        scanner.close();
    }
}