import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gG = getValidDouble(in, "What is the number of gallons in the tank: ");
        double fuelEfficiency = getValidDouble(in, "What is the fuel efficiency in miles per gallon: ");
        double pPG = getValidDouble(in, "What is the price of gas per gallon: ");

        double miles100Cost = (100 / fuelEfficiency) * pPG;
        double totalDistance = gG * fuelEfficiency;

        System.out.printf("The cost to drive 100 miles: $%.2f%n", miles100Cost);
        System.out.printf("The car can go %.2f miles with a full tank.%n", totalDistance);
    }

    public static double getValidDouble(Scanner in, String prompt) {
        double inputValue = 0;
        boolean isInputValid;
        String invalidInput;

        do {
            System.out.print(prompt);
            if (in.hasNextDouble()) {
                inputValue = in.nextDouble();
                in.nextLine();
                if (inputValue > 0) {
                    isInputValid = true;
                } else {
                    System.out.println("Enter a positive number.");
                    isInputValid = false;
                }
            } else {
                invalidInput = in.nextLine();
                System.out.println("You have entered a Invalid input. You have entered: " + invalidInput);
                isInputValid = false;
            }
        } while (!isInputValid);

        return inputValue;
    }
}

