import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter a string: ");
        String yourString = scanner.nextLine();
        
        int length = yourString.length();
        
        System.out.println("Length of the string is: " + length);

        scanner.close();
    }
}