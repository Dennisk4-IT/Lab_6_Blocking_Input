import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Random randomGen = new Random();
        int randomNum = randomGen.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);

        int guessofUser = 0;
        boolean isInputValid = false;

        do {
            System.out.print("Guess a number between 1 and 10: ");

            if (scanner.hasNextInt()) {
                guessofUser = scanner.nextInt();

                if (guessofUser >= 1 && guessofUser <= 10) {
                    isInputValid = true;
                } else {
                    System.out.println("Enter a number between 1 and 10.");
                }
            } else {
                scanner.next();
                System.out.println("You have entered a Invalid input. Enter an integer: ");
            }
        } while (!isInputValid);

        if (guessofUser == randomNum) {
            System.out.println("You did it! You guessed the correct number: " + randomNum);
        } else if (guessofUser < randomNum) {
            System.out.println("The guess you entered is low. The correct number was: " + randomNum);
        } else {
            System.out.println("The guess you entered is high. The correct number was: " + randomNum);
        }

        scanner.close();
    }
}
