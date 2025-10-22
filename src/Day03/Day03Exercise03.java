public class Day03Exercise03 {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int aTimesB = 0;
        for (int i = 0; i < a; i++) {
            aTimesB += b;
        }
        System.out.println(a + " * " + b + " = " + aTimesB);

        int c = 5;
        int d = 6;
        int cTimesD = 0;
        for (int i = 0; i < c; i++) {
            cTimesD += d;
        }
        System.out.println(c + " * " + d + " = " + cTimesD);

        int product = 0;
        for (int i = 0; i < 7; i++) {
            product += 8;
        }
        System.out.println("7 * 8 = " + product);
    }
}
