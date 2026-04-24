import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
        public static void main(String[] args) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            int number = random.nextInt(100) + 1; // Random number between 1 and 100
            int guess = 0;
            int attempts = 0;

            System.out.println("🎮 Welcome to Guess the Number Game!");
            System.out.println("Guess a number between 1 and 100");

            while (guess != number) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess > number) {
                    System.out.println("📉 Too high! Try again.");
                } else if (guess < number) {
                    System.out.println("📈 Too low! Try again.");
                } else {
                    System.out.println("🎉 Correct! You guessed the number.");
                    System.out.println("Total attempts: " + attempts);
                }
            }

            scanner.close();
        }
    }

