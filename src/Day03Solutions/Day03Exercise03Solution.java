public class Day03Exercise03Solution {

    // method that just does the computation, but does not print on the screen
    // (useful on its own)
    public static int multiply(int a, int b) {
        int aTimesB = 0;
        for (int i = 0; i < a; i++) {
            aTimesB += b;
        }
        return aTimesB;
    }

    // keep the actual computation of the product and the printing separate
    // so that the computation can be done also without the printing
    public static void multiplyAndPrintProduct(int a, int b) {
        int aTimesB = multiply(a, b);
        System.out.println(a + " * " + b + " = " + aTimesB);
    }

    public static void main(String[] args) {
        multiplyAndPrintProduct(3, 4);
        multiplyAndPrintProduct(5, 6);
        multiplyAndPrintProduct(7, 8);
    }
}
