
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final char QUIT_OPTION = 'q';

    private Random random;
    private Scanner scanner;

    public Main() {
        random = new Random();
        scanner = new Scanner(System.in);
    }

    public void playGame() {
        System.out.println("Welcome to Rock Paper Scissors!");

        while (true) {
            System.out.print("Enter your choice [r -> Rock, p -> Paper, s -> Scissors, q -> Quit]: ");
            char choice = scanner.nextLine().charAt(0);

            if (choice == QUIT_OPTION) {
                scanner.close(); // Close the scanner before exiting the program
                return;
            } else if (isValidChoice(choice)) {
                char pcChoice = generateComputerChoice();
                displayResult(choice, pcChoice);
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private boolean isValidChoice(char choice) {
        return choice == 'r' || choice == 'p' || choice == 's';
    }

    private char generateComputerChoice() {
        int pc = random.nextInt(3) + 1;
        switch (pc) {
            case 1:
                return 'r';
            case 2:
                return 'p';
            case 3:
                return 's';
            default:
                return 'r'; // Default to rock in case of unexpected value
        }
    }

    private void displayResult(char userChoice, char pcChoice) {
        System.out.println("Your choice: " + getChoiceName(userChoice));
        System.out.println("Computer's choice: " + getChoiceName(pcChoice));

        if (userChoice == pcChoice) {
            System.out.println("Draw!");
        } else if ((userChoice == 'r' && pcChoice == 's') ||
                (userChoice == 'p' && pcChoice == 'r') ||
                (userChoice == 's' && pcChoice == 'p')) {
            System.out.println("You Win!");
        } else {
            System.out.println("You Lost!");
        }
        System.out.println();
    }

    private String getChoiceName(char choice) {
        switch (choice) {
            case 'r':
                return "Rock";
            case 'p':
                return "Paper";
            case 's':
                return "Scissors";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        Main game = new Main();
        game.playGame();
    }
}
