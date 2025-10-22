public class Day03Exercise01 {
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
