import java.util.Scanner;

public class Day02Exercise11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter some text: ");
        String input = scan.nextLine();

        // To make a palindrome, we take the original word and add its
        // "backward version" at the end. We can do the adding one character
        // at a time, starting at the last character and going backward.
        String result = input;

        // the last character of input is at position input.length() - 1,
        // and the first one is at position 0
        for (int i = input.length() - 1; i >= 0; i--) {
            result = result + input.charAt(i);
        }

        System.out.println(result);
    }
}
