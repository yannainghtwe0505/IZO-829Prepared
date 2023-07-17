package DecisionMaking;

public class switchCase {
    public static void main(String[] args) {
        printDayOfWeek(2);

    }

    public static void printDayOfWeek(int day) {
        int c = 0;
        switch (day) {
        case 0 -> System.out.print("Sunday");
        // return;
        // break;
        case 2 -> System.out.print("Tuesday");
        default -> {
            System.out.print("Tuesday");
        }
        // break;
        case 1 -> System.out.print("Monday");
        // break;

        // break;

        }

    }

}
