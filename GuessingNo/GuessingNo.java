import java.util.Random;
import java.util.Scanner;

public class GuessingNo {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        int count=0;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("Guess a number between 1 and 100:");

        while (true) {
            guess = scanner.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Congratulations, you guessed the number!");
                count++;
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again:");
                count++;
            } else {
                System.out.println("Your guess is too high. Try again:");
                count++;
            }
        }

        System.out.println("The total score is: " + count);
        scanner.close();
    }
}