public class Day03Exercise08Solution {

    public static int compute(int input) {
        int result = 1;
        for (int i = 0;
             i < input;
             i++) { // slightly unusual layout of a for loop
            if (i % 2 == 1) {
                result++;
            } else {
                result += helper(i);
            }
        }
        return result;
    }

    public static int helper(int x) {
        int r = 2*x + 1;
        return r;
    }

    public static void main(String[] args) {
        System.out.print("Hello! Please enter an int value: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int input = sc.nextInt();
        int res = compute(input);
        System.out.println("Result: " + res);
    }

    // a) For input 2, the code visits the following locations:
    //    22, 23, 24, 25, 26, 3, 4, 5, 6, 8, 11, 7, 17, 18, 19, 11, 6, 8, 9, 7, 6, 14, 26, 27, 28.
    //
    // b) For input 3, the code visits the following locations:
    //    22, 23, 24, 25, 26, 3, 4, 5, 6, 8, 11, 7, 17, 18, 19, 11, 6, 8, 9, 7, 6, 8, 11, 7, 17, 18, 19, 11, 6, 14, 26, 27, 28.
}
