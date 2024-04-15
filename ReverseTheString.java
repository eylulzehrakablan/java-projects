import java.util.Scanner;

public class ReverseTheString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter any string value: ");
        String string = scanner.nextLine();

        String reversedString = reverseTheString(string);
        
        System.out.println("Here is the reversed version of your input: \n" + reversedString);

        scanner.close();
    }

    public static String reverseTheString(String string) {
        char[] charArray = string.toCharArray();

        int beginning = 0;
        int end = charArray.length - 1; 

        while (beginning < end) {
            char temporary = charArray[beginning];
            charArray[beginning] = charArray[end];
            charArray[end] = temporary;
            
            beginning++;
            end--;
        }
        return new String(charArray); //creating a new string with a char array (here it's named charArray) 
    }
}