import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer as the number of guesses you want: ");
        int guesses = scanner.nextInt();

        System.out.print("Enter an integer as the upper bound for the random number: ");
        int upperBound = scanner.nextInt();

        numberGuessingGame(guesses, upperBound);

        scanner.close();
    }

    public static void numberGuessingGame(int guesses, int upperBound) {
        int randomNumber = random.nextInt(upperBound) + 1;

        System.out.println("System has generated a random integer between 1 to " + upperBound + ", you have " + guesses + " guesses to find this number.");

        for (int attempt = 1; attempt <= guesses; attempt++) {
            System.out.print("Please enter your guess No. " + attempt + ": ");
            Scanner scanner = new Scanner(System.in);

            int userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                return;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
    }
}
