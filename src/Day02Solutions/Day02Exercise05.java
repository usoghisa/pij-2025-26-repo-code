import java.util.Scanner;

public class Day02Exercise05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // First tell the user what they are supposed to do and read their input
        System.out.println("Please enter some text!");
        String input = scan.nextLine();

        System.out.println("*** Your input, one character per line ***");
        // Now we can print the input, one character at a time
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }

        System.out.println("*** Your input, one word per line ***");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ' ') {
                System.out.println(); // just go to a new line
            } else {
                System.out.print(ch);
            }
        }
        System.out.println(); // after the last word, go to a new line
    }
}
