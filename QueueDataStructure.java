.import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDataStructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

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
                    queue.add(numToAdd);
                    System.out.println(numToAdd + " added to the queue.");
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty, cannot remove.");
                    } else {
                        int removed = queue.poll();
                        System.out.println(removed + " removed from the queue.");
                    }
                    break;
                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue contents:");
                        for (int num : queue) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
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
