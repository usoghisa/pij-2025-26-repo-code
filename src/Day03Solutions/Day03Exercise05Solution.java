public class Day03Exercise05Solution {

    // This method makes and returns a copy of the given array.
    // This is deliberately done manually rather than by using
    // System.arraycopy() or java.util.Arrays.copyOf() (which
    // are otherwise the more suitable solutions).
    public static int[] copy(int[] copyMe) {
        if (copyMe == null) { // Escape clause: handle special case first
            return null;
        }
        // From here on, we *know* that copyMe is not null.
        int resultLength = copyMe.length;
        int[] result = new int[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = copyMe[i];
        }
        return result;
    }
}
