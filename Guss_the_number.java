import java.util.*;
public class Guss_the_number {
    public static void main(String[] args) {
        GuessTheNumber.guessingNumberGame();
    }

    public static class GuessTheNumber {
        public static void guessingNumberGame() {
            Scanner sc = new Scanner(System.in);

            int number = 1 + (int) (100 * Math.random());

            int attempts = 5;

            int guess;

            System.out.println("A number is chosen between 1 to 100.");
            System.out.println("Guess the number within " + attempts + " trials.");

            int i;
            for (i = 0; i < attempts; i++) {
                System.out.println("Guess the number:");
                guess = sc.nextInt();

                if (number == guess) {
                    System.out.println("Congratulations! You guessed the number.");
                    break;
                } else if (number > guess && i != attempts - 1) {
                    System.out.println("The number is greater than " + guess);
                } else if (number < guess && i != attempts - 1) {
                    System.out.println("The number is less than " + guess);
                }
            }

            if (i == attempts) {
                System.out.println("You have exhausted " + attempts + " trials.");
                System.out.println("The number was " + number);
            }
        }
    }
}
