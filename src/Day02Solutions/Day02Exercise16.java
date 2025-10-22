import java.util.Scanner;

public class Day02Exercise16 {
    public static void main(String[] args) {
        System.out.println("Please enter a non-negative number!");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            // read value from user
            if (i == 1) {
                System.out.println("Please enter " + n + " number!");
            } else {
                System.out.println("Please enter " + n + " numbers!");
            }
            n--; // one fewer number to read
            int nextValue = scan.nextInt();

            // now we need to find where nextValue should be inserted
            // in the array
            boolean foundInsertPosition = false;
            int insertPosition = 0; // candidate position for insertion
            while (!foundInsertPosition && insertPosition < i) {
                if (array[insertPosition] > nextValue) {
                    foundInsertPosition = true;
                } else {
                    insertPosition++;
                }
            }

            // VERSION 1 (commented out)
            /*
            if (! foundInsertPosition) {
                // all values that are already in the array are at the
                // right place for now, so insert at i
                array[i] = nextValue;
            } else {
                // we need to "shift" at least one value that is already
                // in the array to the right; we start at i and go downwards

                for (int j = i; j > insertPosition; j--) {
                    array[j] = array[j-1]; // note: index j, not i!
                }
                array[insertPosition] = nextValue;
            }
             */

            // VERSION 2 (after refactoring to simplify the code)

            // if insertPositionFound is false, then insertPosition == i and
            // the following loop to shift the bigger numbers to the right
            // does nothing (which is what we want), otherwise we are in the
            // "else" case of VERSION 1
            for (int j = i; j > insertPosition; j--) {
                array[j] = array[j-1]; // note: index j, not i!
            }
            array[insertPosition] = nextValue;

            // print array up to and including position i
            for (int j = 0; j <= i; j++) {
                final String SEPARATOR = " ";
                if (j > 0) {
                    System.out.print(SEPARATOR);
                }
                System.out.print(array[j]);
            }
            System.out.println();
        }
    }
}
