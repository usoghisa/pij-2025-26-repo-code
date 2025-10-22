import java.util.Scanner;

public class Day02Exercise02 {
    public static void main(String[] args) {
        // Write a program that reads two numbers from the user
        // and then offers a menu with the four basic
        // operations: addition, subtraction, multiplication,
        // and division. Once the user has selected an operation
        // from the menu, the calculator performs the operation.

        System.out.println("Please enter two numbers!");
        //java.util.Scanner scan = new java.util.Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        System.out.println("Please enter the operation symbol: +, -, *, or /");

        // take the '\n' from reading the double off the input stream; see
        // Day 1, Exercise 18 for an explanation /why/ we need to do this
        scan.nextLine();

        String operation = scan.nextLine();
        double result = -1;
        // What if the real result is -1?
        // What if the user types the wrong symbol?
        boolean inputOkay = true;
        final String ADDITION_SYMBOL = "+"; // avoid "magic String"!
        final String SUBTRACTION_SYMBOL = "-";
        final String MULTIPLICATION_SYMBOL = "*";
        final String DIVISION_SYMBOL = "/";

        // Remark: if you wrote operation.equals("+") and did not introduce
        // extra variables/constants for the symbols, this is okay for Day 2:
        // we had not talked about "magic numbers/values" yet. Here I am using
        // named constants instead, as a best practice.
        if (operation.equals(ADDITION_SYMBOL)) {
            result = x + y;
        } else if (operation.equals(SUBTRACTION_SYMBOL)) {
            result = x - y;
        } else if (operation.equals(MULTIPLICATION_SYMBOL)) {
            result = x * y;
        } else if (operation.equals(DIVISION_SYMBOL)) {
            result = x / y;
        } else {
            inputOkay = false;
        }

        // Possible alternative with a switch statement
        // (which we saw only on Day 3):

        /*
        switch (operation) {
            case ADDITION_SYMBOL:
                result = x + y;
                break;
            case SUBTRACTION_SYMBOL:
                result = x - y;
                break;
            case MULTIPLICATION_SYMBOL:
                result = x * y;
                break;
            case DIVISION_SYMBOL:
                result = x / y;
                break;
            default:
                inputOkay = false;
                break;
        }
        */
        if (inputOkay) {
            System.out.println(result);
        } else {
            System.out.println("I don't know the operation " + operation);
        }

        // Possible alternative to the if-else (from Day 3): use conditional
        // operator for the expression to print instead of the if-else
        // statement with two println instructions

        //System.out.println(inputOkay ? result : "I don't know the operation " + operation);
    }
}
