public class Day03Exercise09Solution {

    public static void printPiJFor(Day d) {
        switch (d) {
            case MONDAY:
                System.out.println("Daytime class");
                break;
            case WEDNESDAY:
                System.out.println("Daytime class and evening class");
                break;
            case SATURDAY:
                System.out.println("Online help sessions");
                break;
            default:
                System.out.println("No teaching evening for PiJ");
        }
    }
}
