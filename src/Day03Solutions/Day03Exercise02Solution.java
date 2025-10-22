public class Day03Exercise02Solution {

    public static void printUnitMatrix(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }
                String s = (i == j) ? "1" : "0";
                System.out.print(s);
            }
            System.out.println();
        }
    }

    // scopes of different variables:
    // - i: from line 4 to line 13
    // - j: from line 5 to line 11
    // - size: from line 3 to line 14
    // - s: from line 9 to line 11
}
