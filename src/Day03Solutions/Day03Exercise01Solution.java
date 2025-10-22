public class Day03Exercise01Solution {

    // The below code provides a check whether a person becomes an
    // adult in the year 2025, assuming that the threshold to
    // adulthood is to reach 18 years of age. The code uses a
    // conditional expression with ? : to compose the user-facing
    // answer as a String, with the result depending on whether the
    // person passes the check or not.

    public static void main(String[] args) {
        final int MIN_ADULT_YEARS = 18;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int currentYear = 2025;
        System.out.print("When were you born (year)? ");
        int birthYear = scanner.nextInt();
        int ageApprox = currentYear - birthYear;
        String result = (ageApprox >= MIN_ADULT_YEARS) ? "" : "not ";
        System.out.println("It seems you are " + result + "an adult.");
    }
}
