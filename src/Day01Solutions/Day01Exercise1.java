public class Day01Exercise1 {
    public static void main(String[] args) {
        // The author's intention from the title "Ende homage" (hinting at
        // author Michael Ende's book "The neverending story") might have been
        // to make the loop run forever. The program will run very long indeed
        // (i == 11, 12, 13, 14, ... all make the loop condition true; only when
        // we exceed the maximum value that can be stored in an int and get a
        // /negative/ number for i will the loop exit -- more on this
        // limitation of int later). A more useful functionality could be to
        // let the loop count /down/ instead of up, printing a countdown from
        // 10 to 0. To achieve this, we could replace "i + 1" by "i - 1".
        int i = 11;
        while (i > 0) {
            i = i + 1;
            System.out.println(i);
        }
    }
}
