import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        boolean isInputValid = false;
        String invalidInput;

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                isInputValid = true;
            } else {
                invalidInput = in.nextLine();
                System.out.println("You have entered a Invalid input. You have entered: " + invalidInput);
                System.out.println("Enter a valid number value.");
            }
        } while (!isInputValid);


        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);
    }
}