import java.util.Scanner;

public class Day02Exercise04 {
    public static void main(String[] args) {
        System.out.println("Please enter two numbers!");
        //java.util.Scanner scan = new java.util.Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        int integerDivisionResult = x / y;
        int integerDivisionRemainder = x % y;
        double doubleDivisionResult = x / (double) y;

        System.out.println("Integer division result: " + integerDivisionResult);
        System.out.println("Integer division remainder: " + integerDivisionRemainder);
        System.out.println("Double division result: " + doubleDivisionResult);
    }
}
