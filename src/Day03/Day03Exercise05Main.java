public class Day03Exercise05Main {

    public static boolean testReferencesDifferent(int[] xs, int[] ys) {
        return xs != ys;
    }

    public static boolean testLengthSame(int[] xs, int[] ys) {
        return xs.length == ys.length;
    }

    public static boolean testAllValuesSame(int[] xs, int[] ys) {
        for (int i = 0; i < xs.length; i++) {
            if (xs[i] != ys[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean testBothNull(int[] xs, int[] ys) {
        return xs == null && ys == null;
    }

    public static void main(String[] args) {
        int[] xs = { 1, 2, 3 };
        int[] ys = Day03Exercise05.copy(xs);
        System.out.println("testReferencesDifferent ok? "
                + testReferencesDifferent(xs, ys));
        System.out.println("testLengthSame ok? " + testLengthSame(xs, ys));
        System.out.println("testAllValuesSame ok? " + testAllValuesSame(xs, ys));

        int[] as = null;
        int[] bs = Day03Exercise05.copy(as);
        System.out.println("testBothNull ok? " + testBothNull(as, bs));
    }
}
