public class Day03Example2 {

    public static int add(int op1, int op2) {
        int result = op1 + op2;
        return result;
    }

    public static void doSomething() {
        int a = 5;
        int sum = add(a, 10);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        doSomething();
    }
}
