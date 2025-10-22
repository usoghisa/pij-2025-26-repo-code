public class Day03Exercise02 {

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
}
