.import java.util.Scanner;
import java.util.Stack;

public class StackDataStructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        while (true) {
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number to add: ");
                    int numToAdd = scanner.nextInt();
                    stack.push(numToAdd);
                    System.out.println(numToAdd + " added to the stack.");
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty, cannot remove.");
                    } else {
                        int removed = stack.pop();
                        System.out.println(removed + " removed from the stack.");
                    }
                    break;
                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack contents:");
                        for (int i = stack.size() - 1; i >= 0; i--) {
                            System.out.println(stack.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}