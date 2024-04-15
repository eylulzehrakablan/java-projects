import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! I'm JavaBot. Let's play Rock Paper Scissors.\nWhen I say 'shoot', Choose: rock, paper, or scissors.");
        System.out.println("rock - paper - scissors, shoot!");    
        String userChoice = scanner.next();
        String javaBotChoice = numberGenerator();
        String result = result(userChoice, javaBotChoice);

        printResult(userChoice, javaBotChoice, result);

        scanner.close();
    }

    //a method that JavaBot can pick one of rock, paaper & scissors

    public static String numberGenerator() {

        int randomInt = (int)(Math.random() * 3) + 1;

        switch (randomInt) {
            case 1: return "rock";
            case 2: return "paper";
            case 3: return "scissors";
            default: return " ";
        }
    }

    //a method that can checks who win

    public static String result(String userChoice, String javaBotChoice) {
        String result = " ";

        if ((userChoice.equals("rock") && javaBotChoice.equals("scissors")) || ((userChoice.equals("paper") && javaBotChoice.equals("rock"))) || ((userChoice.equals("scissors") && javaBotChoice.equals("paper")))) {
            result = "You win !!!";
        } else if ((userChoice.equals("rock") && javaBotChoice.equals("paper")) || ((userChoice.equals("scissors") && javaBotChoice.equals("rock"))) || ((userChoice.equals("paper") && javaBotChoice.equals("scissors")))) {
            result = "You lose !!!";
        } else if (userChoice.equals(javaBotChoice)) {
            result = "It'a a tie !!!";
        } else {
            System.out.println("ERROR: invalid choice");
            System.exit(0);
        }

        return result;
    }

    //a method that can print the choices and the result

    public static void printResult(String userChoice, String javaBotChoice, String result) {
        System.out.println("Your choice: " + userChoice);
        System.out.println("JavaBot's choice: " + javaBotChoice);
        System.out.print(result);
    }
}