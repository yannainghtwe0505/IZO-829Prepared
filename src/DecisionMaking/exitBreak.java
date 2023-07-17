package DecisionMaking;

public class exitBreak {
    public static void main(String[] args) {

        printSeason(8);
        int counter = 0;

        while (counter < 10) {
            double price = counter * 10;
            System.out.println(price);
            counter++;
        }

    }

    enum Season {
        WINTER, SPRING, SUMMER, FALL
    }

    public static void printSeason(int month) {
        // final Date now=LocalDate.now();
        // final int cookies = getCookies();

        System.out.println();
        switch (month) {
        case 1, 2, 3:
            System.out.println("Winter");
        case 4, 5, 6:
            System.out.println("Spring");
        default:
            System.out.println("Unknown");
        case 7, 8, 9:
            System.out.println("Summer");
        case 10, 11, 12:
            System.out.println("Fall");
        }
    }

    String getWeather(Season value) {
        return switch (value) {
        case WINTER -> "Cold";
        case SPRING -> "Rainy";
        case SUMMER -> "Hot";
        case FALL -> "Warm";
        default -> "";
        };
    }
}
