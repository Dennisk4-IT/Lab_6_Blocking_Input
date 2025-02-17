import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double recWidth = getValidDouble(in, "Enter Rectangle Width: ");
        double recHeight = getValidDouble(in, "Enter Rectangle Height: ");

        double recArea = recWidth * recHeight;
        double perimeter = 2 * (recWidth + recHeight);
        double recDiagonal = Math.sqrt((recWidth * recWidth) + (recHeight * recHeight));

        System.out.printf("Area: %.2f%n", recArea);
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Diagonal: %.2f%n", recDiagonal);
    }

    public static double getValidDouble(Scanner in, String prompt) {
        double value = 0;
        boolean isInputValid;
        String invalidInput;

        do {
            System.out.print(prompt);
            if (in.hasNextDouble()) {
                value = in.nextDouble();
                in.nextLine(); // Clear buffer
                if (value > 0) {
                    isInputValid = true;
                } else {
                    System.out.println("Enter a valid number.");
                    isInputValid = false;
                }
            } else {
                invalidInput = in.nextLine();
                System.out.println("You have entered a Invalid input. You have entered: " + invalidInput);
                isInputValid = false;
            }
        } while (!isInputValid);

        return value;
    }
}
