import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            System.out.print("Enter the difficulty level (1 - 10) or enter 0 to exit: ");
            int diff = scanner.nextInt();

            if (diff == 0) {
                System.out.println("Thank you for playing. Goodbye!");
                break;
            } else if (diff > 10 || diff < 1) {
                System.out.print("Please enter a number between 1 and 10: ");
                scanner.nextLine(); // Clear the input buffer
                continue;
            }

            int maxNumber = diff * 10;
            System.out.println("Guess a number between 1 and " + maxNumber);

            int targetNumber = random.nextInt(maxNumber) + 1;
            int attempts = 0;

            while (true) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess > targetNumber) {
                    System.out.println("Too high! Guess lower.");
                } else if (guess < targetNumber) {
                    System.out.println("Too low! Guess higher.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    break;
                }
            }
        }

        scanner.close(); // Close the scanner before exiting the program
    }
}
