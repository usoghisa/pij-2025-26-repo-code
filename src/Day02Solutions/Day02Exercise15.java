import java.util.Scanner;

public class Day02Exercise15 {
    public static void main(String[] args) {
        System.out.println("Please enter a non-negative integer!");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        System.out.println("Please enter " + n + " integer values!");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        final String SEPARATOR = "; "; // to print between entries

        // Print array content from first to last position
        for (int i = 0; i < array.length; i++) {
            if (i > 0) { // make sure that SEPARATOR goes only /between/ values
                System.out.print(SEPARATOR);
            }
            System.out.print(array[i]);
        }
        System.out.println();

        // Print array content from last to first position
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(SEPARATOR);
            }
        }
        System.out.println();

        // Print array content at even positions (if any), then at odd positions
        // - first the even positions
        for (int i = 0; i < array.length; i += 2) { // note the increment!
            if (i > 0) {
                System.out.print(SEPARATOR);
            }
            System.out.print(array[i]);
        }
        // - then maybe a separator
        if (array.length >= 2) {
            // odd positions exist only from length 2 upward
            System.out.print(SEPARATOR);
        }
        // - finally the odd positions
        for (int i = 1; i < array.length; i += 2) {
            if (i > 1) {
                System.out.print(SEPARATOR);
            }
            System.out.print(array[i]);
        }
    }
}
