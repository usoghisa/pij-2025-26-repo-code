public class Day03Example3 {

    // This method increments both the int parameter and
    // the first element of the array by 1
    public static void increment(int[] array, int n) {
        n = n + 1;
        array[0] = array[0] + 1;
        array = null;
        System.out.println("  At the end of the method...");
        System.out.println("  The integer is " + n);
        System.out.println("  The array is " + array);
    }

    // Program execution starts here
    public static void main(String[] args) {
        int[] myArray = { 0 };
        int myInt = 0;
        System.out.println("The integer is now " + myInt);
        System.out.println("The array element is now " + myArray[0]);
        System.out.println("Calling method increment(int[], int)...");
        increment(myArray, myInt);
        System.out.println("The integer is now " + myInt);
        System.out.println("The array element is now " + myArray[0]);
    }
}
