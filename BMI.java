import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter your weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Please, enter your height (m): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        String category;
        
        if (bmi < 18.5) {
            category = "You are underweight.";
        } else if (bmi < 24.9) {
            category = "Your body mass index is normal.";
        } else if (bmi < 29.9) {
            category = "You are overweight.";
        } else if (bmi < 34.9) {
            category = "You have light obesity.";
        } else if (bmi < 39.9) {
            category = "You have moderate obesity.";
        } else {
            category = "You have morbid obesity.";
        }

        System.out.println("Your BMI is: " + bmi + ". " + category);

        scanner.close();
    }
}